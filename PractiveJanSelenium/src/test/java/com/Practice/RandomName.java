package com.Practice;

import java.util.Random;

public class RandomName {

    public static String generateRandomName() {
        String[] firstNames = {"John", "Alice", "Bob", "Emma", "David", "Sophia", "Michael", "Olivia"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};

        Random rand = new Random();
        String randomFirstName = firstNames[rand.nextInt(firstNames.length)];
        String randomLastName = lastNames[rand.nextInt(lastNames.length)];

        return randomFirstName + " " + randomLastName;
    }

    
}

