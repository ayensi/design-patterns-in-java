package org.designpattern.components;

import org.designpattern.contracts.Features;

public class Lights implements Features {
    @Override
    public void on() {
        System.out.println("Lights on...");
    }

    @Override
    public void off() {
        System.out.println("Lights off...");
    }
}
