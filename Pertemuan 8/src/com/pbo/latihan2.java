package com.pbo;
//interface

interface Mamalia{
    //method
    public void tempatTinggal();
    public void tidur();
}
interface Makhluk{
    public void bernafas();
    public void bernama();
}
class Binatang implements Mamalia, Makhluk {
    @Override
    public void tempatTinggal() {
        System.out.println("Tempat tinggal : Air");
    }
    @Override
    public void tidur() {
        System.out.println("Zzzzz....");
    }
    @Override
    public void bernafas() {
        System.out.println("Insang");
    }
    @Override
    public void bernama() {
        System.out.println("Hwiiiyuuuuu");
    }
}
class Binatang2 implements Mamalia, Makhluk{
    @Override
    public void tempatTinggal() {
        System.out.println("Tempat tinggal : Darat");
    }
    @Override
    public void tidur() {
        System.out.println("aDA YanG MaRah gAK kALo aKU cHAt kAMu??.. ");
    }
    @Override
    public void bernafas() {
        System.out.println("Paru-Paru");
    }
    @Override
    public void bernama() {
        System.out.println("Buaya");
    }
}
public class latihan2 {
    public static void main(String[] args){
        Binatang hiu = new Binatang();
        hiu.bernama();
        hiu.bernafas();
        hiu.tempatTinggal();
        hiu.tidur();
        System.out.printf("\n");
        Binatang2 buaya = new Binatang2();
        buaya.bernama();
        buaya.bernafas();
        buaya.tempatTinggal();
        buaya.tidur();
    }
}
