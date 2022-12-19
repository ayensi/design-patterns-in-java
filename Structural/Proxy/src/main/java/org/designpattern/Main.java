package org.designpattern;

import org.designpattern.user.SaveProxy;
import org.designpattern.user.User;
import org.designpattern.user.UserDAO;
import org.designpattern.user.UserDAOImpl;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("swear");
        user.setPassword("1234");

        UserDAO userDAO = new SaveProxy();
        try{
            userDAO.save(user);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}