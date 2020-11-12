package com.pbo;

import java.util.Scanner;

abstract class Hitung{
    Scanner input = new Scanner(System.in);
    int alas;
    int tinggi;
    int r;
    double rumus;
    public abstract void Luas();

    public void hasil(){
        System.out.println("Program Menghitung Luas Lingkaran & Segitiga");
    }
}
class Segitiga extends Hitung {

    public void Luas(){
        System.out.println("Hitung Luas Segitiga");
        System.out.print("-> Masukkan Alas    : ");
        alas = input.nextInt();
        System.out.print("-> Masukkan Tinggi  : ");
        tinggi = input.nextInt();
    }
    public void hitungSegitigas(){
        rumus = 0.5 * alas * tinggi;
        System.out.print("=> Luas Segitiga adalah 0.5 x " + alas + " x " + tinggi + " : " + rumus +" cm2");
        System.out.print("\n");
    }
}
class Lingkaran extends Hitung {
    public void Luas(){
        System.out.println("Hitung Luas Lingkaran");
        System.out.print("-> Masukkan Diameter : ");
        r = input.nextInt();
    }
    public void hitungLingkaran(){
        rumus = 3.14 * r * r;
        System.out.println("=> Luas Lingkaran adalah 3.14 x " + r + " x " + r + " : " + rumus +" cm2" );
    }
}
public class Latihan {
    public static void main(String[] args) {
        Segitiga segi = new Segitiga();
        segi.hasil();
        segi.Luas();
        segi.hitungSegitigas();
        Lingkaran ling = new Lingkaran();
        ling.Luas();
        ling.hitungLingkaran();
    }
}
