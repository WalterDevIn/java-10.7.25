package clase.pkg10.pkg7.pkg25;

public class Estudiante extends Persona {
    public int codigoEstudiante;
    public String especialidad;
    
    public Estudiante() {}
    
    public void set(int DNI, String nombre, String apellido, String direccion, int telefono, int codigoProfesor, String titulo) {
        super.set(DNI, nombre, apellido, direccion, telefono);
        this.codigoEstudiante = codigoEstudiante;
        this.especialidad = especialidad; 
    }
}
