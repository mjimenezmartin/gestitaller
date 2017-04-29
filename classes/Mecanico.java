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
    int id;
    
    /**
     * Constructor for objects of class Mecanico
     */
    public Mecanico(String dni, String nombre, int tipo, int telefono, int id)
    {
        super(dni, nombre, telefono);
        this.tipo = tipo;
        this.id = id;
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
    
     public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public int getId(){
        return this.id;
    }
    
     public void setId(int id){
        this.id = id;
    }
}
