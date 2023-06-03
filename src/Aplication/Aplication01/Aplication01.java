package Aplication.Aplication01;

import java.util.Scanner;

import javax.print.FlavorException;

public class Aplication01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero: ");

        int numero = leer.nextInt();

        if(esPrimo(numero)){
            System.out.println("*******************");
            System.out.println("Es numero primo ");
        }else{
            System.out.println("*******************");
            System.out.println("No es  numero primo ");

        }
    }

    static boolean esPrimo(int numero){
        // pongo 5
        int contador = 0;
        
        int [] numeritos = new int[numero];
       
        for(int i = 0 ; i<numeritos.length; i++){
            numeritos[i] = i +1;
        }   

        for(int l : numeritos){
            if(l ==1 || l == numero){
                continue;
            }
            if(numero % l == 0){
                contador++;
            }
        }  
        
        return contador == 0;
    }
}
