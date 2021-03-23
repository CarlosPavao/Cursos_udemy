package oo.encapsulamento.CasaA;

import oo.encapsulamento.CasaA.Ana;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){
        /*
        como é privado não tem como ter acesso a informação;
        System.out.println(esposa.segredo);
        */
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFala);
        System.out.println(esposa.todosSabem);
    }
}
