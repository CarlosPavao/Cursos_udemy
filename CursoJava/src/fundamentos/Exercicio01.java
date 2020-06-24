package fundamentos;
//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double celsius, fahrenheit;
        
        System.out.println("Digite o grau em Celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = (((celsius/5)*9)+32);

        System.out.println(celsius+"ºC = "+fahrenheit+"ºF");

        entrada.close();
    }
}