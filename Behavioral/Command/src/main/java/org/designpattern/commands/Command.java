package org.designpattern.commands;

import org.designpattern.model.User;

public interface Command {
    void execute(User user);
}
