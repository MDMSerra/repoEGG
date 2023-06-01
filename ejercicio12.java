/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int ultimo;
        boolean comparativa;
        do{
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        ultimo = frase.length();
        if(frase.length()<=5){
            System.out.println("LONGITUD CORRECTA");
            if (frase.substring(0,1).equals("X")){
                System.out.println("PRIMER LETRA CORRECTA");
                if(frase.substring(ultimo-1,ultimo).equals("O")){
                   System.out.println("ULTIMA LETRA CORRECTA"); 
                }
                    
            }   
        }else if(frase.equals("&&&&&")){
            System.out.println("SALIR");
        }else{
           System.out.println("INCORRECTO");
                }
        comparativa = frase != "&&&&&";
        System.out.println("LA COMPARACION ES " + comparativa);
        }while(!frase.equals("&&&&&")); 
        
        
    }  
}
