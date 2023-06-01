/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *  Escriba un programa en el cual se ingrese un valor limite positivo, y a 
 * continuación solicite números al usuario hasta que la suma de los números 
 * introducidos supere el limite inicial.
 * @author MAR
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limitePositivo;
        int suma = 0;
        int numero;
        System.out.println("Ingrese un valor limite positivo");
        limitePositivo = leer.nextInt();
        do{
            System.out.println("Ingrese un numero a sumar");
            numero = leer.nextInt();
            suma = suma + numero;
        }while(suma<=limitePositivo);
            System.out.println("La suma total dio " + suma);
    }
    
}
