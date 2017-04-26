package classes;


/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version numVehiculo date)
 */
public class Moto extends Vehiculo
{
    int tipo;
    /**
     * Constructor for objects of class Moto
     */
    public Moto( String matricula, int combustible, Cliente cliente )
    {
       super(matricula, combustible, cliente);
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public int getTipo(){
        return this.tipo;
    }
}
