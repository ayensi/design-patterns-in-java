package org.designpattern.components;

import org.designpattern.contracts.Features;

public class Curtains implements Features {
    @Override
    public void on() {
        System.out.println("Curtains are now open...");
    }

    @Override
    public void off() {
        System.out.println("Curtains are now closed...");
    }
}
