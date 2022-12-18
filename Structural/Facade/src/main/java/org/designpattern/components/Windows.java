package org.designpattern.components;

import org.designpattern.contracts.Features;

public class Windows implements Features {
    @Override
    public void on() {
        System.out.println("Windows are open...");
    }

    @Override
    public void off() {
        System.out.println("Windows are closed...");
    }
}
