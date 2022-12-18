package org.designpattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Enemy implements Cloneable {
    private String name;
    private int health, power, level, mana;

    @Override
    public Enemy clone() {
        Enemy enemy = null;
        try{
            enemy = (Enemy) super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return enemy;
    }
}
