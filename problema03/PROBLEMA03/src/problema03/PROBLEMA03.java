/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author LEGION
 */
public class PROBLEMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
       String nombre;
       int tipo;
       int anio;
       double salario;
       double subsalario;
       double salariofinal;
       int tipoem;
       double bono;
       String porcentaje;
       salario= 0;
       System.out.println("Nombre del empleado: ");
       nombre= entrada.nextLine();
       System.out.println("Tipo del empleado: ");
       tipo=entrada.nextInt();
       System.out.println("Anios de servicio:");
       anio= entrada.nextInt();
       System.out.println("Salario del empleado: ");
       salario= entrada.nextDouble();
       switch(tipo){
           case 1:
               subsalario= salario * 0.05;
               tipoem= 1;
               porcentaje= "5%";
               break;
           case 2:
               subsalario= salario * 0.07;
               tipoem= 2;
               porcentaje= "7%";
               break;
           case 3:
               subsalario= salario * 0.09;
               tipoem= 3;
               porcentaje= "9%";
               break;
           case 4:
               subsalario= salario * 0.12;
               tipoem= 4;
               porcentaje= "12%";
               break;
           case 5:
               subsalario= salario* 0.15;
               tipoem= 5;
               porcentaje= "15%";
               break;
           default:
               subsalario= salario* 0.15;
               tipoem= tipo;
               porcentaje= "15%";
               
       }
        if (anio < 2) {
            bono = 0;
            salariofinal = subsalario + salario + bono;
        } else {
            if (anio < 5) {
                bono = 30;
                salariofinal = subsalario + salario + bono;
            } else {
                if (anio < 10) {
                    bono = 60;
                    salariofinal = subsalario + salario + bono;
                } else {
                    bono = 100;
                }
                salariofinal = subsalario + salario + bono;
                }
        }
        System.out.printf("REPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\nTipo de empleado: %d\n"
                + "Años de servicio: %d\n\nSueldo inicial= $%.2f\n"
                + "Porcentaje de incremento: %s\nIncremento salarial: $%.2f\n"
                + "Bonificacion por antigüedad: $%.2f\n\nNuevo sueldo:"
                + " $%.2f", nombre, tipoem, anio, salario, porcentaje, subsalario,
                 bono, salariofinal);
    }
    
}
