package org.designpattern;

import org.designpattern.components.*;
import org.designpattern.facades.SmartHomeFacade;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade facade = new SmartHomeFacade(new AC(),new Windows(),new Curtains(),new Lights(), new TV());
        facade.sleepMode();
        System.out.println();
        facade.casualMode();
        System.out.println();
        facade.watchTVMode();
    }
}