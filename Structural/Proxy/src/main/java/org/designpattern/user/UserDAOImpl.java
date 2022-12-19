package org.designpattern.user;

public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("User saved"+ user.getName());
    }
}
