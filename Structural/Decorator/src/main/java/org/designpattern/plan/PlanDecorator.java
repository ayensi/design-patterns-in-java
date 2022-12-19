package org.designpattern.plan;

public class PlanDecorator implements Plan{
    private Plan plan;

    public PlanDecorator(Plan plan) {
        this.plan = plan;
    }


    @Override
    public int getPrice() {
        return this.plan.getPrice();
    }
}
