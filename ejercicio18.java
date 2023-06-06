/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author MAR
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        int[][] matrizTranspuesta = new int[4][4];
        
        matriz = armarMatriz();
        
        for (int i = 0; i < matrizTranspuesta.length ; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                 matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        
        mostrarMatriz(matriz);
        System.out.println("\n");
        mostrarMatriz(matrizTranspuesta);
        
    }
    
    public static int[][] armarMatriz(){
        int[][] matriz = new int[4][4];

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz1[j] = (int) (Math.random()*10);
            }
        }
        
        
        //for (int i = 0; i < matriz.length ; i++) {
        //    for (int j = 0; j < matriz[0].length; j++) {
        //         matriz[i][j] = (int) (Math.random()*10);
        //    }
        //}
        return matriz;        
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for (int elemento : fila){
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }
}
