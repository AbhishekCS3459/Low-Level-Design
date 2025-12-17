package com.app.observerdesign.observer;

import com.app.observerdesign.observable.StockObservable;

public class SmsAlertObserverImpl implements NotificationAlertObserver {
    public String phoneNumber;

    StockObservable stockObservable;
    public SmsAlertObserverImpl(String phoneNumber, StockObservable stockObservable) {
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update(int oldStockCount,int newStockCount) {
        System.out.println("Sms send on mobile number"+" "+phoneNumber+" "+"old:"+oldStockCount+" "+"new:"+newStockCount);
    }
}
