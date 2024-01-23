
package belajar_inheritance;


public class segitiga extends BangunDatar{
    
    
    float alas;
    float tinggi;
   
    @Override
   double luas() {
       double luas = (alas * tinggi * 1/2 );
        System.out.println("Luas Segitiga: " + luas);
        return luas;
   }
   double keliling() {
         double keliling = alas + alas + alas;
         System.out.println("keliling segitiga: " + keliling);
         return keliling;
         
       
   }
   
}
   
