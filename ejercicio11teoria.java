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
public class ejercicio11teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres terminada en punto: ");
        String secuencia = scanner.nextLine();
        String resultado = codificar(secuencia);
        System.out.println("Resultado: " + resultado);
                
   }

    public static String codificar(String secuencia) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < secuencia.length(); i++) {
            char caracter = secuencia.charAt(i);
            if (esVocal(caracter)) {
                resultado.append(codificarVocal(caracter));
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }

    public static boolean esVocal(char caracter) {
        String vocales = "aeiouAEIOU";
        return vocales.contains(Character.toString(caracter));
    }

    public static char codificarVocal(char vocal) {
        switch (Character.toLowerCase(vocal)) {
            case 'a':
                return '@';
            case 'e':
                return '#';
            case 'i':
                return '$';
            case 'o':
                return '%';
            case 'u':
                return '*';
            default:
                return vocal;
        }
    }
    }
    