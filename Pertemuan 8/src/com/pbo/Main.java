package com.pbo;

//class abstract
abstract class Hewan{
    public abstract void suaraHewan(); // abstract method (tidak memiliki body)

    public void tidur(){ // reguler
        System.out.println("Zzzz...");
    }
}

//subclass (turunan dari class hewan)
class Ayam extends Hewan {
    public void suaraHewan(){
        //body dari abstract method suaraHewan()
        //tulis disini
        System.out.println("Kukuruyuukkkkk...");
    }
}

class Kucing extends Hewan {
    public void suaraHewan(){
        //body dari abstract method suaraHewan()
        //tulis disini
        System.out.println("Meong.. meonggg...");
    }
}
public class Main {

    public static void main(String[] args) {
	Ayam ayamku = new Ayam();
	ayamku.suaraHewan();
	ayamku.tidur();

	Kucing kucingg = new Kucing();
	kucingg.suaraHewan();
	kucingg.tidur();
    }
}
