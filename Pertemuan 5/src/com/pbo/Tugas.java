package com.pbo;

import java.util.*;
class Mhs{
    String nama;
    String nim;
    String prodi;
    String angkatan;
}

public class Tugas {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Mhs  biodata = new Mhs();

        System.out.println("\nSilahkan isi biodata diri anda\n");
        System.out.print("Nama Lengkap : ");
        biodata.nama = inputUser.next();

        System.out.print("NIM : ");
        biodata.nim = inputUser.next();

        System.out.print("Program Studi : ");
        biodata.prodi = inputUser.next();

        System.out.print("Tahun Angkatan : ");
        biodata.angkatan = inputUser.next();


        System.out.println("\n------------------------------");
        System.out.println("Biodata Diri " + biodata.nama);
        System.out.println("------------------------------");
        System.out.println("Nama Lengkap : " + biodata.nama);
        System.out.println("NIM : " + biodata.nim);
        System.out.println("Program Studi : " + biodata.prodi);
        System.out.println("Tahun Angkatan : " + biodata.angkatan);
    }
}
