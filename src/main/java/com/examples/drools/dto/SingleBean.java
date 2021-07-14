package com.examples.drools.dto;

import java.util.List;

public class SingleBean {

    String loanStatus;

    Double pendingBalance;

    private List<String> signalsList;

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
}
