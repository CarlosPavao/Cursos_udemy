package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        //Primeira forma de adicionar na lista;
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        //Segunda Forma de adicionar na lista;
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        //Acessar pela indice;
        System.out.println(lista.get(3));
        //Duas formas de remover um nome da lista.
        System.out.println(">>>>>>>>"+lista.remove(1));
        //2
        System.out.println(lista.remove(new Usuario("Manu")));
         
        System.out.println("Tem? "+lista.contains(new Usuario("Lia")));
        
        for(Usuario u: lista){
            System.out.println(u);
        }
    }
}