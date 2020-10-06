package com.pbo;

public class Modul_Countinue {
    public static void main(String[] args) {
        System.out.print("--- For Loop ---\n");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n--- While Loop ---");
        int x = 0;
        while (x < 10) {
            if (x == 4) {
                x++;
                continue;
            }
            System.out.print(x + " ");
            x++;
        }
    }
}