
package boletin2.pkg5;

import java.util.Scanner;
        

public class Boletin25 {

    
  
    public static void main(String[] args) {
        double m, metros, Milla=1852;
        System.out.println("Introduzca las millas");
        Scanner dato=new Scanner(System.in);
        m=dato.nextDouble();
        metros=m*Milla;
        System.out.println(+m+ "son" +metros+ "metros");
        
        
    }
    
}
