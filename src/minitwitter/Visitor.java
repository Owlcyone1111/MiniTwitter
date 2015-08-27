/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

/**
 *
 * @author Samowl
 */
public interface Visitor {
    public void visitUser(User user);
    public void visitGroup(Group group);
}
