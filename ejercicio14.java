/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;
//Crea una aplicación que a través de una función nos convierta una cantidad de 
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
//o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
//converir que será una cadena, este no devolverá ningún valor y mostrará un 
//mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda;
        
        System.out.println("CONVERSOR DE MONEDAS");
        System.out.print("Ingrese los euros a convertir: ");
        euros = leer.nextFloat();
        System.out.println("ELIJA LA MONEDA A CONVERTIR");
        System.out.print("libras  dolares  yenes: ");
        moneda = leer.next();
        conversor(euros,moneda);
    }
    
    public static void conversor(float euros, String moneda){
        float conversion;
        float[] cambio = new float[3];
        String[] caracter = new String[3];
        String[] monedas = new String[3];
        
        cambio[0]= 0.86f;
        cambio[1]= 1.28611f;
        cambio[2]= 129.852f;
        
        caracter[0] = "libras";
        caracter[1] = "$";
        caracter[2] = "yenes";
        
        monedas[0] = "libras";
        monedas[1] = "dolares";
        monedas[2] = "yenes";
               
        for (int i = 0; i < monedas.length; i++) {
            if (monedas[i].equals(moneda)) {
                conversion = euros * cambio[i];
                System.out.println(euros+"€ = "+conversion+" "+caracter[i]);   
            }
        }
    }
}
