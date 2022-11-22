package org.designpattern.subscription;

public class PlanFactory {
    public Plan getPlan(Plans planType) {
        if (planType == null) {
            return null;
        }

        switch (planType) {
            case BASIC -> {
                return new BasicPlan();
            }
            case EXCLUSIVE -> {
                return new ExclusivePlan();
            }
            case PREMIUM -> {
                return new PremiumPlan();
            }
        }

        return null;
    }

}
