/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. El programa deberá después mostrar el 
 * resultado de la suma
 * @author MAR
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int numero2;
        int suma;
        
        System.out.println("Ingrese el primer numero");
        numero = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextInt();
        suma = numero + numero2;
        System.out.println("La suma de los dos numeros es " + suma);
    }
    
}
