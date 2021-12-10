package com.nuwecash.api.dto;

public class MonthsGraficsDto {

    private String month;
    private double requestedMoney;
    private int totalUsers;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getRequestedMoney() {
        return requestedMoney;
    }

    public void setRequestedMoney(double requestedMoney) {
        this.requestedMoney = requestedMoney;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
}
