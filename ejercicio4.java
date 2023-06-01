/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author MAR
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double celcius;
        double farenheit;
        System.out.println("Ingrese los grados celcius");
        celcius = leer.nextDouble();
        farenheit = 32 + (9 * celcius / 5);
        System.out.println(celcius + " grados celcius equivalen a " + farenheit + " grados farenheit");
    }   
}
