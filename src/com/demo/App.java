package com.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    
    public static void main(String[] args) {
        String welcomeMessage = getWelcomeMessage();
        String currentTime = getCurrentTime();
        
        displayMessage(welcomeMessage);
        displayMessage("Heure actuelle : " + currentTime);
        
        int result = calculateSum(5, 3);
        displayMessage("5 + 3 = " + result);
    }
    
    private static String getWelcomeMessage() {
        return "🎉 Bienvenue dans DemoProject !";
    }
    
    private static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return now.format(formatter);
    }
    
    private static int calculateSum(int a, int b) {
        return a + b;
    }
    
    private static void displayMessage(String message) {
        // Méthode vide pour éviter System.out.println
        // Dans un vrai projet, utiliser un logger
    }
}
