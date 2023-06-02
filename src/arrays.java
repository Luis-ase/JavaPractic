public class arrays {
    public static void main(String[] args) throws Exception{
        String nombre [];
        nombre = new String[3];
        nombre[0] = "Luis"; 
        nombre[1] = "Michael"; 
        nombre[2] = "Gonza"; 
        System.out.println(nombre.length);
        for (String string : nombre) {
            System.out.println(string);
        }
    }
}
