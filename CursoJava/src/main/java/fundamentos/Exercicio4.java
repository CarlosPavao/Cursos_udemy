package fundamentos;
//Criar um programa que leia o valor da base e da altura de um triângulo e 
//calcule a área.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Digite a altura do Triângulo: ");
        base = entrada.nextInt();
        System.out.print("Digite a base do Triângulo: ");
        altura = entrada.nextInt();

        area = ((base*altura)/2);

        System.out.printf("A área do triângulo é: %.2f",area);

        entrada.close();
    }

    
    
}