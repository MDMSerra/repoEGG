/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import static guiadeejerciciosjava.ejercicio15.imprimirVector;
import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores 
 * aleatorios y le pida al usuario un numero a buscar en el vector. 
 * El programa mostrará donde se encuentra el numero y si se encuentra 
 * repetido
 * @author MAR
 */
public class ejercicio16 {

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
        
        System.out.println("Ingrese el numero que desea buscar");
        int buscar = leer.nextInt();
        buscarNumero(vector, buscar);
    }
    
    public static int[] rellenarVector(int cantidad){
        int[] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int) (Math.random()*100);
        }
        return vector;
    }
    
     public static void imprimirVector(int[] vector){
        for (int elemento : vector) {
            System.out.println(elemento);
        }
    }
     
    public static void buscarNumero(int[] vector, int buscar){
        String estado = "NO ENCONTRADO";
        for (int elemento : vector) {
            if (elemento == buscar)
                estado = "ENCONTRADO";
        }
        System.out.println( estado + " El numero " + buscar);
    } 
}
