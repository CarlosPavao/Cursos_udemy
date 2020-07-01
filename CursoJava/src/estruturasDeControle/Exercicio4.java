package estruturasDeControle;
/* 
4. Criar um programa que receba um 
número e diga se ele é um número primo.  
 */

import java.util.Scanner;

public class Exercicio4 {
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
		if (cont == 0) {
			System.out.println("O numero " + numero + " é primo.");
		} else {
			System.out.println("O numero " + numero + " não é primo.");
		}
		entrada.close();
	}
}
   