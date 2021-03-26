/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.Heranca.Teste;

import oo.Heranca.desafio.Carro;
import oo.Heranca.desafio.Civic;
import oo.Heranca.desafio.Ferrari;

/**
 *
 * @author Carlos Pavão
 */
public class CarroTeste {

    public static void main(String[] args) {
       
       Carro c1 = new Civic();
       
       System.out.println(c1.velocidadeAtual);
        
       c1.Acelerar();
       c1.Acelerar();   
       c1.Acelerar();   
       c1.Acelerar();   
       c1.Acelerar();   
       c1.Acelerar();
       
       System.out.println(c1.velocidadeAtual);
       
       c1.Frear();
       c1.Frear();
       c1.Frear();
       
       System.out.println(c1.velocidadeAtual);
        
        c1.Frear();
        c1.Frear();
        c1.Frear();
        c1.Frear();
        
        System.out.println(c1.velocidadeAtual);
        
        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.Acelerar();
        c2.Acelerar();
        c2.desligarTurbo();
        c2.Acelerar();   
        c2.Acelerar(); 
        
        System.out.println("Acelerando: "+ c2.velocidadeAtual);
        System.out.println(c2.velocidadeDoAr());
        
        c2.Frear();
        c2.Frear();
        c2.Frear();
        c2.Frear();
        
        System.out.println("Freiando: "+c2.velocidadeAtual);
       
       
    }
    
}
