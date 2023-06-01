/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *
 * Escribir un programa que lea un número entero por teclado y muestre por 
 * pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 * @author MAR
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        System.out.println("El doble es " + numero*2);
        System.out.println("El triple es " + numero*3);
        System.out.println("La raiz cuadrada es " + Math.sqrt(numero));
    }
    
}
