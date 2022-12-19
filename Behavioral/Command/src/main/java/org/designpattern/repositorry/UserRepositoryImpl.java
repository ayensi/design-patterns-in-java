package org.designpattern.repositorry;

import org.designpattern.model.User;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save(User user) {
        System.out.println("User saved!");
    }
}
