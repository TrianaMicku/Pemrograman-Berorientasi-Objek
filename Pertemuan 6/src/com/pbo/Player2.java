package com.pbo;

class Player{
    private String nama;

    Player(String nama){
        this.nama = nama;
    }

    void setName(String nama){
        this.nama = nama;
    }

    void show(){
        System.out.println("Player nama = " + this.nama);
    }
}
