package com.pbo;

public class Contoh_ArrayIndexOutOfBoundExcetion {
    public static void main(String[] args) {
       try {
           int x[] = {20,20,40};
           System.out.println("Nilai : " + x[2]);

           int angka = 7;
           int hasil = angka/2;
           System.out.println(hasil);

           System.out.println("Pesan ini dicetak gak ya..");
       } catch (ArithmeticException e){
           System.out.println("Tidak Boleh Membagi Sebuah Bilangan dengan Nol");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Data Array Yang Ingin Ditampilkan Tidak Ada");
       }finally {
           System.out.println("Terima Kasih............");
       }
        System.out.println("Terima Kasih");
    }
}
//getMessage() untuk menampilkan pesan error