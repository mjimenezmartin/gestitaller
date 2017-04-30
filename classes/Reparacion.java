package classes;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Reparacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reparacion
{
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    public int estado;
    Date fecha;
    public Map<String, Integer> tareas = new HashMap<String, Integer>();

    /**
     * Constructor for objects of class Reparacion
     */
    public Reparacion(Vehiculo vehiculo, Mecanico mecanico)
    {
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.estado = 0;
         String DATE_FORMAT_NOW = "dd-MM-yyyy";
         Date fecha = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
         String stringDate = sdf.format(fecha);
            try {
                this.fecha = sdf.parse(stringDate);
            } catch(ParseException e){
             //Exception handling
            } catch(Exception e){
             //handle exception
            }
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
        tareas.put(titulo, estado);
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void updateFecha(){
         String DATE_FORMAT_NOW = "dd-MM-yyyy";
         Date fecha = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
         String stringDate = sdf.format(fecha);
        try {
            this.fecha = sdf.parse(stringDate);
        } catch(ParseException e){
         //Exception handling
        } catch(Exception e){
         //handle exception
        }
    }
}
