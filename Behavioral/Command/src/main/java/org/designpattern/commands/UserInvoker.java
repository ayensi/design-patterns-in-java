package org.designpattern.commands;

import org.designpattern.model.User;

public class UserInvoker implements Invoker{
    public Command command;
    public UserInvoker(Command command){
        this.command = command;
    }
    @Override
    public void execute(User user) {
        this.command.execute(user);
    }
}
