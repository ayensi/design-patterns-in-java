package org.designpattern;

import org.designpattern.factory.AbstractFactory;
import org.designpattern.factory.FactoryCreator;
import org.designpattern.subscription.WithAds;
import org.designpattern.subscription.WithoutAds;

public class TestMain {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryCreator.getFactory("WithAds");
        WithAds withAds = factory.getWithAds("BASIC");
        System.out.println(withAds.getPrice());

        AbstractFactory newFactory = FactoryCreator.getFactory("WithoutAds");
        WithoutAds withoutAds = newFactory.getWithoutAds("PREMIUM");
        System.out.println(withoutAds.getPrice());
    }
}
