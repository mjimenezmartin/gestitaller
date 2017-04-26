package classes;


/**
 * Write a description of class Mecanico here.
 * 
 * @author (your name) 
 * @version (a version number Usuariote)
 */
public class Mecanico extends Usuario
{
    int tipo;

    /**
     * Constructor for objects of class Mecanico
     */
    public Mecanico(String dni, String nombre, int tipo, int telefono)
    {
        super(dni, nombre, telefono);
        this.tipo = tipo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getTipo(){
        return this.tipo;
    }
    
	 public void setTipo(){
        this.tipo = tipo;
    }
}
