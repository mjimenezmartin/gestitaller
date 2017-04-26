package classes;


/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    public String dni;
    public String nombre;
    public int telefono;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String dni, String nombre)
    {
        // initialise instance variables
        this.dni = dni;
        this.nombre = nombre;
    }
    public Usuario(String dni, String nombre, int telefono)
    {
        // initialise instance variables
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
}
