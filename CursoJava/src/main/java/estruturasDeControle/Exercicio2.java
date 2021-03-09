package estruturasDeControle;

import java.util.Scanner;

/* 
2. Criar um programa informa se o ano atual é um ano bissexto;  
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano;
        
        System.out.print("Digite o Ano: ");
        ano =   entrada.nextInt();
        if(ano % 4 == 0){
            System.out.println(ano + " é um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
        entrada.close();
    }
}