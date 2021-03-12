package oo.composicao;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;
    
    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
