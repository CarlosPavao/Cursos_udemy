package Classe;

public class VarlorVsReferencia {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println("\n"+ a + " "+b);

        Data d1 = new Data(1, "Junho", 2022);
        Data d2 = d1;

        d1.dia = 31;
        d2.mes = "Dezembro";

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
        
        voltarDataParaValorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        
    }
    
    //Não é uma boa pratica fazer isso abaixo.
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = "Janeiro";
        d.ano = 1970;
    }
    
}