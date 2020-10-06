package com.pbo;

public class Do_While_Loop {
    public static void main (String[] args){
    /* do {
            aksi
        } while (kondisi);
     */

        System.out.println("Mulai");
        int x = 0;
        boolean kondisi = true;

        do {
            x++;
            System.out.println("Do While Ke-" + x);
            if (x == 1) {
                kondisi = false;
            }
        }while(kondisi);
        System.out.println("Selesai");
    }
}
