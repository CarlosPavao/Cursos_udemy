package oo.composicao.Desafio;

import java.util.ArrayList;


public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();
    
    Cliente(String nome){
        this.nome=nome;
    }
    
    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    double getValorTotal(){
        double total = 0;
        for(Compra compra:compras){
            total += compra.getValorTotal();
        }
        return total;
    }
}

/*Criar um cliente 
duas compras
cada compra dois itens
*/