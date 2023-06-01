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
        int contador = 100;
        for (int i = 1; i < contador; i++) {
            String letras = "Fizz", bus = "Buzz";
            String Completo;
            if(i%3 ==0 && i%5 ==0 ){
                Completo = letras +bus;
                System.out.print(Completo);
                System.out.println(i);
                
            }
            else if(i%3==0){
                Completo = letras;
                System.out.print(Completo);
                System.out.println(i);
            }
            else if(i%5==0){
                Completo = bus;
                System.out.print(Completo);
                System.out.println(i);
            }

            
        }
    }
}
