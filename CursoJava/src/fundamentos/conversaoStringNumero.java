package fundamentos;

import javax.swing.JOptionPane;

public class conversaoStringNumero {
    
    public static void main(String[] args) {
        
        /*JOptionPane.showInputDialog 
        *exibe uma tela de mensagem para
        *digitar um valor
        */  
        String valor1 = JOptionPane.showInputDialog(
            "Digite o primeiro numero:"); 
        
        String valor2 = JOptionPane.showInputDialog(
            "Digite o primeiro numero:");
        
        int numero1 = Integer.parseInt(valor1);
        
        int numero2 = Integer.parseInt(valor2);

        int resultado = numero1 + numero2;
        System.out.println("Soma é "+resultado);
        System.out.println("Média é "+resultado/2);
    }
}