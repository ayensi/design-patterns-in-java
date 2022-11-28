package org.designpattern.factory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("WithAds")){
            return new WithAdsFactory();
        } else if(choice.equalsIgnoreCase("WithoutAds")){
            return new WithoutAdsFactory();
        }
        return null;
    }
}
