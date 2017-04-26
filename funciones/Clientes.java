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
}
