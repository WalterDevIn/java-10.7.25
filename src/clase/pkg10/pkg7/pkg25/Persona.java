package clase.pkg10.pkg7.pkg25;

public abstract class Persona {

    public int dni;
    public String nombre;
    public String apellido;
    public String direccion;
    public int telefono;

    public Persona() {}
    
    public void set(int dni, String nombre, String apellido, String direccion, int telefono) {    
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String toString() {
        return "dni: " + dni + 
            "\nnombre: " + nombre + " " + apellido 
            + "\ndireccion: " + direccion 
            + "\ncodigo: " + telefono 
            + "\n";
    }
}
