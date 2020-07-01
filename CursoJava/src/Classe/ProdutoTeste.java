package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4356.89, 0.25);
        
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        double precofinal1 = p1.precoComDescon();
        double precofinal2 = p2.precoComDescon();
        
        System.out.print("\nProduto: " + p1.nome + "\n");
        System.out.print("Preço : " + p1.preco + "\n");
        System.out.print("Desconto: " + p1.desconto + "\n");
        System.out.printf("O valor final do item é : R$%.2f\n",precofinal1);
        
        System.out.print("\nProduto: " + p2.nome + "\n");
        System.out.print("Preço : " + p2.preco + "\n");
        System.out.print("Desconto: " + p2.desconto + "\n");
        System.out.printf("O valor final do item é : R$%.2f\n",precofinal2);
        System.out.println();
    }
}