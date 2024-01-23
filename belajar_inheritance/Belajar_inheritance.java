
package belajar_inheritance;


public class Belajar_inheritance {

    
    public static void main(String[] args) {
       BangunDatar bangunDatar = new BangunDatar();
       
       persegi persegi = new persegi();
       persegi.sisi=2;
       
       lingkaran lingkaran = new lingkaran();
       lingkaran.r = 22;
       
       PersegiPanjang persegiPanjang = new PersegiPanjang();
       persegiPanjang.panjang = 8;
       persegiPanjang.lebar = 4;
       
       segitiga segitiga = new segitiga();
       segitiga.alas = 12;
       segitiga.tinggi = 8;
       
       bangunDatar.luas();
       bangunDatar.keliling();
       
       persegi.luas();
       persegi.keliling();
       
       lingkaran.luas();
       lingkaran.keliling();
       
       segitiga.luas();
       segitiga.keliling();
       
       persegiPanjang.luas();
       persegiPanjang.keliling();
       
    }
    
}
