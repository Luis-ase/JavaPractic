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
        int [] arrays1 = {1,2,3,4,5};
        System.out.println(arrays1.length);
        for (int i : arrays1) {
            System.out.println(i);
        }
    }
}
