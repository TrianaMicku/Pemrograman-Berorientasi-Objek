package com.pbo;
interface Luas{
    public void SetSisi(double...sisi);// untuk mendeklarasikan array dan mempersingkat penulisan yang ada di setsisi
    public double getLuas();
}
class LuasSegitiga implements Luas{
    private double alas;
    private double tinggi;

    @Override
    public void SetSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }
    @Override
    public double getLuas() {
        double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }
    public double getAlas() {
        return this.alas;
    }
    public double getTinggi() {
        return this.tinggi;
    }
}

public class Latihan3 {
    public static void main(String[] args){
        LuasSegitiga hasil = new LuasSegitiga();
        hasil.SetSisi(5,10);
        System.out.println("Luas Segitiga = 0.5 x " + hasil.getAlas() + " x " + hasil.getTinggi() + " = " + hasil.getLuas());
    }
}
