package org.designpattern;

import org.designpattern.logger.Logger;

public class Main {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            Logger logger = Logger.getLogger();

            logger.log("Singleton test "+i);
        }

    }
}