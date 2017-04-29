package classes;
import java.util.*;

/**
 * Write a description of class Reparacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reparacion
{
    // instance variables - replace the example below with your own
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    public int estado;
    public Map<String, Integer> tareas = new HashMap<String, Integer>();

    /**
     * Constructor for objects of class Reparacion
     */
    public Reparacion(Vehiculo vehiculo, Mecanico mecanico)
    {
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.estado = 0;
    }
    
    public Vehiculo getVehiculo()
    {
        return this.vehiculo;
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
    
    public void addTarea(String titulo){
        tareas.put(titulo, 0);
    }
    
    public Map getTareas(){
        return this.tareas;
    }
    
    public void updateTarea(String titulo, int estado){
        tareas.put(titulo, 0);
    }
}
