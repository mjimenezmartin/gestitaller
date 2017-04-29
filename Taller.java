import classes.*;
import funciones.*;

import java.util.*;

public class Taller {

  public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int accion = -1;

        /*Usuario usuario = new Usuario("0", "Nombre");
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();*/
        
        /*  for (int i = 0; i <= 2; i++){
            Mecanico mecanico = new Mecanico("7483389"+i, "mecanico"+i, i, 62544520+i);
            Comercial comercial = new Comercial("389"+i, "comercialz"+i, i, 4520+i);
            Cliente cliente = new Cliente ("111"+i, "cliente"+i, i, 111+i);
            listaUsuarios.add(mecanico);
            listaUsuarios.add(comercial);
            listaClientes.add(cliente);
        }*/
        Mecanicos.addMecanicos();
       
    while (accion != 0){

        System.out.println("Bienvenido. Indique la acción a realizar: (0 para salir)");
        System.out.println("  1 - Añadir cliente ");
        System.out.println("  2 - Modificar cliente ");
        System.out.println("  3 - Añadir vehiculo ");
        System.out.println("  4 - Modificar vehicuclo");
        System.out.println("  5 - Listar vehiculos de cliente");
        System.out.println("  6 - Añadir vehiculo de servicio publico");
        accion = sc.nextInt();
        
    switch (accion) {
        case 0:
            System.out.println("Hasta pronto");
            break;
        case 1:
            Clientes.addToList();
            break;           
        case 2:
            Clientes.update();
            break; 
        case 3:
            Vehiculos.addToList(false);
            break;
        case 4:
            Vehiculos.update();
            break;
        case 5:
            Vehiculos.listarVehiculos();
            break;
        case 6:
            Vehiculos.addToList(true);
            break;
        default:
            System.out.println("Esa opción no es válida");
            break;
    }

   }
 }  
}