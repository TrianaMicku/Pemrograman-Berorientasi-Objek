package com.pbo;

public class Kendaraan {
    private String merek;

    public Kendaraan(String merek){
        this.merek = merek;
    }

    //private tidak bisa diturunkan ke class/ dipanggil di class lain
    //protected bisa dipanggil ke class/ dipanggil di class lain
    protected String getMerek(){
        return merek;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }
}
