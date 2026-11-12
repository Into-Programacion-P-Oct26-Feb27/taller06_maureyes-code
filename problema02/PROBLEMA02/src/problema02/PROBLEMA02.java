/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 * Solución para la estación de peaje "Buena Vía"
 * @author reroes
 */
public class PROBLEMA02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        String propietario;
        int tipoVehiculo;
        double avaluo;

        
        String nombreTipo;
        double porcentajeAvaluo;
        double valorFijo;
        double valorBase;
        double recargo;
        double totalCancelar;
        boolean tipoValido = true;

        nombreTipo="";
        porcentajeAvaluo = 0;
        valorFijo=0;
        valorBase=0;
        recargo=0;
        System.out.println("Ingrese el nombre del propietario:");
        propietario = entrada.nextLine();

        System.out.println("Ingrese el tipo de vehiculo\n1. Vehiculo liviano particular\n"
                + "2. Vehiculo grande particular\n3. Taxi\n4. Bus urbano:");
        tipoVehiculo = entrada.nextInt();

        System.out.println("Ingrese el avaluo comercial del vehiculo:");
        avaluo = entrada.nextDouble();

        
        switch (tipoVehiculo) {
            case 1:
                nombreTipo = "Vehiculo liviano particular";
                porcentajeAvaluo = 0.01;
                valorFijo = 2.00;
                break;
            case 2:
                nombreTipo = "Vehiculo grande particular";
                porcentajeAvaluo = 0.02;
                valorFijo = 2.50;
                break;
            case 3:
                nombreTipo = "Taxi";
                porcentajeAvaluo = 0.04;
                valorFijo = 1.50;
                break;
            case 4:
                nombreTipo = "Bus urbano";
                porcentajeAvaluo = 0.05;
                valorFijo = 2.20;
                break;
            default:
                tipoValido = false;
                break;
        }

        if (tipoValido) {
            
            valorBase = (avaluo * (porcentajeAvaluo / 100.0)) + valorFijo;

           
            if ((tipoVehiculo == 1 || tipoVehiculo == 2) && avaluo > 30000) {
                recargo = 1.50;
            } else {
                recargo = 0.00;
            }


            totalCancelar = valorBase + recargo;


            System.out.printf("Peaje Buena Via\nPropietario: %s\n"
                    + "Tipo: %s\n    Avaluo: $%.2f\n"
                    + "    Valor base del peaje: $%.2f\n    Recargo: $%.2f\n\n"
                    + "    Total a cancelar: $%.2f\n", propietario ,nombreTipo, 
                    avaluo, valorBase, recargo, totalCancelar);

        } else {
            System.out.println("Error: El tipo de vehiculo ingresado no es valido.");
        }
    }
}
