/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp = 0;
        ConversorTemperaturas ct= new ConversorTemperaturas();
        System.out.println("Elige a que quieres convertir: Opcion 1 > Fharenheit || Opcion 2 > Reamur || Opcion 3 > Salir");
        Scanner OpcionTeclado = new Scanner(System.in);
        int Opcion = OpcionTeclado.nextInt();
        if (Opcion == 1 || Opcion ==2) {
            System.out.println("Introduce la temperatura en celsius");
            Scanner tempTeclado = new Scanner(System.in);
            temp = tempTeclado.nextInt();
        }
       do { 
        switch (Opcion) {
            case 1:
                try { 
                    System.out.println(temp + " en grados Fharenheit es: "+ ct.centigradosAFharenheit(temp));
                } catch (TemperaturaErradaExcepcion error2) {
                System.out.println("Error2 "+ error2.getMessage());
                }
                break;
            case 2:
                ct.centigradosAReamur(temp);
                break;
            case 3:
                System.exit(0);
                break;
                
            default: 
                System.out.println("Opción erronea");
            
        }
       } while(Opcion<3);
        
    }
    
}
