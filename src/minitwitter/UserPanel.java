/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Samowl
 */
public class UserPanel {
    private User user;
    private User selectedUser;
    private JFrame frm;
    private JScrollPane followingPane;
    private JScrollPane feedPane;
    private JList followingList;
    private JList feedList;
    private JTextField userId;
    private JTextField tweet;
    private JButton followUser;
    private JButton postTweet;
    
    public UserPanel(User user) {
        this.user = user;
        
        frm = new JFrame();
        frm.setLayout(new FlowLayout());
        frm.setSize(420, 420);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultListModel following = new DefaultListModel();
        followingList = new JList(following);
        followingPane = new JScrollPane(followingList);
        followingPane.setPreferredSize(new Dimension(120, 100));
        followingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultListModel tweets = new DefaultListModel();
        feedList = new JList(tweets);
        feedPane = new JScrollPane(feedList);
        feedPane.setPreferredSize(new Dimension(120, 100));
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
        
        followingList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                
            }
        });
        
        feedList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                
            }
        });
        
        followUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                
            }
        });
        
        postTweet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tweets.addElement(tweet.getText());
            }
        });
        
        frm.setVisible(true);
    }
    
    public void populateFollowing() {

    }
    
    public void populateFeed() {
        
    }
}
