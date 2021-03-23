package oo.encapsulamento.CasaB;

import oo.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {


    void testeAcessos(){
        /*
        não consegue acessar mesmo sendo herança;
        System.out.println(segredo);
        System.out.println(facoDentroDeCasa);
        */
        System.out.println(formaDeFala);
        System.out.println(todosSabem);
    }
}
