package org.designpattern.factory;

import org.designpattern.subscription.WithAds;
import org.designpattern.subscription.WithoutAds;
import org.designpattern.subscription.plans.withads.Basic;

public class WithAdsFactory extends AbstractFactory{

    @Override
    public WithAds getWithAds(String plan) {
        if(plan==null){
            return null;
        }

        if(plan.equalsIgnoreCase("BASIC")){
            return new Basic();
        }
        return null;
    }

    @Override
    public WithoutAds getWithoutAds(String plan) {
        return null;
    }
}
