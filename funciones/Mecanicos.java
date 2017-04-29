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
            Mecanico mecanico = new Mecanico("7483389"+i, "mecanico"+i, i, 62544520+i);
            lista.add(mecanico);
        }
    }
}
