package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
class Compra {

    final List<Item> itens = new ArrayList<>();
    
    void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p,qtde));
    }
    
    void adicionarItem(String nome, double preco, int qtde){
        Produto produto = new Produto(nome,preco);
        this.itens.add(new Item(produto,qtde));
    }
    
    double getValorTotal(){
        double total =0;
        for (Item item:itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
