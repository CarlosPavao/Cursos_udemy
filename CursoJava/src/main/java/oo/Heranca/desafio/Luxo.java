package oo.Heranca.desafio;

public interface Luxo {
    void ligarAr();
    void DesligarAr();
    default int velocidadeDoAr(){
        return 1;
    }
}
