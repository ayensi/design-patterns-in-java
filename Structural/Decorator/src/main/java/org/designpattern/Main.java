package org.designpattern;

import org.designpattern.plan.BasicPlan;
import org.designpattern.plan.ExclusivePlan;
import org.designpattern.plan.Plan;
import org.designpattern.plan.PremiumPlan;

public class Main {
    public static void main(String[] args) {
        Plan plan = new BasicPlan();
        System.out.println(plan.getPrice());

        plan = new ExclusivePlan(plan);
        System.out.println(plan.getPrice());

        plan = new PremiumPlan(plan);
        System.out.println(plan.getPrice());

    }
}