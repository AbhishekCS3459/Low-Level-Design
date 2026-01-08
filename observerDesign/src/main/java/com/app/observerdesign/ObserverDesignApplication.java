package com.app.observerdesign;

import com.app.observerdesign.observable.IphoneObservableImpl;
import com.app.observerdesign.observable.StockObservable;
import com.app.observerdesign.observer.EmailAlertObserverImpl;
import com.app.observerdesign.observer.NotificationAlertObserver;
import com.app.observerdesign.observer.SmsAlertObserverImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignApplication {

    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1=new EmailAlertObserverImpl("abhishek@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2=new SmsAlertObserverImpl("6203390023",iphoneObservable);
        NotificationAlertObserver observer3=new SmsAlertObserverImpl("6203390024",iphoneObservable);

        // add observers to the observable list
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(100);
    }

}
