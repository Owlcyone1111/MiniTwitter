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
public class Group implements Component {
    private String groupName;
    private List<User> users = new ArrayList<User>();

    @Override
    public void add(Component component) {
        users.add((User)component);
    }

    @Override
    public void remove(Component component) {
        users.remove((User)component);
    }
    
    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
