package com.demo;

public class App {
    public static void main(String[] args) {
        int result = calculer();
        // Utilise le résultat si besoin
    }
    
    public static int calculer() {
        return 5 + 3;  // ✅ Cette méthode peut return
    }
}


/*
package com.demo;

public class App {
    public static void main(String[] args) {
        String variableInutile = "je ne sers à rien";  // 🐛 AJOUTÉ - Bug
        int result = calculer();
        System.out.println("Résultat: " + result);     // 🐛 AJOUTÉ - Code Smell
    }
    
    public static int calculer() {
        int x = 10;  // 🐛 AJOUTÉ - Variable inutilisée
        return 5 + 3;
    }
}
*/
