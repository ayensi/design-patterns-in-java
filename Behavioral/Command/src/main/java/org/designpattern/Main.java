package org.designpattern;

import org.designpattern.commands.Invoker;
import org.designpattern.commands.UserInvoker;
import org.designpattern.commands.UserSaveCommand;
import org.designpattern.model.User;
import org.designpattern.repositorry.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new UserInvoker(new UserSaveCommand(new UserRepositoryImpl()));
        User user = new User();
        user.setName("Okan");
        invoker.execute(user);
    }
}