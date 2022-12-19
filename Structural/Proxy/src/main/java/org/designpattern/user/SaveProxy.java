package org.designpattern.user;

import java.util.ArrayList;
import java.util.List;

public class SaveProxy implements UserDAO{
    private UserDAO userDAO = new UserDAOImpl();

    private static List<String> bannedNames;

    static
    {
        bannedNames = new ArrayList<String>();
        bannedNames.add("swear");

    }
    @Override
    public void save(User user) throws Exception {
        if(bannedNames.contains(user.getName().toLowerCase())){
            throw new Exception("Restricted name!");
        }

        userDAO.save(user);
    }
}
