/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y 
 * muestre por pantalla el siguiente menú:
 * @author MAR
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero, numero2;
        int opcion;
        
        System.out.println("Ingrese el primer numero");
        numero = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextDouble();
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción:");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma es " + (numero + numero2));
                break;
            case 2:
                System.out.println("La resta es " + (numero - numero2));
                break;
            case 3:
                System.out.println("La multiplicacion es " + (numero * numero2));
                break;
            case 4:
                System.out.println("La division es " + (numero / numero2));
                break;
            case 5:
                System.out.println("SALIR");
                break;
        }

    }
    
}
