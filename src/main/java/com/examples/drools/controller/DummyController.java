package com.examples.drools.controller;

import com.examples.drools.domain.SampleRequest;
import com.examples.drools.dto.SingleBean;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;

@RestController
public class DummyController {

    private final KieContainer kieContainer;

    public DummyController(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @RequestMapping(value = "/getFDInterestRate", method = RequestMethod.POST, produces = "application/json")
    public SampleRequest getQuestions(@RequestBody SingleBean singleBean) {
        KieSession kieSession = kieContainer.newKieSession();
        SampleRequest sRequest = new SampleRequest(singleBean.getLoanStatus(),singleBean.getPendingBalance());
        sRequest.setSignalsList(singleBean.getSignalsList());
        kieSession.insert(sRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return sRequest;
    }
}
