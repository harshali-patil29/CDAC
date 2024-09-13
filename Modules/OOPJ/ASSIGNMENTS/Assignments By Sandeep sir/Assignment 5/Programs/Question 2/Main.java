package org.example.logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        //messages
        logger.log("Program started...");
        logger.log("Doing some things...");
        logger.log("End of program...");

        System.out.println("Log Messages:");
        System.out.println(logger.getLog());

        logger.clearLog();
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());
    }
}

