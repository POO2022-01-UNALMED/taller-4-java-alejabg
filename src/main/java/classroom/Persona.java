package classroom;

public class Persona {

    public long cedula; //se cambio de final long cedula a public7
    private String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        this.cedula = 1;
        totalPersonas++;
    }

    //se añade el constructor para el main (línea 8)
    Persona(){
        this.cedula = 0;
        this.nombre = "";
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
