package estruturasDeControle;

import java.util.Scanner;

/*
8. Criar um programa que receba uma palavra
e imprime no console letra por letra. 
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
		String palavra = entrada.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		entrada.close();
	}
}