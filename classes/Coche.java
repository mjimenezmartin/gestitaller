package classes;


/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version numbVehiculodate)
 */
public class Coche extends Vehiculo
{
    int nPuertas;
    boolean calefaccion;
    
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Coche
     */
    public Coche( String matricula, int combustible, Cliente cliente, boolean publico )
    {
       super(matricula, combustible, cliente, publico);
    }
    public Coche( String matricula, int combustible, Cliente cliente, boolean calefaccion, int nPuertas, boolean publico )
    {
       super(matricula, combustible, cliente, publico);
       this.calefaccion = calefaccion;
       this.nPuertas = nPuertas;
    }
    public boolean getCalefaccion(){
        return this.calefaccion;
    }
    
    public int getNPuertas(){
        return this.nPuertas;
    }
    
    public void setNPuertas(int nPuertas){
        this.nPuertas = nPuertas;
    }
    
    public void setCalefaccion(boolean calefaccion){
        this.calefaccion = calefaccion;
    }
    
}
