package org.designpattern.components;

import lombok.Data;
import org.designpattern.contracts.Features;

@Data
public class TV implements Features {
    private int volume;
    private int brightness;

    @Override
    public void on() {
        System.out.println("TV is now on...");
    }

    @Override
    public void off() {
        System.out.println("TV is now off...");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("TV's brightness is "+brightness);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV's volume is set to "+volume);
    }
}
