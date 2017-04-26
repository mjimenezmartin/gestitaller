package classes;


/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version numberUsuarioate)
 */
public class Cliente extends Usuario
{
    // instance variables - replace the example below with your own

    int numeroCliente;
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String dni, String nombre, int numeroCliente, int telefono)
    {
        super(dni, nombre, telefono);
        this.numeroCliente = numeroCliente;
    }

    
    public int getNumeroCliente(){
        return this.numeroCliente;
    }
}
