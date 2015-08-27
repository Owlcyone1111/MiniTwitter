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
import java.util.List;
import java.util.ArrayList;
import javax.swing.event.*;


/**
 *
 * @author Samowl
 */
public class AdminPanel {
    private static AdminPanel instance;
    private List<User> users = new ArrayList<User>();
    private List<Group> groups = new ArrayList<Group>();
    private JFrame frm;
    private JPanel panel1;
    private JPanel panel2;
    private JTree tree;
    private TreePath tp;
    private DefaultTreeModel model;
    private DefaultMutableTreeNode root; 
    private DefaultMutableTreeNode current;
    private User selectedUser;
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
        userId = new JTextField("User ID", 10);
        groupId = new JTextField("Group ID", 10);
        addUser = new JButton("Add User");
        addGroup = new JButton("Add Group");
        userView = new JButton("Open User View");
        showUsers = new JButton("Show User Total");
        showGroups = new JButton("Show Group Total");
        showMessages = new JButton("Show Messages Total");
        showPositives = new JButton("Show Positive Percentage");
        
        // Initialize model
        for (Group g : groups) {
            // Add every group to root node
            DefaultMutableTreeNode currentGroup = new DefaultMutableTreeNode(g);
            root.add(currentGroup);
            
            // Add every user to group
            for (User u : g.getUsers()) {
                currentGroup.add(new DefaultMutableTreeNode(u));
            }
        }
        
        root = new DefaultMutableTreeNode("Root");
        model = new DefaultTreeModel(root);
        tree = new JTree(model);
        tree.setEditable(true);
        TreeSelectionModel tsm = tree.getSelectionModel();
        tsm.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        
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
        
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
//                tp = tse.getPath(); // Get the path to the selection.
//                System.out.println(tp.getLastPathComponent()); // Display the selected node.
                current = (DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
            }
        });
        
        addUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (current != null) {
                    current.add(new DefaultMutableTreeNode(new User(userId.getText())));
                    tree.updateUI();
                    tree.expandPath(tree.getSelectionPath());
                }
            }
        });
        
        
        addGroup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (current != null) {
                    current.add(new DefaultMutableTreeNode(new Group(groupId.getText())));
                    tree.updateUI();
                    tree.expandPath(tree.getSelectionPath());
                }
            }
        });
        
        userView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new UserPanel(selectedUser);
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
