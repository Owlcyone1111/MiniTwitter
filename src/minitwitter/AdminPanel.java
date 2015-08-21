/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Samowl
 */
public class AdminPanel {
    private JFrame frm;
    private static AdminPanel instance;
    
    private AdminPanel() {
        frm = new JFrame("Mini Twitter");
        frm.setLayout(new FlowLayout());
        frm.setSize(420, 420);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    
    public static AdminPanel getInstance() {
        if (instance == null)
            instance = new AdminPanel();
        
        return instance;
    }
}
