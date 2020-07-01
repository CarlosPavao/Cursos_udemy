package estruturasDeControle;

import java.util.Scanner;

/* 6. Jogo da adivinhação: Tentar adivinhar um número 
entre 0 - 100. Armazene um numero aleatório em uma 
variável. O Jogador tem 10 tentativas para adivinhar 
o número gerado. Ao final de cada tentativa, imprima 
a quantidade de tentativas restantes, e imprima se o 
número inserido é maior ou menor do que o número 
armazenado. 
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tentativa, secreto = 99;int qntdTentativas=0;
        
        for(int i = 1;i <= 10; i++){
            System.out.print("Advinhe o número: ");
            tentativa = entrada.nextInt();
            
            if(tentativa != secreto){
                if(tentativa < secreto){
                    System.out.println("O número secreto é maior ;D");
                }else{
                    System.out.println("O número secreto é menor ;D");
                }
            }else{
                System.out.println("Parabéns, voce acertou o número!");
                break;
            }
            
            qntdTentativas = 10 - i;
            System.out.println("Voce tem "+qntdTentativas+" chance(s).");
        }
        System.out.println("Fim!");
        entrada.close();
    }
}