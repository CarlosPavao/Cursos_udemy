package estruturasDeControle;

import java.util.Scanner;

/* 9. Crie um programa que recebe 10 valores e ao 
final imprima o maior número.  */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;int comparacao = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Digite o ["+i+"º] número: " );
            num = entrada.nextInt();
            if(num > comparacao){
                comparacao = num;
            }
        }
        System.out.printf("O maior número digitado foi: %d\n",comparacao);

        entrada.close();
    }
}