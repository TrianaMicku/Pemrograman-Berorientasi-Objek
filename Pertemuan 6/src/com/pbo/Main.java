package com.pbo;

import java.util.*;

class Orang{
    private int _umur;
    private String _nama;
    private String golDarah;

    public Orang(){
        this._nama = "";
        this._umur = 0;
    }

    public String getGolDarah(){
       return golDarah;
    }

   public void setGolDarah(String golDarah){
       this.golDarah = golDarah;
   }

    public int getUmur(){
        return this._umur;
    }

    public void setUmur(int umur){
        this._umur = umur;
    }

    public String getNama(){
        return this._nama;
    }

    public void setNama(String nama){
        this._nama = nama;
    }
}

class Pegawai extends Orang{
    private String nip;
    private String jabatan;

    public Pegawai() {
        this.nip = "";
        this.jabatan = "";
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        /*Orang org = new Orang();

        String nama;
        int umur;
        System.out.print("Masukkan Nama : ");
        nama = inputUser.nextLine();
        org.setNama(nama);
        System.out.print("Nama : " + org.getNama());*/

        Pegawai peg = new Pegawai();
        String nama;
        int umur;
        String nip;
        String jabatan;
        String golDarah;

        System.out.print("Masukkan NIP : ");
        nip = inputUser.nextLine();

        System.out.print("Masukkan Nama : ");
        nama = inputUser.nextLine();

        System.out.print("Masukkan Golongan Darah : ");
        golDarah = inputUser.nextLine();

        System.out.print("Masukkan Umur : ");
        umur = inputUser.nextInt();

        System.out.print("Masukkan Jabatan : ");
        jabatan = inputUser.nextLine();

        System.out.println("-------------------------");

        peg.setNip(nip);
        peg.setNama(nama);
        peg.setGolDarah(golDarah);
        peg.setUmur(umur);
        peg.setJabatan(jabatan);

        System.out.println("NIP : " + peg.getNip());
        System.out.println("Nama : " + peg.getNama());
        System.out.println("Golongan Darah : " + peg.getGolDarah());
        System.out.println("Umur : " + peg.getUmur());
        System.out.println("Jabatan : " + peg.getJabatan());
    }
}
