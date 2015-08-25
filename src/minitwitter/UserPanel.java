/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Samowl
 */
public class UserPanel {
    JFrame frm;
    JScrollPane followingPane;
    JScrollPane feedPane;
    JList followingList;
    JList feedList;
    JTextField userId;
    JTextField tweet;
    JButton followUser;
    JButton postTweet;
    
    public UserPanel() {
        frm = new JFrame();
        frm.setLayout(new FlowLayout());
        frm.setSize(420, 420);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultListModel following = new DefaultListModel();
        followingList = new JList(following);
        followingPane = new JScrollPane(followingList);
        followingPane.setPreferredSize(new Dimension(120, 90));
        followingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultListModel tweets = new DefaultListModel();
        feedList = new JList(tweets);
        feedPane = new JScrollPane(feedList);
        feedPane.setPreferredSize(new Dimension(120, 90));
        feedList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        following.addElement("Owl");
        following.addElement("Chinchilla");
        System.out.println(following.getSize());
        
        userId = new JTextField("User ID", 10);
        tweet = new JTextField("Tweet Message", 10);
        followUser = new JButton("Follow User");
        postTweet = new JButton("Post Tweet");
        
        frm.add(userId);
        frm.add(followUser);
        frm.add(followingPane);
        frm.add(tweet);
        frm.add(postTweet);
        frm.add(feedPane);
        
        frm.setVisible(true);
    }
}
