package org.designpattern.subscription;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ExclusivePlan implements Plan{

    @Override
    public int getPrice() {
        return 250;
    }
}
