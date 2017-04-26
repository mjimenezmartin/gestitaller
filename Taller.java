import classes.*;
import funciones.*;

import java.util.*;

public class Taller {

  public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int accion = -1;
        int puntuacion = 0;
        Usuario usuario = new Usuario("0", "Nombre");
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        for (int i = 0; i <= 2; i++){
            Mecanico mecanico = new Mecanico("7483389"+i, "mecanico"+i, i, 62544520+i);
            Comercial comercial = new Comercial("389"+i, "comercialz"+i, i, 4520+i);
            Cliente cliente = new Cliente ("111"+i, "cliente"+i, i, 111+i);
            listaUsuarios.add(mecanico);
            listaUsuarios.add(comercial);
            listaClientes.add(cliente);
        }
       
    while (accion != 0){

        System.out.println("Bienvenido. Indique la acción a realizar: (0 para salir)");
        System.out.print("  1 - Añadir vehículo ");
        System.out.print("  2 - Añadir cliente ");
        System.out.print("  3 - Modificar cliente ");
        accion = sc.nextInt();
        
    switch (accion) {
        case 0:
        System.out.println("Hasta pronto");
        break;
        case 1:
        Vehiculos.addToList(listaClientes.get(0));
        break;
        case 2:
        Clientes.addToList();
        break;
        //case 3:
        //Clientes.update();
        //break;
        default:
        System.out.println("Esa opción no es válida");
        break;
    }

   }
 }  
}