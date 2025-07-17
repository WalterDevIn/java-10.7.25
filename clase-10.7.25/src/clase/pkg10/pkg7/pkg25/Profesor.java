/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg10.pkg7.pkg25;

public class Profesor extends Persona {
    
    public int codigoProfesor;
    public String titulo;

    public Profesor() {}
    
    public void set(int DNI, String nombre, String apellido, String direccion, int telefono, int codigoProfesor, String titulo) {
        super.set(DNI, nombre, apellido, direccion, telefono);
        this.codigoProfesor = codigoProfesor;
        this.titulo = titulo; 
    }
    
}
