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
   
   public static void addToList(boolean servicioPublico) {
       Cliente propietario = null;
       boolean encontrado = false;
    if (Clientes.lista.size() <= 0){
        System.out.println("Debe introducir al menos un cliente en el sistema");
    }else{
        System.out.print("Introduzca Numero de Cliente (Propietario): ");
        String dni = sc.next();
        propietario = Clientes.buscar(dni);
        if (propietario != null){
            System.out.print("Tipo de vehiculo (1 - Tirusmo, 2 - Motocicleta) : ");
            int tipoVehiculo = sc.nextInt();
            System.out.print("Introduzca matricula: ");
            String matricula = sc.next();
            if( tipoVehiculo == 1 ){
                System.out.print("Introduzca combustible (1- Gasolina, 2- Diesel, 3- Electrico): ");
                int combustible = sc.nextInt();
                System.out.print("Tiene calefacción? (Si - No): ");
                String calefaccion = sc.next().toLowerCase();
                boolean tieneCalefaccion = false;
                if (calefaccion.equals("si")){
                    tieneCalefaccion = true;
                } 
                System.out.print("Introduzca numero de puertas: ");
                int nPuertas = sc.nextInt();
                Coche vehiculo = new Coche(matricula, combustible, propietario, tieneCalefaccion, nPuertas, servicioPublico);
                lista.add(vehiculo);
                Reparaciones.addFicha(vehiculo);
            }
            if( tipoVehiculo == 2 ){
                System.out.print("Introduzca tipo de carnet (1- A1, 2- A2, 0- A): ");
                int tipo = sc.nextInt();
                Moto vehiculo = new Moto(matricula, 1, propietario, tipo, servicioPublico);
                lista.add(vehiculo);
                Reparaciones.addFicha(vehiculo);
            }

        }else{
            System.out.println("El numero de cliente introducido no existe.");
            Clientes.listar();
        }
    }
   }
      public static Vehiculo buscar(String matricula){
        for (Vehiculo vehiculo : lista){
                if (vehiculo.getMatricula().equals(matricula)){
                    return vehiculo;
                }
            }
        return null;
      }
      
    public static void update(){
      if(lista.size() <= 0){
          System.out.println("No existen vehiculos en el sistema");
      }else{
          Vehiculo vehiculo = null;
          while (vehiculo == null){
              System.out.print("Introduzca matricula (introduzca 'salir' para volver al menu principal): ");
              String matricula = sc.next();
              if (matricula.equals("salir")){
                 break;
              }
              vehiculo = buscar(matricula);
              if (vehiculo == null){
                System.out.println("El vehiculo introducido no existe");
              }else{
                  System.out.print("Introduzca nueva matricula (dejar en blanco para mantener): ");
                  matricula = sc.next();
                  vehiculo.setMatricula(matricula);
                  System.out.print("Introduzca nuevo combustible: (1- gasolina, 2- Diesel, 3- Electrico)");
                  int combustible = sc.nextInt();
                  vehiculo.setCombustible(combustible);
                  System.out.print("Tiene abs? (true para si, false para no): ");
                  Boolean abs = sc.nextBoolean();
                  vehiculo.setAbs(abs);
                  System.out.println("Vehiculo actualizado correctamente");
              }
          }
      }
    }
    
   public static void listar() {
        System.out.println("los vehiculos disponibles son: ");
        for(Vehiculo veh : lista){
            System.out.print("Tipo de vehiculo: "+veh.getClass().getSimpleName());
            System.out.print(", Matrícula: "+veh.getMatricula());
            System.out.println(", Porpietario: "+veh.getCliente().getDni());
        }
   }
   
   public static void listarVehiculos(){
       ArrayList<Vehiculo> vehiculosCliente = new ArrayList<Vehiculo>();
       Cliente propietario = null;
       System.out.print("introduzca numero de cliente:");
       String dni = sc.next();
       for (Vehiculo veh : lista){
           if(veh.getCliente().getDni().equals(dni)){
               vehiculosCliente.add(veh);
           }
       }
       if(vehiculosCliente.size() == 0){
           System.out.println("No existen vehiculos para el cliente indicado");
       }
       else{
           System.out.println("Los vehiculos del cliente "+dni+" son:");
           for ( Vehiculo veh : vehiculosCliente){
               System.out.println("Matricula: "+veh.getMatricula());
           }
       }
    }
}
