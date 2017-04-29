package funciones;

import classes.*;
import java.util.*;

/**
 * Write a description of class Mecanicos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mecanicos
{
    public static ArrayList<Mecanico> lista = new ArrayList<Mecanico>();

    public static void addMecanicos()
    {
        for (int i = 0; i <= 2; i++){
            Mecanico mecanico = new Mecanico("7483389"+i, "mecanico"+i, i, 62544520+i, i);
            lista.add(mecanico);
        }
    }
    
    public static Mecanico buscar(int id){
        for (Mecanico mecanico : lista){
                if (mecanico.getId() == id){
                    return mecanico;
                }
            }
        return null;
      }
      
   public static void listar() {
        System.out.println("los mecanicos disponibles son: ");
        for(Mecanico mec : lista){
            System.out.print("id: "+mec.getId());
            System.out.println("Nombre: "+mec.getNombre());
        }
   }
}
