
package raquel_martinez_planilla_de_empleado;

import java.util.Scanner;


public class Raquel_Martinez_Planilla_de_empleado {

    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String nombre_del_empleado = " ";
     System.out.println("----Boleta del empleado----");
     
     System.out.println("nombre del empleado:");
     nombre_del_empleado = scanner.nextLine();
    
     double tarifa_horas = 44.94;
     System.out.println("tarifa por horas:L"+ tarifa_horas );
     
     System.out.println("favor ingresar las horas trabajados en el mes");
     double horas = scanner.nextDouble();
     
     double salario_semanal = (tarifa_horas * horas) / 4;
     System.out.println("su salario semanal es de:L"+salario_semanal);
    }
    
}
