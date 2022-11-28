package org.designpattern.subscription.plans.withads;

import lombok.NoArgsConstructor;
import org.designpattern.subscription.WithAds;
@NoArgsConstructor

public class Basic implements WithAds {
    @Override
    public int getPrice() {
        return 100;
    }
}
