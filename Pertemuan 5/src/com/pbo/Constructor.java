package com.pbo;

//Class tanpa constructor
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswaa{
    String nama;
    String nim;
    String prodi;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswaa(String inputNama, String inputNim, String inputProdi){
        nama = inputNama;
        nim = inputNim;
        prodi = inputProdi;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(prodi);
    }
}

public class Constructor {
    public static void main(String[] args) throws Exception {

        Mahasiswaa mahasiswa1 = new Mahasiswaa("Ari","2019071026","Informatika");
        System.out.println("------------");
        Mahasiswaa mahasiswa2 = new Mahasiswaa("Anayah","2019071006","Informatika");
    }
}
