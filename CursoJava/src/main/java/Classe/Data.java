package Classe;

public class Data {
    
    String mes;
    int dia;
    int ano;
   
    Data(){
        /* dia = 01;
        mes = "Janeiro";
        ano = 1970;  */
        this(01,"Janeiro",1970);

    }
    Data(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }
    String dataFormatada(){
        final String formato = "\n%d de %s de %d";
        return String.format(formato, dia, mes, ano);
    }
    void obterData() {//Não aconselhado usara esse tipo de função
        System.out.print("\n"+ dia +" de " 
                    + mes +" de " + ano + ".\n");
    }
    
}