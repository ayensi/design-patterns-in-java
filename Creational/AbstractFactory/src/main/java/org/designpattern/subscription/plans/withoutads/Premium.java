package org.designpattern.subscription.plans.withoutads;

import lombok.NoArgsConstructor;
import org.designpattern.subscription.WithoutAds;
@NoArgsConstructor

public class Premium implements WithoutAds {
    @Override
    public int getPrice() {
        return 500;
    }
}
