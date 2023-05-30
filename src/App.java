public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 4 tipos de elementos en java
         * Enteros 
         * Decimales
         * Caracteres
         * Booleanos
         * 
         */
        int contador = 0;
        boolean login = false;
        float versionCsgo= 1.6f;
        String letra = "a";
        String name= "Luis";
        int phonenumber, adreass, numberPiso;
        phonenumber = 1199999999;
        adreass = 8888;
        numberPiso = 777777;
        final String nombreCompleto = "Michael Luis";

        System.out.println(contador);
        System.out.println(name);
        System.out.println(login);
        System.out.println(versionCsgo);
        System.out.println(phonenumber);
        System.out.println(adreass);
        System.out.println(numberPiso);
        //Operadores
        int number1 =10, number2 =2;
        float number3= 3.9f;
        int result = number1 +number2;
        int result2= number1 + (int)number3;
        System.out.println(result);
        System.out.println(result2);
    

        String firstName = "Luis";
        String nombreGood = "Luis";

        String mensaje = firstName == nombreGood ? "Son iguales" :"Son distintos";

        System.out.println(mensaje);

    }
}
