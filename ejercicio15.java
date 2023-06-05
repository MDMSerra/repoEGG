/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.
 * @author MAR
 */
public class ejercicio15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
 
        System.out.print("Ingrese la cantidad de elementos a generar: ");
        int N = leer.nextInt();
        int[] vector;
        
        vector = rellenarVector(N);
        imprimirVector(vector); 
    }
    
    public static int[] rellenarVector(int cantidad){
        int[] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
           vector[i] = i+1;
        }
        return vector;
    }
    
    public static void imprimirVector(int[] vector){
        for (int elemento : vector) {
            System.out.println(elemento);
        }
    }
}
