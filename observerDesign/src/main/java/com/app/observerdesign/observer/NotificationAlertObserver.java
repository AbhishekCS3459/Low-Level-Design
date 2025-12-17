package com.app.observerdesign.observer;

public interface NotificationAlertObserver {
    public void update(int oldStockCount,int newStockCount);
}
