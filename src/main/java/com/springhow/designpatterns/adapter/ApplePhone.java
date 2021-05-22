package com.springhow.designpatterns.adapter;

public class ApplePhone {

    private AppleCharger charger;

    public void plugAppleCharger(AppleCharger charger) {
        System.out.println("Charger plugged into your Apple Phone");
        this.charger = charger;
    }

    public void charge() {
        System.out.println("Charging your Apple phone");
        this.charger.chargeApplePhones();
    }
}
