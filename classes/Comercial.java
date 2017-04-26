package classes;


/**
 * Write a description of class Comercial here.
 * 
 * @author (your name) 
 * @version (a version number oUsuarioe)
 */
public class Comercial extends Usuario
{
    // instance variables - replace the example below with your own
    private int zona;

    /**
     * Constructor for objects of class Comercial
     */
    public Comercial(String dni, String nombre, int zona, int telefono)
    {
        // initialise instance variables
         super(dni, nombre, telefono);
         this.zona = zona;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getZona()
    {
        return this.zona;
    }
    public void setZona(int zona){
        this.zona = zona;
    }
}
