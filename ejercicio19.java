/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. 
 * Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
 * propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
 * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
 * obtiene cambiando sus filas por columnas (o viceversa)
 * @author MAR
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
       
        matriz = armarMatriz();        
        mostrarMatriz(matriz);
        verificarMatrizAntisimetrica(matriz);
    }
    
    
    public static int[][] armarMatriz(){
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        /*
        int[][] matriz = new int[4][4];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz1[j] = (int) (Math.random()*10);
            }
        }*/
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
    
    public static void verificarMatrizAntisimetrica(int[][] matriz){
        boolean estado = true;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if( (matriz[j][i] == Math.abs(matriz[i][j]) || matriz[i][j] == Math.abs(matriz[j][i])) && matriz[i][j] ==  Math.negateExact(matriz[j][i])){
                    estado = estado && true;
                }else{
                    estado = false; 
                }
                
            }
        }
        System.out.println("La matriz es Antisimetrica: " + estado);
    }
}
