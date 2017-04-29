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
       System.out.println("\033[32mBienvenido.");
    while (accion != 0){

        System.out.println("Indique que desea gestionar: (0 para salir)");
        System.out.println(" 1 - Gestionar clientes");
        System.out.println(" 2 - Gestionar Vehiculos");
        System.out.println(" 3 - Gestionar Fichas de Reparacion");

        accion = sc.nextInt();
        int submenu = -1;
    switch (accion) {
        case 1:
            while (submenu != 0){
                System.out.println("Indique que gestión desea realizar (0 para salir): ");
                System.out.println("  1 - Añadir cliente ");
                System.out.println("  2 - Modificar cliente ");
                submenu = sc.nextInt();
                
                switch(submenu){
                    case 0:
                        break;
                    case 1:
                        Clientes.addToList();
                        break;           
                    case 2:
                        Clientes.update();
                        break; 
                    default:
                        System.out.println("Esa opción no es válida");
                        break;
                }
                
            }
            break;
        case 2:
            while (submenu != 0){
                System.out.println("Indique que gestión desea realizar (0 para salir): ");
                System.out.println("  1 - Añadir vehiculo ");
                System.out.println("  2 - Modificar vehicuclo");
                System.out.println("  3 - Listar vehiculos de cliente ");
                System.out.println("  4 - Añadir vehiculo de Servicio Público");
                submenu = sc.nextInt();
                
                switch(submenu){
                    case 0:
                        break;
                    case 1:
                        Vehiculos.addToList(false);
                        break;
                    case 2:
                        Vehiculos.update();
                        break;
                    case 3:
                        Vehiculos.listarVehiculos();
                        break;        
                    case 4:
                        Vehiculos.addToList(true);
                        break;
                    default:
                        System.out.println("Esa opción no es válida");
                        break;
                }
                
            }
            break;
        case 0:
            System.out.println("Hasta pronto");
            break;
        default:
            System.out.println("Esa opción no es válida");
            break;
    }

   }
 }  
}