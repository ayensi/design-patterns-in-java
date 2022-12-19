package org.designpattern.commands;

import org.designpattern.model.User;
import org.designpattern.repositorry.UserRepository;

public class UserSaveCommand implements Command{
    private UserRepository userRepository;

    public UserSaveCommand(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void execute(User user) {
        userRepository.save(user);
    }
}
