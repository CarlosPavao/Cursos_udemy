package fundamentos.Operadores;

public class ternario {
    
    public static void main(String[] args) {
        double media = 8.6;
        // Atribuição condicional.
        String resultadoParcial = media>= 5.0 ? 
            "em recuperação." : "reprovado."; 
        String resultadoFinal = media>= 7.0 ? 
            "aprovado." : resultadoParcial;

        System.out.println("O aluno esta: " + resultadoFinal);

        
        double nota = 7.3;  
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        // Ultilizar para subtituir false ou true
        String resultado = temDesconto ? 
                "Sim." : "Não.";
        
        System.out.println("Tem desconto? " +resultado);

    }
}