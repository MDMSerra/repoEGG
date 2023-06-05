/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejerciciosjava;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 
 * caracteres de largo, el primer carácter tiene que ser X y el último tiene 
 * que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
* secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
* y toda secuencia distinta de FDE, que no respete el formato se considera 
* incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
* lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
* deberá investigar cómo se utilizan las siguientes funciones de Java 
* Substring(), Length(), equals().
 * @author MAR
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;

        do{
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            if(frase.length()<=5 && frase.substring(0,1).equals("X") && frase.substring(frase.length()-1,frase.length()).equals("O")){
                System.out.println("CORRECTO"); 
            }else if(frase.equals("&&&&&")){
                System.out.println("FIN");
            }else{
                System.out.println("INCORRECTO");
            }
        }while(!frase.equals("&&&&&")); 
    }  
}
