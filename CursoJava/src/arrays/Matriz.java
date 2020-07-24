package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int qntdAlunos, qntdNotas;
        double total = 0;
        double media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de alunos?");
        qntdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        qntdNotas = entrada.nextInt();

        double[] [] notasDaTurma = new double [qntdAlunos][qntdNotas];

        for(int i = 0; i < notasDaTurma.length;i++){
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d:",j+1,i+1);
                notasDaTurma[i][j]=entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        media = total/(qntdAlunos*qntdNotas);
        System.out.println("A média da turma é: "+media);

        for(double[] notasDoAluno:notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        
        entrada.close();
    }
}