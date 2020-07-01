package Classe;

public class Data {
    
    String mes;
    int dia;
    int ano;
   
    Data(){
        dia = 01;
        mes = "Janeiro";
        ano = 1970; 

    }
    Data(int diaInicial, String mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
        
    }
    void obterData() {//Não aconselhado usara esse tipo de função
        System.out.print("\n"+ dia +" de " 
                    + mes +" de " + ano + ".\n");
    }
    String dataFormatada(){
        
        return String.format("\n%d de %s de %d", dia,mes,ano);
    }
}