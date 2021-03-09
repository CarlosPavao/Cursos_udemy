package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //<....> define qual tipo de lista 
        //Set não é possivel acessar pelo índice.
        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        //Exibi na ordem que foi introduzido.
        System.out.println("");
            SortedSet<String> listaAprovados1 = new TreeSet<>();
            listaAprovados1.add("Ana");
            listaAprovados1.add("Carlos");
            listaAprovados1.add("Luca");
            listaAprovados1.add("Pedro");
    
            for(String candidato1: listaAprovados1){
                System.out.println(candidato1);
        }
        Set<Integer> numero = new HashSet<>();
        numero.add(1);
        numero.add(2);
        numero.add(120);
        numero.add(6);
        for(int n:numero){
            System.out.println(n);
        }
    }    
}