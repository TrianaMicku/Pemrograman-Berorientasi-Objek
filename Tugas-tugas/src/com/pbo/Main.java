package com.pbo;

import java.util.Scanner;

class Orang{
    private String nm;
    private String golDarah;
    private int umur;

    public void setNama(String nama){
        this.nm = nama;
    }
    public void setGolDarah(String golDarah){
        this.golDarah = golDarah;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    //-----------------------------------------//
    public String getNama (){
        return this.nm   ;
    }
    public String getGolDarah (){
        return golDarah;
    }
    public int getUmur (){
        return this.umur;
    }
}

class Pegawai extends Orang {
    int gol;
    int jam;
    String nip;
    String jabatan;

    public int getGol() {
        return gol;
    }
    public int getJam() {
        return jam;
    }
    public String getNip() {
        return nip;
    }
    public String getJabatan() {
        return jabatan;
    }
    //-----------------------------------------//
    public void setGol(int gol) {
        this.gol = gol;
    }
    public void setJam(int jam) {
        this.jam = jam;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    //-----------------------------------------//
    public static double persen_(double a, int b){
        return a / b;
    }
    //-----------------------------------------//

    void gaji() {
        int G_pokok = 0;
        int tnjg= 0;
        double Pajak;
        int G_lembur;
        int ttl_Gaji;
        int leMbur;


        if (gol == 1){
            G_pokok = 1486500;
            tnjg = 250000;

        }if (gol == 2){
            G_pokok = 1926000;
            tnjg = 300000;

        }if (gol == 3){
            G_pokok = 2456700;
            tnjg = 350000;

        }if (gol == 4){
            G_pokok = 2899500;
            tnjg = 400000;

        }if (jam <= 173){
            leMbur = 0;
            System.out.println("Maaf Anda Tidak Mendapat Uang Lembur");
        }else{
            leMbur = jam - 173;
        }

        G_lembur = leMbur * 20000;
        ttl_Gaji = G_pokok + tnjg + G_lembur;
        double P_Pajak = persen_(0.5, 100) * ttl_Gaji;

        System.out.println("Gaji Pokok  Rp " + G_pokok);
        System.out.println("Tunjangan   Rp " + tnjg);
        System.out.println("Gaji Lembur Rp " + G_lembur);

        Pajak = ttl_Gaji - P_Pajak;
        System.out.println("Total Gaji  Rp " + Pajak);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pegawai peg = new Pegawai();

        int umur;
        int gol;
        int jam;
        String nm;
        String nip;
        String jabatan;
        String golDarah;

        System.out.print("\n---Silahkan Isi Biodata Diri Anda---\n");

        System.out.print("Nama : ");
        nm = input.nextLine();
        peg.setNama(nm);

        System.out.print("Nomor Induk Penduduk(NIP) : ");
        nip = input.nextLine();
        peg.setNip(nip);

        System.out.print("Jabatan : ");
        jabatan = input.nextLine();
        peg.setJabatan(jabatan);

        System.out.print("Golongan Darah : ");
        golDarah = input.nextLine();
        peg.setGolDarah(golDarah);

        System.out.print("Umur : ");
        umur = input.nextInt();
        peg.setUmur(umur);

        System.out.print("Jam kerja : ");
        jam = input.nextInt();
        peg.setJam(jam);

        System.out.print("Golongan Pekerja : ");
        gol = input.nextInt();
        peg.setGol(gol);

        System.out.println("------------------------------------");
        System.out.print(peg.getNama() + " ");
        System.out.print("(" + peg.getNip() + "), ");
        System.out.print("menjabat sebagai " + peg.getJabatan() + ", ");
        System.out.print("golongan darah " + peg.getGolDarah()+ ", ");
        System.out.print(peg.getUmur() + " tahun, ");
        System.out.print("bekerja " + peg.getJam() + " jam, ");
        System.out.print("golongan " + peg.getGol() + ".\n\n");
        peg.gaji();
    }
}
