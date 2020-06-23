package fundamentos;

import java.util.Scanner;

/* 
ler num 1
ler num 2
dizer a operação:
+ - * / %
 */
public class DesafioCalculadora {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.println("Digite o primeiro valor");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor");
        num2 = entrada.nextDouble();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("+, -, *, /, %");
        String operador = entrada.next();

        resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",num1,operador,num2,resultado);

        entrada.close();
    }
    
}