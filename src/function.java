public class function {
    public static void main(String[] args) {
        // var numero = multiplicar(20, 10);
        // System.out.println(numero);
        // hi("luis", 19);
        Recursividad01(10);
        System.out.println(Recursividad02(4));

    }
    // para que esta funcion sea invocado  se necesita invocar
    // adentro del metodo main
    // static void hi(String nombre, int edad){
    //      System.out.printf("hola %s tu edad es %d \n",nombre, edad);
    // }
    // static int multiplicar(int a, int b){
    //     int suma = a * b;
    //     return suma;
    // }
    

    //Recursividad
    static int Recursividad01(int numero){
        numero--;
        if(numero >0){
            System.out.println(numero);
            return Recursividad01(numero);
        }
        return numero;
    }
    static int Recursividad02(int numero){
        if(numero >1){
            numero = numero * Recursividad02(numero -1);
        }
        return numero;
    }

}
