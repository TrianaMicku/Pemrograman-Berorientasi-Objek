package com.pbo;

public class Operator_Komparasi {
    public static void main(String[] args){

        //Operator Komparasi ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        //Operator Equal / Persamaan
        System.out.println("----- Persamaan");
        a = 20;
        b = 20;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d -> %s \n", a,b,hasilKomparasi);

        a = 22;
        b = 20;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d -> %s \n", a,b,hasilKomparasi);

        //Operator Not Equal / Pertidaksamaan
        System.out.println("----- Pertidaksamaan");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d -> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d -> %s \n", a,b,hasilKomparasi);

        //Operator Less Than Equal/ Kurang Dari Sama Dengan
        System.out.println("----- Kurang Dari Sama Dengan");
        a = 20;
        b = 22;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d -> %s \n", a,b,hasilKomparasi);

        a = 20;
        b = 20;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d -> %s \n", a,b,hasilKomparasi);

        a = 22;
        b = 20;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d -> %s \n", a,b,hasilKomparasi);

        //Operator Greater Than Equal/ Lebih Dari Sama Dengan
        System.out.println("----- Lebih Dari Sama Dengan");
        a = 20;
        b = 22;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d -> %s \n", a,b,hasilKomparasi);

        a = 20;
        b = 20;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d -> %s \n", a,b,hasilKomparasi);

        a = 22;
        b = 20;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d -> %s \n", a,b,hasilKomparasi);

    }
}
