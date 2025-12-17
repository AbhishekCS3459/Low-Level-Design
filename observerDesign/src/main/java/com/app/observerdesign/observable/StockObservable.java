package com.app.observerdesign.observable;

import com.app.observerdesign.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObservers(int oldStockCount,int newStockCount);
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
