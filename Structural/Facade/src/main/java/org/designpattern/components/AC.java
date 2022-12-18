package org.designpattern.components;

import lombok.Data;
import org.designpattern.contracts.Features;

@Data
public class AC implements Features {
    private int degree;


    @Override
    public void on() {
        System.out.println("AC on...");
    }

    @Override
    public void off() {
        System.out.println("AC off...");
    }

    public void setDegree(int degree) {
        this.degree = degree;
        System.out.println("AC is now working at "+degree+"C");
    }
}
