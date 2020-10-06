package com.pbo;

public class Looping_Bersarang_kotak_segitiga {
    public static void main (String[] args) {

        //Program Looping Bersarang (Kotak - Segitiga)

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
            System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }
            System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
            System.out.print("\n");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }
            System.out.print("\n");

        for (int a = 0; a < 5; a++) {
            for (int j = 0; j < 5; j++) {
                if ((a + j) >= 4) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("\n");
        }
            System.out.print("\n");

        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ((i + j < 4) || (i - 5 == j) || (i - 6 == j) || (i - 7 == j) || (i - 8 == j)){
                    System.out.print("  ");
                }else if ((j - 5 == i) || (i + j > 12)) {
                    break;
                }else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}
