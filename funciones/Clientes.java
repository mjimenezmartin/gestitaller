package funciones;

import classes.Usuario;
import classes.Mecanico;
import classes.Comercial;
import classes.Cliente;

import java.util.*;


/**
 * Write a description of class print here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clientes
{
   protected static Scanner sc = new Scanner(System.in);
   
   public static ArrayList<Cliente> lista = new ArrayList<Cliente>();
   public static int numeroCliente = 0;
   
   
   public static void addToList() {
    System.out.print("Introduzca DNI: ");
    String dni = sc.next();
    System.out.print("Introduzca nombre: ");
    String nombre = sc.next();
    System.out.print("Introduzca Tlfno: ");
    int tlfno = sc.nextInt();
    numeroCliente++;
    Cliente cliente = new Cliente(dni, nombre, numeroCliente, tlfno);
    lista.add(cliente);
    listar();
   }

  public static void listar(){
        System.out.println("los clientes existentes son: ");
        for(Cliente cli : lista){
            System.out.println("Cliente número: "+cli.getNumeroCliente()+" "+cli.getNombre()+" "+cli.getDni());
        }
  }
  
  public static Cliente buscar(String dni){
    for (Cliente cliente : Clientes.lista){
            if (cliente.getDni().equals(dni)){
                return cliente;
            }
        }
    return null;
  }
  
  public static void update(){
      if(lista.size() <= 0){
          System.out.println("No existen clientes en el sistema");
      }else{
          Cliente cliente = null;
          while (cliente == null){
              System.out.print("Introduzca numero de cliente (introduzca 0 para volver al menu principal): ");
              String dni = sc.next();
              if (dni.equals("0")){
                 break;
              }
              cliente = buscar(dni);
              if (cliente == null){
                System.out.println("El numero de cliente introducido no existe");
              }else{
                  System.out.print("Introduzca nuevo dni (dejar en blanco para mantener): ");
                  dni = sc.next();
                  cliente.setDni(dni);
                  System.out.print("Introduzca nuevo nombre (dejar en blanco para mantener): ");
                  String nombre = sc.next();
                  cliente.setNombre(nombre);
                  System.out.print("Introduzca nuevo teléfono (dejar en blanco para mantener): ");
                  int tlfno = sc.nextInt();
                  cliente.setTelefono(tlfno);
                  System.out.println("Cliente actualizado correctamente");
              }
          }
    }
  }
  
  public static Cliente getCliente(String dni){
      Cliente propietario = null;
        for (Cliente cliente : Clientes.lista){
            if (cliente.getDni().equals(dni)){
                return propietario = cliente;
            }
        }
      return propietario;
  }
}
