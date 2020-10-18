package com.pbo;

//Membuat class sebagai template
class Mahasiswa{
    String nama;
    String nim;
    String prodi;
    double IPK;
    int umur;
}

public class Pengenalan_Class_Object {
    public static void main(String[] args) throws Exception {

        // instansiasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ari";
        mahasiswa1.nim = "2019071026";
        mahasiswa1.prodi = "Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.prodi);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        System.out.println("--------------");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Ananda";
        mahasiswa2.nim = "2019071041";
        mahasiswa2.prodi = "Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.prodi);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
