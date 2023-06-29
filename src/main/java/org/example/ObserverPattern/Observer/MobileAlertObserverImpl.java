package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{



    String phoneNumber;
    StockObservable observable;

    public MobileAlertObserverImpl(String phoneNumber, StockObservable observable) {
        this.phoneNumber = phoneNumber;
        this.observable = observable;
    }

    @Override
    public void update() {

        // Notify customer on phone about stock
        System.out.println("Sending message on : " + phoneNumber);

    }
}
