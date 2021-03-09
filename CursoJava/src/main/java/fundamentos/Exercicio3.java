package fundamentos;
//Criar um programa que leia um valor e apresente os resultados ao quadrado e 

//ao cubo do valor.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double valor, quadrado, cubo;

        System.out.print("Digite o valor: ");
        valor=entrada.nextDouble();

        quadrado = Math.pow(valor, 2);
        cubo = Math.pow(valor, 3);

        System.out.printf("O %.2f ao quadrado é: %.2f\n",valor,quadrado);
        System.out.printf("O %.2f ao cubo é: %.2f\n",valor,cubo);

        entrada.close();
    }
}