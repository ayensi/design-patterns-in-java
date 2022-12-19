package org.designpattern.plan;

public class PremiumPlan extends PlanDecorator{
    @Override
    public int getPrice() {
        return super.getPrice() + 300;
    }

    public PremiumPlan(Plan plan) {
        super(plan);
    }
}
