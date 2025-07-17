package clase.pkg10.pkg7.pkg25;

public class Materia {
    public String nombre;
    public int codigoProfesor;
    public int codigoEstudiante;
    public float nota;

    public Materia() {}
    
    public void set(String nombre, int codigoProfesor, int codigoEstudiante, float nota) {
        this.nombre = nombre;
        this.codigoProfesor = codigoProfesor;
        this.codigoEstudiante = codigoEstudiante;
        this.nota = nota;
    }

}
