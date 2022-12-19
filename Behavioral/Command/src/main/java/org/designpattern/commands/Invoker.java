package org.designpattern.commands;

import org.designpattern.model.User;

public interface Invoker {
    void execute(User user);
}
