package org.designpattern.impl;

import org.designpattern.contract.Enemy;

public class Guardian implements Enemy {

    @Override
    public void fight() {
        System.out.println("Bam!");
    }
}
