package arrays;

import java.util.Scanner;

public class ExercicioArrays {
    public static void main(String[] args) {
        int qntdNotas;
        double somaNotas = 0;
        double media;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas você deseja inserir: ");
        qntdNotas = entrada.nextInt();

        double [] notas = new double [qntdNotas];

        for(int i = 0; i <notas.length; i++){
            System.out.println("Qual a "+(i+1)+"º nota: ");
            notas[i] = entrada.nextDouble();
        }
        
        for(double nota:notas){
            somaNotas += nota;
        }
        media = somaNotas/notas.length;
        System.out.println("A média do aluno é: "+media);
        
        entrada.close();
    }

}