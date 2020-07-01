package estruturasDeControle;

import java.util.Scanner;

/* 
7. Criar um programa que enquanto estiver recebendo 
números positivos, imprime no console a soma dos 
números inseridos, caso receba um número negativo, 
encerre o programa. Tente utilizar a estrutura do 
while.  
*/
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0; int soma = 0;
        while(num >= 0){
            System.out.print("\nDigite um número para realizar a soma (Negativo para sair): ");
            num = entrada.nextInt();
            if(num >= 0){
                soma+=num;
                System.out.printf("A soma até o momento é : %d",soma);
            }
        }
        entrada.close();
    }
}