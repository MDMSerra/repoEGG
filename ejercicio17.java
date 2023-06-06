/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author MAR
 */
public class ejercicio17 {

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
        contarDigitos(vector);
    }
    
    public static int[] rellenarVector(int cantidad){
        int[] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int) (Math.random()*15000);
        }
        return vector;
    }
    
     public static void imprimirVector(int[] vector){
        for (int elemento : vector) {
            System.out.println(elemento);
        }
    }
     
    public static void contarDigitos(int[] vector){
        int[] contadorDigitos = new int[5];
        for (int elemento : vector) {
            int digito = String.valueOf(elemento).length();
            if(digito<=5)
                contadorDigitos[digito-1]++; 
        }
       imprimirVector(contadorDigitos);
    }
    
}