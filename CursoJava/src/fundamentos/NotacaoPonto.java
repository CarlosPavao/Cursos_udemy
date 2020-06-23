/**
 * 
 * @author Carlos Pavão <carlos.henrique93msn.com>
 */
package fundamentos;

import java.util.Scanner;

public class NotacaoPonto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String s = "Bom dia X";
        //s.toUpperCase() deixa todas as letras maisculas.
        s = s.toUpperCase();
        //s.replace Substitui o X pot senhora.
        s = s.replace("X", "Senhora");
        //concatena com o resto da frase.
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        /*System.out.println("Leo".toUpperCase());
        *Mesma coisa que a  String de cima
        */

        
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        //Vai Trocar o X pelo Nome informado pelo usuario
        String y = "Bom dia X!!!"
            .replace("X",nome);//.concat("!!!");
        
            System.out.println(y);
        entrada.close();
    }
}