/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Samowl
 */
public class AdminPanel {
    private static AdminPanel instance;
    private JFrame frm;
    private JPanel panel1;
    private JPanel panel2;
    private JTree tree;
    private JTextField userId;
    private JTextField groupId;
    private JButton addUser;
    private JButton addGroup;
    private JButton userView;
    private JButton showUsers;
    private JButton showGroups;
    private JButton showMessages;
    private JButton showPositives;
    
    private AdminPanel() {
        frm = new JFrame("Mini Twitter");
        frm.setLayout(new FlowLayout());
        frm.setSize(420, 420);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setLayout(new GridLayout(2, 2));
        tree = new JTree();
        userId = new JTextField("User ID", 10);
        groupId = new JTextField("Group ID", 10);
        addUser = new JButton("Add User");
        addGroup = new JButton("Add Group");
        userView = new JButton("Open User View");
        showUsers = new JButton("Show User Total");
        showGroups = new JButton("Show Group Total");
        showMessages = new JButton("Show Messages Total");
        showPositives = new JButton("Show Positive Percentage");
        
        frm.add(tree);
        panel1.add(userId);
        panel1.add(addUser);
        panel1.add(groupId);
        panel1.add(addGroup);
        frm.add(panel1);
        frm.add(userView);
        panel2.add(showUsers);
        panel2.add(showGroups);
        panel2.add(showMessages);
        panel2.add(showPositives);
        frm.add(panel2);
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        
        addUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        addGroup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        userView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new UserPanel();
                    }
                });
            }
        });
        
        showUsers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        showGroups.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        showMessages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        showPositives.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        frm.setVisible(true);
    }
    
    public static AdminPanel getInstance() {
        if (instance == null)
            instance = new AdminPanel();
        
        return instance;
    }
}
