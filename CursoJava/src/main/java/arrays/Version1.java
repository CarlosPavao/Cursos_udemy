package arrays;

import java.util.Arrays;

public class Version1 {
    public static void main(String[] args) {
        double totalAlunoB = 0;
        double totalAlunoA = 0;
        final double notaArmazenada = 5.9;
        
        double [] notasAlunoA = new double [4];
        
        notasAlunoA [0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA.length - 1);
        
        /* for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        } */
        for(double alunoA: notasAlunoA){
            totalAlunoA += alunoA;
        }
                
        System.out.println("A nota do aluno A é : "+totalAlunoA/notasAlunoA.length);
        
        double[]notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
        
        
        for(double alunoB: notasAlunoB){
            totalAlunoB += alunoB;
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
