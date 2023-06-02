public class function {
    public static void main(String[] args) {
        var numero = multiplicar(20, 10);
        System.out.println(numero);
        hi("luis", 19);

    }
    // para que esta funcion sea invocado  se necesita invocar
    // adentro del metodo main
    static void hi(String nombre, int edad){
         System.out.printf("hola %s tu edad es %d \n",nombre, edad);
    }
    static int multiplicar(int a, int b){
        int suma = a * b;
        return suma;
    }
}
