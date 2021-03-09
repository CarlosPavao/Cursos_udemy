package estruturasDeControle;

public class DesafioFor {
    public static void main(String[] args) {
        //Versão desafio
        //Não pode usar valor numérico para controlar o laço
        
        for(String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
        
        System.out.println();
        
        String valor = "#";
        for(int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }
    }
}