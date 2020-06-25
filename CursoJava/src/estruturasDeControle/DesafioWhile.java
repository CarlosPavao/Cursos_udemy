package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double total = 0;
        int qntdNotas = 0;
        while(nota != -1){
            
            System.out.print("Digite a Nota do aluno: ");
            nota =entrada.nextDouble();

            if(nota >= 0 && nota <=10){
                total += nota;
                qntdNotas ++;
            }else if(nota != 1){
                System.out.println("Nota Inválida! ;D");
            }
        }

        double media = total/qntdNotas;
        System.out.printf("Média = %.2f\n",media);

        entrada.close();
    }
}