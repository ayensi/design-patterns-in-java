package org.designpattern.impl;

import org.designpattern.contract.Enemy;

public class ArcherAdapter implements Enemy {
    private Archer archer;
    public ArcherAdapter(Archer archer){
        this.archer = archer;
    }
    @Override
    public void fight() {
        archer.shoot();
    }
}
