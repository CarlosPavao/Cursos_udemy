package fundamentos;
// Criar um programa que leia o peso e a altura do usuário e imprima no console 
//o IMC.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, altura,imc;

        System.out.print("Qual o seu Peso: ");
        peso = entrada.nextDouble();
        System.out.print("Qual sua altura: ");
        altura=entrada.nextDouble();

        imc = (peso /Math.pow(altura, 2));

        System.out.printf("O seu IMC é: %.2f\n",imc);

        entrada.close();

    }
    
}