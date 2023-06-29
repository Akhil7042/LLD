package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {

        // Notify customer on email about stock
        System.out.println("Sending mail to: " + emailId);

    }
}
