package org.designpattern.impl;

import org.designpattern.contract.Enemy;

public class Skeleton implements Enemy {
    @Override
    public void fight() {
        System.out.println("Click bam!");
    }
}
