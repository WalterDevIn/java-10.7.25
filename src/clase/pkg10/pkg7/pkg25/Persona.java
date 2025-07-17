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
public abstract class Persona {

    public int DNI;
    public String nombre;
    public String apellido;
    public String direccion;
    public int telefono;

    public Persona() {}
    
    public void set(int DNI, String nombre, String apellido, String direccion, int telefono) {    
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
