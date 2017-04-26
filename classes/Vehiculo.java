package classes;


/**
 * Write a description of class vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    // instance variables - replace the example below with your own
    public String matricula;
    public int combustible;
    public boolean abs = false;
    public int capacidadMotor;
    public Cliente cliente;
    

    /**
     * Constructor for objects of class vehiculo
     */
    public Vehiculo( String matricula, int combustible, Cliente cliente )
    {
        this.matricula = matricula;
        this.combustible = combustible;
        this.cliente = cliente;
    }
    
    public Vehiculo( String matricula, int combustible, boolean abs, Cliente cliente )
    {
        this.matricula = matricula;
        this.combustible = combustible;
        this.abs = abs;
        this.cliente = cliente;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getMatricula()
    {
        return this.matricula;
    }
    public int getCombustible()
    {
        return this.combustible;
    }
    public boolean getAbs()
    {
        return this.abs;
    }
    public void setAbs(boolean abs){
        this.abs = abs;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
}
