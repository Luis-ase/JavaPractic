package Ejercicios.Aplication02;

import java.util.Scanner;

public class Aplication02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String texto = leer.nextLine();

        if (palindromoInJava(texto)) {
            System.out.println("********************");
            System.out.printf("Esta palabra:%s es un palindromo \n", texto);
            System.out.println("********************");
        } else {
            System.out.println("********************");
            System.out.printf("Esta palabra:%s NO es un palindromo \n", texto);
            System.out.println("********************");
        }
    }

    static boolean palindromoInJava(String palabra) {
        palabra = palabra.replace(" ", "");
        palabra = palabra.toLowerCase();
        StringBuilder cadenaInvertidaInJava = new StringBuilder();
        for (int i = palabra.length()- 1; i >= 0; i--) {
            cadenaInvertidaInJava.append(palabra.charAt(i));
        }

        return palabra.equals(cadenaInvertidaInJava.toString());
    }
}
