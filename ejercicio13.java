/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
 * lo siguiente:
 * @author MAR
 */
public class ejercicio13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, i,j;
        System.out.println("Ingrese un numero");
        N = leer.nextInt();
        
        for(i=0; i<N; i++){
            if(i==0 || i==N-1){
                System.out.print(crearLinea("*",N)+"\n");
            }else{
                System.out.print("*" + crearLinea(" ",N-2) + "*\n");
            }
        } 
//        VERSION CON DOBLE FOR      
//        for(i=0; i<N; i++){
//            for(j=0;j<N;j++){
//                if(j==0 || j==N-1 || i==0 || i==N-1  ){
//                System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
    }
    public static String crearLinea(String letra, int veces){
        String salida = "";
        for (int i = 0; i < veces; i++) {
            salida+= letra ;
        }   
        return salida;
    }  
}
