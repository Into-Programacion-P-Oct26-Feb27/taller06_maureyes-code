/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg01.pkg2;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class PROBLEMA012 {
    
    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
     
        String operacion;
        double num1;
        double num2;
        int opcion;
        double resultado;
        resultado=0;
        System.out.println("Ingrese el numero uno: ");
        num1= entrada.nextDouble();
        System.out.println("Ingrese el numero dos: ");
        num2= entrada.nextDouble();
        System.out.println("Ingrese el tipo de operacion: 1.Suma\n"
                + "2.Resta\n3.Multiplicacion\n4.Division\n5.Modulo\n6.Potencia");
        opcion= entrada.nextInt();
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                operacion = "Suma";
                break;
            case 2:
                resultado = num1 - num2;
                operacion = "Resta";
                break;
            case 3:
                resultado = num1 * num2;
                operacion = "Multiplicacion";
                break;
            case 4:
                resultado = num1 / num2;
                operacion = "Division";
                break;
            case 5:
                resultado = num1 % num2;
                operacion = "Modulo";
                break;
            case 6:
                resultado = Math.pow(num1, num2);
                operacion = "Potencia";
                break;
            default:
                operacion= "Ninguna";
                System.out.println("Opcion no valida");
        }
    System.out.printf("OPERACIONES ARIMETICAS\nPrimer numero: %.2f\nSegundo nuemro"
            + ": %.2f\nOperacion seleccionada: %s\n\nResultado: %.2f", num1, 
            num2, operacion, resultado);                
    }
}
