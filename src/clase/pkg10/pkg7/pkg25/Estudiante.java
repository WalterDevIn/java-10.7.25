package clase.pkg10.pkg7.pkg25;

public class Estudiante extends Persona {
    public int codigoEstudiante;
    public String especialidad;
    
    public Estudiante() {}
    
    public void set(int dni, String nombre, String apellido, String direccion, int telefono, int codigoEstudiante, String especialidad) {
        super.set(dni, nombre, apellido, direccion, telefono);
        this.codigoEstudiante = codigoEstudiante;
        this.especialidad = especialidad;
    }

    public String toString() {
        return super.toString()
            + "codigo-estudiante: " + codigoEstudiante
            + "\nespecialidad: " + especialidad
            + "\n";
    }
}
