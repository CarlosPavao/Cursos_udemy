package estruturasDeControle;
/* 
5. Refatorar o exercício 04, utilizando a estrutura switch.  
*/
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero,cont = 0;
       
        System.out.print("Digite um numero para verificar se é primo: ");
		numero = entrada.nextInt();

        for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				cont++;
			}
		}
		switch (cont) {
            case 0:
                System.out.println("O numero " + numero + " é um numero primo.");
                break;
            default:
                System.out.println("O numero " + numero + "  não é um numero primo.");
        }
            entrada.close();
        }
}
   