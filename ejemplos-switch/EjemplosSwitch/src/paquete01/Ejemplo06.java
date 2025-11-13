/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese su placa del vehiculo");
        String placa = entrada.nextLine();
        placa = placa.toLowerCase();
        String inicial = placa.substring(0, 1);

     
        switch (inicial) {
            
            case "G":
            case "g":
                System.out.printf("%s\n", "acceso correcto", placa);
                break;
             
            case "P":
            case "p":
                
                System.out.printf("%s\n", "acceso correcto", placa);
                break;
               
            default:
                System.out.println("acceso incorrecto");
                break;
        
        }
    } 
}
