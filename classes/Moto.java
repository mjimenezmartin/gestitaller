package classes;


/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version numVehiculo date)
 */
public class Moto extends Vehiculo
{
    int tipoCarnet;
    /**
     * Constructor for objects of class Moto
     */
    public Moto( String matricula, int combustible, Cliente cliente, boolean publico )
    {
       super(matricula, combustible, cliente, publico);
    }
    public Moto( String matricula, int combustible, Cliente cliente, int tipo, boolean publico )
    {
       super(matricula, combustible, cliente, publico);
       this.tipoCarnet = tipo;
    }
    public void setTipo(int tipo){
        this.tipoCarnet = tipo;
    }
    
    public int getTipo(){
        return this.tipoCarnet;
    }
}
