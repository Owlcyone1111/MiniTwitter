/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samowl
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
