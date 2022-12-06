package org.designpattern.logger;

public class Logger {
    private static volatile Logger logger = null;

    private static Object lock = new Object();

    private Logger(){
        System.out.println("Logger instantiated...");
    }

    public static Logger getLogger(){
        if(logger==null){
            synchronized (lock){
                if(logger==null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message){
        System.out.println(message);
    }
}
