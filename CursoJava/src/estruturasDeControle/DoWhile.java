package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor ="";
        do{
            System.out.println("Você precisa falar "+
                    "\nas palavras mágicas");
            System.out.println("Quer sair?");
            valor = entrada.nextLine();
        }while(!valor.equalsIgnoreCase("por favor"));
        
        System.out.println("Obrigado");
        entrada.close();
    }
    
}