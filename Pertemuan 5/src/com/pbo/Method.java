package com.pbo;

class Mahasiswa1{
    //Data Mahasiswa
    String nama;
    String nim;

    //Constructor => sebuah method khusus yang akan dipanggil saat object ini dibuat
    Mahasiswa1(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    //Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.nim);
    }

    //Method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //Method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }

    String getNim(){
        return this.nim;
    }

    //Method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Method {
    public static void main(String[] args) {
        Mahasiswa1 mahasiswa2 = new Mahasiswa1("Flo","20190710328");
        // method
        mahasiswa2.show();
        System.out.println("-----------");
        mahasiswa2.setNama("Rara");

        mahasiswa2.show();
        System.out.println("-----------");
        System.out.println(mahasiswa2.getNama());
        System.out.println(mahasiswa2.getNim());
        System.out.println("-----------");

        String data = mahasiswa2.sayHi("Cantik");
        System.out.println(data);
    }

}
