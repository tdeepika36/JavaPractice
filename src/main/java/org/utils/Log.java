package org.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Armstrong;

public class Log {
    private static final Logger LOGGER= LogManager.getLogger(Armstrong.class);
    public static void info(String message){
        LOGGER.info(message);
    }
    public static void warn(String message) {
        LOGGER.warn(message);
    }
        public static void error(String message){
            LOGGER.error(message);
        }

        public static void debug(String message){
            LOGGER.debug(message);
        }


    }




