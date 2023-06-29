package org.example.ObserverPattern;

import org.example.ObserverPattern.Observable.IphoneObservableImpl;
import org.example.ObserverPattern.Observable.StockObservable;
import org.example.ObserverPattern.Observer.EmailAlertObserverImpl;
import org.example.ObserverPattern.Observer.MobileAlertObserverImpl;
import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        // defining our observable i.e we want to track Iphone stock
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        // defining observers or connsumers who wants to get notified on stock change
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("9811722222",iphoneStockObservable);

        // adding observers that we want to notify on stock change
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        // Updating iphone stock , and this should notify all consumers since initial value is 0 i.e out of stock
        iphoneStockObservable.setStockCount(10);






    }


}
