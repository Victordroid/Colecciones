package com.example.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Victor on 09/02/2018.
 */

public class Principal {
    public static void main(String[] main) {
        /*Set<String> arbolconjunto = new TreeSet();
        Set<String> tablahash = new HashSet();
        Set<String> tablaenlazada = new LinkedHashSet();
        arbolconjunto.add("manzana");
        arbolconjunto.add("pera");
        arbolconjunto.add("fresa");
        arbolconjunto.add("naranja");
        arbolconjunto.remove("pera");
        arbolconjunto.add("tus muertos");
        arbolconjunto.add("melón");
        System.out.println("Vacia? "+ arbolconjunto.isEmpty());
        tablahash.addAll(arbolconjunto);
        System.out.println("Vacia? "+ tablahash.isEmpty());
        for(String s : arbolconjunto) {
            System.out.println(s);
        }
        for(String t : tablahash) {
            System.out.println("TablaHash: "+(t));
        }*/

        List<Complejos> lista = new ArrayList<Complejos>();
        lista.add( new Complejos(1.0, 5.0) );
        lista.add( new Complejos(2.0, 4.2) );
        lista.add(1, new Complejos(3.0, 0.0) );lista.remove(0);
        for(Complejos c: lista) {
            System.out.println(c);
        }
    }
}
