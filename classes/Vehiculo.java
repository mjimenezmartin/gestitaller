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
    public boolean esPublico = false;
    

    /**
     * Constructor for objects of class vehiculo
     */
    public Vehiculo( String matricula, int combustible, Cliente cliente, boolean publico )
    {
        this.matricula = matricula;
        this.combustible = combustible;
        this.cliente = cliente;
        this.esPublico = publico;
    }
    
    public Vehiculo( String matricula, int combustible, boolean abs, Cliente cliente, boolean publico )
    {
        this.matricula = matricula;
        this.combustible = combustible;
        this.abs = abs;
        this.cliente = cliente;
        this.esPublico = publico;
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
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public int getCombustible()
    {
        return this.combustible;
    }
    public void setCombustible(int combustible){
        this.combustible = combustible;
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
    public boolean getPublico(){
        return this.esPublico;
    }
}
