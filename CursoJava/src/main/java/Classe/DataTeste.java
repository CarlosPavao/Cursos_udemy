package Classe;

public class DataTeste {
    public static void main(String[] args) {
        
        Data data1 = new Data(15, "Outubro", 1993);
        

        Data data2 = new Data();
        data2.dia = 27;
        data2.mes ="Janeiro";
        data2.ano = 2017;
        
        System.out.println(data1.dataFormatada());
        data2.obterData();
    } 
}