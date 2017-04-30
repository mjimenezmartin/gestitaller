package funciones;

import classes.*;

import java.util.*;
import java.util.Map.Entry;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        sc.nextLine();
        while(!accion.equals("salir")){
            System.out.print("Nombre de la tarea: ");
            accion = sc.nextLine();
            if(!accion.equals("salir")){
                reparacion.addTarea(accion);
            }
        }
        lista.add(reparacion);
        System.out.println("Se ha creado la ficha de reparación con la siguientes tareas: ");
        listarTareas(reparacion);
    }
    
    public static void modificarFicha(){
        System.out.print("Introduzca identificacion: ");
        int id = sc.nextInt();
        boolean encontrado = false;
        int i = 0;
        for ( Reparacion reparacion : lista){
            if ( reparacion.getMecanico().getId() == id ){
                encontrado = true;
                System.out.println("Las reparaciones disponibles son las siguientes: ");
                System.out.println((i++)+" -\tVehiculo:\t"+reparacion.getVehiculo().getMatricula()+"\tCon fecha de entrada:\t"+reparacion.getFecha());
                //listarTareas(reparacion);
            }
        }
        if(!encontrado){
            System.out.println("No existe ficha de reparación asociada a este empleado.");
        }else{
            System.out.print("Introduzca el numero de la ficha a modificar: ");
            int idFicha = sc.nextInt();
            Reparacion ficha = lista.get(idFicha--);
            if(ficha.getMecanico().getId() != id){
                System.out.println("No tiene autorización para modificar esta ficha.");
            } else{
                if(modificarTareasFicha(ficha)){
                    ficha.setEstado(2);
                    System.out.println("Para modificar el estado de la ficha introduzca un nuevo estado: ");
                    System.out.println("\t0 - Pendiente");
                    System.out.println("\t1 - En proceso");
                    System.out.println("\t2 - Parado por falta de piezas");
                    System.out.println("\t3 - Parado por falta de confirmación del cliente");
                    System.out.println("\t4 - Finalizado");
                    int estado = sc.nextInt();
                    ficha.setEstado(estado);
                    System.out.println("ficha modificada correctamente");
                    System.out.println();
                }
            }
        }
    }
    
    public static boolean modificarTareasFicha(Reparacion ficha){
            System.out.println("Las tareas correspondientes a esta ficha son:");
            List<String> tareas = new ArrayList<String>();
            Map<String, Integer> tareasFicha = ficha.getTareas();
            int i = 0;
            for (Entry<String, Integer> e: tareasFicha.entrySet()) {
                i++;
                tareas.add(e.getKey());
                System.out.print((i)+" -\t"+e.getKey());
                System.out.print(" - ");
                switch(e.getValue()){
                    case 0:
                        System.out.println("Pendiente");
                        break;
                    case 1:
                        System.out.println("En proceso");
                        break;
                    case 2: 
                        System.out.println("Parado por falta de piezas");
                        break;
                    case 3: 
                        System.out.println("Parado por falta de confirmación del cliente");
                        break;  
                    case 4:
                        System.out.println("Finalizado");
                        break;
                }
            }
            System.out.print("Introduzca numero de tarea a modificar: ");
            int idTarea = sc.nextInt();
            System.out.println("Introduzca el estado para la tarea '"+tareas.get(idTarea-1)+"': ");
            System.out.println("\t0 - Pendiente");
            System.out.println("\t1 - En proceso");
            System.out.println("\t2 - Parado por falta de piezas");
            System.out.println("\t3 - Parado por falta de confirmación del cliente");
            System.out.println("\t4 - Finalizado");
            int estado = sc.nextInt();
            ficha.updateTarea(tareas.get(idTarea-1), estado);
            System.out.println("Tarea modificada");
            return true;
    }
    
    public static void buscar(){
        System.out.print("Introduzca matricula: ");
        String matricula = sc.next();
        boolean encontrado = false;
        for (Reparacion reparacion : lista){
            if (reparacion.getVehiculo().getMatricula().equals(matricula)){
                encontrado = true;
                System.out.println("Asignada al mecanico: "+reparacion.getMecanico().getNombre());
                System.out.println("Añadida el día: "+reparacion.getFecha());
                listarTareas(reparacion);
            }
        }
        if(!encontrado){
            System.out.println("No existe ficha de reparación asociada a ese vehiculo");
        }
    }
    
    public static void buscarActuales(){
        for (Reparacion reparacion : lista){
            if ( reparacion.getEstado() == 1 ){
                System.out.println("Vehiculo: "+reparacion.getVehiculo().getMatricula());
                listarTareas(reparacion);
            }
        }
    }
      
    public static void buscarMecanico(){
        System.out.print("Introduzca identificacion: ");
        int id = sc.nextInt();
        boolean encontrado = false;
        for (Reparacion reparacion : lista){
            if ( reparacion.getMecanico().getId() == id ){
                encontrado = true;
                System.out.println("Vehiculo: "+reparacion.getVehiculo().getMatricula());
                listarTareas(reparacion);
            }
        }
        if(!encontrado){
            System.out.println("No existe ficha de reparación asociada a este empleado");
        }
    }
    
    public static void listarTareas(Reparacion reparacion){
        Map<String, Integer> tareas = reparacion.getTareas();
        for (Entry<String, Integer> e: tareas.entrySet()) {
            System.out.print("\t"+e.getKey());
            System.out.print(" - ");
            switch(e.getValue()){
                case 0:
                    System.out.println("Pendiente");
                    break;
                case 1:
                    System.out.println("En proceso");
                    break;
                case 2: 
                    System.out.println("Parado por falta de piezas");
                    break;
                case 3: 
                    System.out.println("Parado por falta de confirmación del cliente");
                    break;  
                case 4:
                    System.out.println("Finalizado");
                    break;
            }
        }
    }
    
    public static void buscarFecha(){
        System.out.print("Introduzca fecha de inicio en formato dd-mm-aaaa : ");
        String inicio = sc.next();
        Date fechaInicio = new Date();
        
        System.out.print("Introduzca fecha de fin: ");
        String fin = sc.next();
        Date fechaFin = new Date();
        try{
            fechaInicio = new SimpleDateFormat( "dd-MM-yyyy" ).parse(inicio);
            fechaFin = new SimpleDateFormat("dd-MM-yyyy").parse(fin);
        }catch (ParseException e){
            System.out.print("Ha ocurrido un error");
        }
        
        for (Reparacion reparacion : lista){
            if ( reparacion.getFecha().compareTo(fechaInicio) >= 0 && reparacion.getFecha().compareTo(fechaFin) <= 0 ){
                System.out.println("Vehiculo: "+reparacion.getVehiculo().getMatricula());
                listarTareas(reparacion);
            }
        }
    }
}
