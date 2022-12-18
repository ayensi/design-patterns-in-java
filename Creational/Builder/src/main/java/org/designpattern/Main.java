package org.designpattern;

import org.designpattern.model.Company;
import org.designpattern.model.User;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("OBSS");
        User user = new User.Builder().name("Okan").password("12345").age(23).company(company).build();
        System.out.println(user.toString());
    }
}