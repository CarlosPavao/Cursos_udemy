package oo.composicao.Desafio;



/**
 *
 * @author Carlos Pavão
 */
public class Sistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria Julia");
        
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta",1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);
        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno",10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);
        
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);
        
        System.out.println(cliente.getValorTotal());
    }
    
}
/*
Cliente
duas compras
cada compra com dois itens
cada item associado a produtos diferentes
joga os itens dentro da compra
compra associada ao cliente
em cliente chamar o metodo getValorTotal
cada compra percorer os itens
cada item pegar a quantidade
olhar o preço e mutiplicar pela quantidade
e vai obter valor total. 
*/