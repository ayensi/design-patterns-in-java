package org.designpattern;

import org.designpattern.subscription.Plan;
import org.designpattern.subscription.PlanFactory;
import org.designpattern.subscription.Plans;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();

        Plan plan = planFactory.getPlan(Plans.BASIC);

        System.out.println(plan.getPrice());

    }
}