package fundamentos;

public class DesafiosAritmeticos {
    public static void main(String[] args) {
        
        int dividendo1 = 6*(3+2);
        int elevado1 = (int) Math.pow(dividendo1, 2);
        int resultado1 =elevado1/(3*2);
        
        int dividendo2 = ((1 - 5) * (2 - 7));
        int divisao2 = dividendo2/2;
        int resultado2 = (int) Math.pow(divisao2, 2);
        
        System.out.println(resultado2);
        
        int subtracao = resultado1-resultado2;
        int potenciaDividendo = (int)Math.pow(subtracao, 3);
        int potenciaDivisor = (int)Math.pow(10, 3);
        int resultadoFinal = potenciaDividendo/potenciaDivisor;

        System.out.println(resultadoFinal);
        
    }
    
}