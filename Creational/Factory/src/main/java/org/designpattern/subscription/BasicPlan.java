package org.designpattern.subscription;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BasicPlan implements Plan{

    @Override
    public int getPrice() {
        return 125;
    }
}
