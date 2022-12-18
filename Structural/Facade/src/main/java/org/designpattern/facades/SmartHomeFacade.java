package org.designpattern.facades;

import org.designpattern.components.*;

public class SmartHomeFacade {
    private AC ac;
    private Windows windows;
    private Curtains curtains;
    private Lights lights;
    private TV tv;

    public SmartHomeFacade(AC ac, Windows windows, Curtains curtains, Lights lights, TV tv) {
        this.ac = ac;
        this.windows = windows;
        this.curtains = curtains;
        this.lights = lights;
        this.tv = tv;
    }

    public void sleepMode(){
        ac.on();
        ac.setDegree(25);
        windows.off();
        curtains.off();
        lights.off();
        tv.off();
    }

    public void watchTVMode(){
        tv.on();
        tv.setBrightness(100);
        tv.setVolume(25);
        lights.off();
        curtains.off();
    }

    public void casualMode(){
        ac.off();
        windows.on();
        curtains.on();
    }
}
