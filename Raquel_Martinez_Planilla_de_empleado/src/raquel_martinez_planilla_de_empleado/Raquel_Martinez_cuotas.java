package cuotas;

import java.util.Scanner;


public class Raquel_Martinez_cuotas {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("ingrese el monto a prestar:");
      double prestamo = scanner.nextDouble();
      
      System.out.println("**** CUOTAS MENSUALES *******");
      
      System.out.println("favor ingresar el porcentaje del inters");
      double interes = scanner.nextDouble();
      interes = (interes / 100) * prestamo;
      System.out.println("su total a pagar seria:L"+interes);
      
      System.out.println("favor ingresar en cuanto meses pagara:");
      double meses = scanner.nextDouble();
      double pago_mensual = interes / meses;
      
      System.out.println(" used al mes pagara:L" + pago_mensual);
      
              
      
    }
    
}
