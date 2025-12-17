package com.app.observerdesign.observable;

import com.app.observerdesign.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserver>observers=new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int oldStockCount,int newStockCount) {
        // this will notify all the available observers present in the list
        for (NotificationAlertObserver observer : observers) {
            observer.update(oldStockCount,newStockCount);
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount!=newStockCount){
            notifyObservers(stockCount,newStockCount);
        }
        stockCount+=newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
