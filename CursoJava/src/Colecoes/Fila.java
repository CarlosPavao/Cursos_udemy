package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        //Offer e Add -> adiciona elementos na fila
        //Diferença é o comportamento ocorre
        //quando a fila esta cheia!
                fila.add("Ana");//Retorna false
        fila.offer("Bia");//lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Guilherme");

        //Peek e Element -> Obter o proximo elemento da fila(Sem Remover)
        //diferença é o comportamento ocorre
        //quando a fila esta vazia!
        System.out.println(fila.peek());//Retrona Null
        System.out.println(fila.peek());
        System.out.println(fila.element());//Lança uma excesão
        System.out.println(fila.element());

        //Poll e Remove -> Obter o proximo elemento 
        //da fila e remove!
        //diferença é o comportamento ocorre
        //quando a fila esta vazia!
        System.out.println(fila.poll());//retorne Null
        System.out.println(fila.remove());//Lança uma execeção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //fila.size(); contar tamanho da fila
        //fila.clear(); limpar a fila
        //fila.isEmpty();
        //fila.contains(...)Esta ou não contido;
        
    }
}