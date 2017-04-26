package funciones;

import classes.*;

import java.util.*;

/**
 * Write a description of class Vehiculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculos
{
   
   protected static Scanner sc = new Scanner(System.in);
   
   public static ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
   
   public static void addToList() {
       Cliente propietario = null;
       boolean encontrado = false;
    if (Clientes.lista.size() <= 0){
        System.out.println("Debe introducir al menos un cliente en el sistema");
    }else{
        System.out.print("Introduzca Numero de Cliente (Propietario): ");
        int numeroCliente = sc.nextInt();
        propietario = Clientes.buscar(numeroCliente);
        if (propietario != null){
            System.out.print("Introduzca matricula: ");
            String matricula = sc.next();
            System.out.print("Introduzca combustible (1- Gasolina, 2- Diesel, 3- Electrico): ");
            int combustible = sc.nextInt();
            Vehiculo vehiculo = new Vehiculo(matricula, combustible, propietario);
            lista.add(vehiculo);
            listar();
        }else{
            System.out.println("El numero de cliente introducido no existe.");
            Clientes.listar();
        }
    }
   }
   
   public static void listar() {
        System.out.println("los vehiculos disponibles son: ");
        for(Vehiculo veh : lista){
            System.out.println(veh.getMatricula()+" "+veh.getCliente().getNombre());
        }
   }
}
