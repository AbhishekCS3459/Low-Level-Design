package com.app.observerdesign.observer;

import com.app.observerdesign.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    public String email;
    StockObservable stockObservable;
    public EmailAlertObserverImpl(String email,StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update(int oldStockCount,int newStockCount) {
        System.out.println("Email send to email:"+email+" "+"old:"+oldStockCount+" "+"new:"+newStockCount);}
}
