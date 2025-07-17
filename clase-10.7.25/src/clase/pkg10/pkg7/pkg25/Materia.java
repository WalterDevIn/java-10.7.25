/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg10.pkg7.pkg25;

/**
 *
 * @author ALUMNO
 */
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
