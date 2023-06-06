package encapsulamiento;

public class PersonEncap {
    private String nombre;
    private int edad;
    private Boolean estado;
    public PersonEncap(String nombre , int edad, Boolean estado){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;

    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(int edad){
        this.edad = edad;
    }
    public Boolean getEstado(){
        return this.estado;
    }
    public void setEstado(Boolean estado){
        this.estado = estado;
    }
}
