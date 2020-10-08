package com.pbo;

public class Overloading_Method {
    public static void main (String[] args){

        int hasilInt;
        hasilInt = tambah(4,5);
        printAngka(hasilInt);

        float hasilFloat;

        hasilFloat = tambah(4.5f, 4);
        printAngka(hasilFloat);

        hasilFloat = tambah(4,4.5f);
        printAngka(hasilFloat);

        hasilInt = tambah(11,12,13);
        printAngka(hasilInt);

        printAngka(10);
        printAngka(10.5f);
        printAngka(16.7d);
        printAngka(16);
    }

    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static float tambah(int angkaInt2, float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }

    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(double angkaDouble){
        System.out.println("Angka Ini Adalah Double Dengan Nilai = " + angkaDouble);
    }

    private static void printAngka(float angkaFloat){
        System.out.println("Angka Ini Adalah Float Dengan Nilai = " + angkaFloat);
    }

    private static void printAngka(int angkaInteger){
        System.out.println("Angka Ini Adalah Integer Dengan Nilai = " + angkaInteger);
    }
}
