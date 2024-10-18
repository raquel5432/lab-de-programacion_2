/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raquel_martine_clics;

import java.util.Scanner;

/**
 *
 * @author Roy Martinez
 */
public class Raquel_Martine_clics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("favor ingresar la cantidad de clics 1:");
               double clics_1 = scanner.nextDouble();
       System.out.println("favor ingresar la cantidad de clics 2:");
               double clics_2 = scanner.nextDouble();
       System.out.println("favor ingresar la cantidad de clics 2:");
               double clics_3 = scanner.nextDouble();
               
        double precio1 = ( clics_1 / 60 ) * 0.30;
        double precio2 = ( clics_2 / 100 ) * 0.25;
        double precio3 = ( clics_3 / 20 ) * 0.80;
        
        double total = ( precio1 + precio2 + precio3 );
        double precio_total = total * 0.16;
        double precio = total + precio_total;
        
        
       System.out.println("su precio total por los clics es de: $"+ total );
       System.out.println("su tatal + 16%IVA es de:"+ precio);
                }
    
}
