package classes;


/**
 * Write a description of class Reparacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reparacion
{
    // instance variables - replace the example below with your own
    private Cliente cliente;
    private Mecanico mecanico;
    public int estado;
    public String datos;

    /**
     * Constructor for objects of class Reparacion
     */
    public Reparacion(Cliente cliente)
    {
        this.cliente = cliente;
        this.estado = 0;
    }

    
    public Cliente getCliente()
    {
        return this.cliente;
    }
    
    public void setMecanico(Mecanico mecanico){
        this.mecanico = mecanico;
    }
    
    public Mecanico getMecanico(){
        return this.mecanico;
    }
    
    public void setEstado(int estado){
        this.estado = estado;
    }
    
    public int getEstado(){
        return this.estado;
    }
    
    public void setDatos(String datos){
        this.datos = datos;
    }
    
    public String getDatos(){
        return this.datos;
    }
}
