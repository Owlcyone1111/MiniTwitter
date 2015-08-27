/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Samowl
 */
public class User extends Subject implements Observer, Component {
    private String name;
    private Map<String, String> tweetFeed = new HashMap<String, String>();
    
    public User(String name) {
        this.name = name;
    }

    @Override // Update all observers with subject
    public void update(Subject subject) {
        if (subject instanceof User) {
            tweetFeed = ((User)subject).tweetFeed;
            notifyObservers();
        }
    }
    
    @Override
    public void add(Component component) {
        
    }

    @Override
    public void remove(Component component) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }
    
    public void addTweet(String tweet) {
        tweetFeed.put(this.getName(), tweet);
        notifyObservers();
    }
}
