package org.designpattern;

import org.designpattern.contract.Enemy;
import org.designpattern.impl.Archer;
import org.designpattern.impl.ArcherAdapter;
import org.designpattern.impl.Guardian;
import org.designpattern.impl.Skeleton;

public class Main {
    public static void main(String[] args) {
        Enemy enemy = new Skeleton();
        enemy.fight();

        enemy = new Guardian();
        enemy.fight();

        enemy = new ArcherAdapter(new Archer());
        enemy.fight();
    }
}