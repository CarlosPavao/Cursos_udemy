package oo.composicao;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class compraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.Cliente = "João Pedro";
        compra1.itens.add(new Item("Caneta",20,7.45));
        compra1.itens.add(new Item("Borracha",12,3.89));
        compra1.itens.add(new Item("Caderno",3,18.79));
        
        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());
        
        Compra compra2 = new Compra();
        compra2.Cliente = "Maria Cristina";
        compra2.adicionarItem("Caneta", 10, 4.90);
        compra2.adicionarItem("Borracha",12,3.89);
        compra2.adicionarItem("Caderno",3,18.79);
        
        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());
        
        //Somente para mostrar a relação bidirecionaç
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é: R$" + total);
    }
}
