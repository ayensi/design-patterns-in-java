package org.designpattern.plan;

public class ExclusivePlan extends PlanDecorator{
    public ExclusivePlan(Plan plan) {
        super(plan);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 150;
    }
}
