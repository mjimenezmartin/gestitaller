package funciones;

import classes.*;

import java.util.*;
import java.util.Map.Entry;


/**
 * Write a description of class Reparaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reparaciones
{
       
   protected static Scanner sc = new Scanner(System.in);
   
   public static ArrayList<Reparacion> lista = new ArrayList<Reparacion>();
   
    public static void addFicha(Vehiculo vehiculo)
    {

        Mecanico mecanico = null;
        
        Mecanicos.listar();
        System.out.print("Introduzca id del mecanico: ");
        int id = sc.nextInt();
        mecanico = Mecanicos.buscar(id);
        
        Reparacion reparacion = new Reparacion(vehiculo, mecanico);
        
        String accion = ".";
        System.out.println("Añadir tareas (introduzca salir para volver al menu anterior): ");
        
        if(vehiculo.getClass().getSimpleName().equals("Moto")){
            reparacion.addTarea("Comprobar presión de los neumáticos");
        }
        if(vehiculo.getCombustible() == 2){
            reparacion.addTarea("Revisión de filtro de partículas");
        }
        if(vehiculo.getPublico() == true){
            reparacion.addTarea("Revisión de sirena");
        }
        
        while(!accion.equals("salir")){
            System.out.print("Nombre de la tarea: ");
            accion = sc.next();
            if(!accion.equals("salir")){
                reparacion.addTarea(accion);
            }
        }
        lista.add(reparacion);
        System.out.println("Se ha creado la ficha de reparación con la siguientes tareas: ");
        listarTareas(reparacion);
        
    }
    
    public static void listarTareas(Reparacion reparacion){
        Map<String, Integer> tareas = reparacion.getTareas();
        for (Entry<String, Integer> e: tareas.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(" - ");
            switch(e.getValue()){
                case 0:
                    System.out.println("Pendiente");
                    break;
                case 1:
                    System.out.println("En proceso");
                    break;
                case 21: 
                    System.out.println("Parado por falta de piezas");
                    break;
                case 22: 
                    System.out.println("Parado por falta de confirmación del cliente");
                    break;  
                case 3:
                    System.out.println("Finalizado");
                    break;
            }
        }
    }
}
