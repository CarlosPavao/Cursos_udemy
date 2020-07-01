package estruturasDeControle;

import java.util.Scanner;

/* 
3. Criar um programa que receba duas notas parciais, 
calcular a média final. Se a nota do aluno for maior 
ou igual a 7.0 imprime no console "Aprovado", se a 
nota for menor que 7.0 e maior do que 4.0 imprime no 
console "Recuperação", caso contrário imprime no 
console "Reprovado".  
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double nota1, nota2,media;
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        media = (nota1+nota2)/2;
        if(media >= 7.0){
            System.out.println("Aprovado!");
        }else if(media < 7.0 && media > 4){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado!");
        }
        entrada.close();
    }    
}