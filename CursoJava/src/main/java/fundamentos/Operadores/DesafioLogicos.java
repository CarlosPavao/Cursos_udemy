package fundamentos.Operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //trabalho terça(V ou F).
        //trabalho quinta(V ou F).
        /*
        dois derem certo vai comprar uma de 50
        se somente um vai comprar uma de 32
        indo a shop tomar sorvete

        */
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2; 
        boolean comprouSorvete = comprouTv50 ||comprouTv32;
        
        System.out.println("Comprou Tv 50?\" "+comprouTv50);
        System.out.println("Comprou Tv 32?\" "+comprouTv32);
        System.out.println("Comprou sorvete?\" "+comprouSorvete);
        System.out.println("Mais Saudável?\" "+ !comprouSorvete);
        
    }
}