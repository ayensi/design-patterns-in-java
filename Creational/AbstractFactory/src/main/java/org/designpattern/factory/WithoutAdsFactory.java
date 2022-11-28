package org.designpattern.factory;

import org.designpattern.subscription.WithAds;
import org.designpattern.subscription.WithoutAds;
import org.designpattern.subscription.plans.withads.Basic;
import org.designpattern.subscription.plans.withoutads.Exclusive;
import org.designpattern.subscription.plans.withoutads.Premium;

public class WithoutAdsFactory extends AbstractFactory{
    @Override
    public WithAds getWithAds(String plan) {
        return null;
    }

    @Override
    public WithoutAds getWithoutAds(String plan) {
        if(plan==null){
            return null;
        }

        if(plan.equalsIgnoreCase("EXCLUSIVE")){
            return new Exclusive();
        }
        else if(plan.equalsIgnoreCase("PREMIUM")){
            return new Premium();
        }
        return null;
    }
}
