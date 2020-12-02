package com.pbo;
import java.util.Arrays;
import java.util.Scanner;

class Angka{
    private int [] bil;
    public Angka(int jmlBil){
        bil = new int [jmlBil];
    }
    public void tambahBil(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data :");
        for (int x = 0; x < this.bil.length; x++) {
            System.out.print("Data " + (x+1) + ": ");
            this.bil[x] = input.nextInt();
        }
    }
    public void cariBil(String cariBil){
        Scanner input = new Scanner(System.in);
        System.out.print("\nIngin Mencari Data [Y/T] ? ");
        String jwb = input.nextLine();
        if (jwb.equals("Y")||jwb.equals("y")){
            boolean result = false;
            System.out.print("\nMasukkan Data Yang Ingin Dicari : ");
            int z = input.nextInt();
            for (int x = 0; x < this.bil.length; x++){
                if (z == bil[x]){
                    System.out.println("--------------------------------------------");
                    System.out.println("Data " + z + " Ditemukan!");
                    System.out.println(z + " Berada diindeks ke-" + x);
                    result = true;
                    System.out.println("--------------------------------------------");
                }
            }
            if(result == false){
                System.out.println("Maaf, Data " + z + " Tidak Ditemukan");
            }
        }
    }
    public void tampilBil() {
        System.out.println("--------------------------------------------");
        System.out.print("Data Array" + ": ");
        for (int x = 0; x < this.bil.length; x++) {
            System.out.print(this.bil[x] + " ");
        }
        //System.out.println("\nJumlah Data Array : " + this.bil.length);
    }
}
public class Tugas_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t\t\t Selamat Datang!");
        System.out.println("Aplikasi Pencarian Bilangan Menggunakan Array");
        System.out.println("--------------------------------------------");
        System.out.print("Ingin Menginput Data [Y/T] ? ");
        String jwb1 = input.nextLine();
        if(jwb1.equals("Y")||jwb1.equals("y")){
            System.out.print("Masukkan Jumlah Data : ");
        }else{
            System.out.println("Anda Keluar Dari Aplikasi, Sampai Jumpa!");
        }

        int jmlBil = input.nextInt();
        Angka arr = new Angka(jmlBil);
        arr.tambahBil();
        arr.tampilBil();
        arr.cariBil("");
    }
}
