package clase.pkg10.pkg7.pkg25;

public class Profesor extends Persona {
    
    public int codigoProfesor;
    public String titulo;

    public Profesor() {}
    
    public void set(int dni, String nombre, String apellido, String direccion, int telefono, int codigoProfesor, String titulo) {
        super.set(dni, nombre, apellido, direccion, telefono);
        this.codigoProfesor = codigoProfesor;
        this.titulo = titulo; 
    }

    public String toString() {
        return super.toString()
            + "codigo-profesor: " + codigoProfesor
            + "\ntitulo: " + titulo
            + "\n";
    }
    
}
