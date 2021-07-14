package com.examples.drools.domain;

import java.util.List;

public class SampleRequest {
    private String loanStatus;
    private Double pendingBalance;
    private String code;
    private List<String> signalsList;

    public SampleRequest(String loanStatus, Double pendingBalance) {
        this.loanStatus = loanStatus;
        this.pendingBalance = pendingBalance;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Double getPendingBalance() {
        return pendingBalance;
    }

    public void setPendingBalance(Double pendingBalance) {
        this.pendingBalance = pendingBalance;
    }

    public List<String> getSignalsList() {
        return signalsList;
    }

    public void setSignalsList(List<String> signalsList) {
        this.signalsList = signalsList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
