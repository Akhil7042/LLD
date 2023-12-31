package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}
