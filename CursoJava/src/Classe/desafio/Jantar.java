package Classe.desafio;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        String prato1,prato2,nome;
        double calorias, calorias2, peso;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual seu nome:");
        nome = entrada.nextLine();
        
        System.out.print("Qual seu peso:");
        peso = entrada.nextDouble();
        
        System.out.print("Digite o nome do prato:");
        prato1 = entrada.next();

        System.out.print("Digite a caloria do prato:");
        calorias = entrada.nextDouble();
        
        System.out.print("Digite o nome do prato:");
        prato2 = entrada.next();
        
        System.out.print("Digite a caloria do prato:");
        calorias2 = entrada.nextDouble();
       
        Comida comida1 = new Comida(prato1, calorias);
        Comida comida2 = new Comida(prato2, calorias2); 

        Pessoa p1 = new Pessoa(nome, peso);
       
        System.out.println(p1.apresentar());
        p1.comer(comida1);
        System.out.println(p1.apresentar());
        p1.comer(comida2);
        System.out.println(p1.apresentar());
    
    entrada.close();
    }
}