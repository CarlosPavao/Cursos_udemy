package fundamentos;

import java.util.Scanner;

public class desafioConversao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String salario1, salario2, salario3;

        //replace é para substituir um caracter por outro.
        
        System.out.println("Digite o primeiro salário: ");
        salario1 = entrada.nextLine().replace(",", ".");
        System.out.println("Digite o segundo salário: ");
        salario2 = entrada.nextLine().replace(",", ".");
        System.out.println("Digite o terceiro salário: ");
        salario3 = entrada.nextLine().replace(",", ".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);

        System.out.println("A média trimestral é: "+((s1+s2+s3)/3));

        entrada.close();
    }
    
}