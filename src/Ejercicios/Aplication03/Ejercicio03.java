package Ejercicios.Aplication03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        // Escribir un programa que permita ingresar tres
        // números enteros e indicar cual es el mayor.
        try(Scanner numero= new Scanner(System.in)){
            System.out.println("Ingrese el numero 1:");
            int num1 = numero.nextInt();
            System.out.println("Ingrese el numero 2:");
            int num2 = numero.nextInt();
            
            System.out.println("Ingrese el numero 3:");
            int num3 = numero.nextInt();
            
            int numeroMayorAll = numeroMayor(num1, num2, num3);
            System.out.printf("El numero mayor de \n %s ",numeroMayorAll);
        }
    }
    static int numeroMayor(int numero1, int numero2,int numero3){
        int numeroMayor = 0;
       if( numero1 > numero2 && numero1 > numero3){
        numeroMayor = numero1;
       }
       if( numero1 < numero2 && numero1 < numero2){
        numeroMayor = numero2;
       }
       if( numeroMayor == 0){
        return numero3;
       }
        
        return numeroMayor; 
    }

}
