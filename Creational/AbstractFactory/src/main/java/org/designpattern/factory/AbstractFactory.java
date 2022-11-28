package org.designpattern.factory;

import lombok.With;
import org.designpattern.subscription.WithAds;
import org.designpattern.subscription.WithoutAds;

public abstract class AbstractFactory {
    public abstract WithAds getWithAds(String plan);
    public abstract WithoutAds getWithoutAds(String plan);
}
