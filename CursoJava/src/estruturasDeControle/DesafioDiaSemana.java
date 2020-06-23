package estruturasDeControle;

import java.util.Scanner;

/* 
Domingo -> 1
Segunda -> 2
Terça   -> 3
Quarta  -> 4
Quinta  -> 5
Sexta   -> 6
Sabado  -> 7        
*/

public class DesafioDiaSemana {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        String dia;
        

        System.out.println("Digite o nome do dia da semana: ");
        dia = entrada.next();
        
        if("Domingo".equalsIgnoreCase(dia)){
            System.out.println("Domingo -> 1");
        }else if("Segunda".equalsIgnoreCase(dia)){
            System.out.println("Segunda -> 2");
        }else if("Terça".equalsIgnoreCase(dia) 
                || "Terca".equalsIgnoreCase(dia) ){
            System.out.println("Terça   -> 3");
        }else if("Quarta".equalsIgnoreCase(dia)){
            System.out.println("Quarta  -> 4");
        }else if("Quinta".equalsIgnoreCase(dia)){
            System.out.println("Quinta  -> 5");
        }else if("Sexta".equalsIgnoreCase(dia)){
            System.out.println("Sexta   -> 6");
        }else if("Sábado".equalsIgnoreCase(dia)
                ||"Sabado".equalsIgnoreCase(dia)){
            System.out.println("Sábado  -> 7");
        }else{
            System.out.println("Dia inválido!");
        }


        
    }
}