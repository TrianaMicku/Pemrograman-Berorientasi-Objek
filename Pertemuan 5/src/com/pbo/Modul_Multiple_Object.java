package com.pbo;

public class Modul_Multiple_Object {

    /*class classku {
        //attribut
        public  int x = 5;//atribut ini boleh diambil secara langsung dari luar classku
        int y = 15;// atribut ini dapat diakses secara  langsung dari luar classku dalam 1 package
        private int z = 20;// atribut ini tidak boleh diakses secara langsung dari luar classku

        //method
        public int tampilkanZ(){
            return this.z;
        }*/

    public static void main(String[] args) {
	/*classku objku = new classku();
        System.out.println(objku.x);
        System.out.println(objku.y);
        System.out.println(objku.tampilkanZ());
      */
        Bilangan obil = new Bilangan();
        System.out.println("A : " + obil.tampilkanA());
        System.out.println("B : " + obil.tampilkanB());
        System.out.println("C : " + obil.tampilkanC());

        //nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput : " + obil.tampilkanA());

        obil.inputB(200);
        System.out.println("Nilai B setelah diinput : " + obil.tampilkanB());

        obil.inputC(300);
        System.out.println("Nilai C setelah diinput : " + obil.tampilkanC());

        //panggil method tambah()
        System.out.println("Hasil Pertambahan : " + obil.tambah());
        System.out.println("Hasil Perkurangan : " + obil.kurang());
        System.out.println("Hasil Perkalian : " + obil.kali());
        System.out.println("Hasil Pembagian : " + obil.bagi());
    }
}
