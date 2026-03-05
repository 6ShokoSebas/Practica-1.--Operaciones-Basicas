/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opbasicas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gbs66
 */
public class Lenguaje {
    
    private Set<String> alfabeto;
    
    public Lenguaje(String simbolos) {
        this.alfabeto = new HashSet<>();
        for(int i = 0; i < simbolos.length(); i++) {
            alfabeto.add(simbolos.charAt(i) + "");
        }
    }
    
    public Set<String> obtenerPositiva(int maxLongitud) {
        Set<String> resultado = new HashSet<>(this.alfabeto);
        Set<String> actual = new HashSet<>(this.alfabeto);

        while (true) {
            Set<String> siguiente = new HashSet<>();

            for (String s1 : actual) {
                for (String s2 : this.alfabeto) {
                    String nueva = s1 + s2;
                    if (nueva.length() <= maxLongitud) {
                        siguiente.add(nueva);
                    }
                }
            }

            if (siguiente.isEmpty()) break;

            resultado.addAll(siguiente);
            actual = siguiente;
        }

        return resultado;
    }
    
    public Set<String> obtenerKleene(int maxLongitud) {
        Set<String> resultado = obtenerPositiva(maxLongitud);
        resultado.add(" Ø");
        return resultado;
    }
    
    public static Set<String> obtenerPrefijos(String w) {
        Set<String> resultado = new HashSet<>();

        for (int i = 0; i <= w.length(); i++) {
            resultado.add(w.substring(0, i));
        }

        return resultado;
    }
    
    public static Set<String> obtenerSufijos(String w) {
        Set<String> resultado = new HashSet<>();

        for (int i = 0; i <= w.length(); i++) {
            resultado.add(w.substring(i));
        }

        return resultado;
    }
    
    public static Set<String> obtenerSubcadenas(String w) {
        Set<String> resultado = new HashSet<>();

        for (int i = 0; i <= w.length(); i++) {
            for (int j = i; j <= w.length(); j++) {
                resultado.add(w.substring(i, j));
            }
        }

        return resultado;
    }
}
