package org.designpattern.subscription;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PremiumPlan implements Plan{
    @Override
    public int getPrice() {
        return 500;
    }
}
