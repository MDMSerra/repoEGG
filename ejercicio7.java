/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * Incorrecto. Nota: investigar la función equals() en Java.
 * @author MAR
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
