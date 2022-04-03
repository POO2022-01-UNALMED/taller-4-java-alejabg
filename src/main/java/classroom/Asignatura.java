package classroom;

public class Asignatura {

    public String nombre;
    public short codigoInterno;
    public int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this.nombre="Sin nombre";
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    Asignatura(short codigoInterno,Tipo tipo) {
        this.nombre="Sin nombre";
        this.codigoInterno = codigoInterno;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre= "Sin nombre";
        this.codigoInterno = 0;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    Asignatura(String nombre, short codigoInterno, short codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    void cambiarDatos(short codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void cambiarDatos(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (short) codigoInterno;
    }
}
