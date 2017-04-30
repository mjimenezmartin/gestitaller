import classes.*;
import funciones.*;

import java.util.*;

public class Taller {

  public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int accion = -1;
        
        Mecanicos.addMecanicos(); //Añadiendo mecanicos automaticamente
        
       System.out.println("Bienvenido.");
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
                System.out.println("Indique que gestión desea realizar (0 para volver): ");
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
                System.out.println("Indique que gestión desea realizar (0 para volver): ");
                System.out.println("  1 - Añadir vehiculo ");
                System.out.println("  2 - Añadir vehiculo de Servicio Público");
                System.out.println("  3 - Modificar vehicuclo");
                System.out.println("  4 - Listar vehiculos de cliente");
                System.out.println("  5 - Buscar vehiculo");
                submenu = sc.nextInt();
                
                switch(submenu){
                    case 0:
                        break;
                    case 1:
                        Vehiculos.addToList(false);
                        break;
                    case 2:
                        Vehiculos.addToList(true);
                        break;
                    case 3:
                        Vehiculos.update();
                        break;        
                    case 4:
                        Vehiculos.listarVehiculos();
                        break;
                    case 5:
                        Vehiculos.buscarVehiculo();
                        break;
                    default:
                        System.out.println("Esa opción no es válida");
                        break;
                }
                
            }
            break;
        case 3:
            while (submenu != 0){
                System.out.println("Indique que gestión desea realizar (0 para volver): ");
                System.out.println("  1 - Buscar ficha de reparación");
                submenu = sc.nextInt();
                
                switch(submenu){
                    case 0:
                        break;
                    case 1:
                        Reparaciones.buscar();
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