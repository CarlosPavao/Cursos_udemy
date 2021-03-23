package oo.Heranca.Teste;

import oo.Heranca.Direcao;
import oo.Heranca.Heroi;
import oo.Heranca.Jogador;
import oo.Heranca.Monstro;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Jogo {
    public static void main(String[] args) {
        
        Monstro monstro1 = new Monstro();
        monstro1.x = 10;
        monstro1.y = 10;
        Monstro monstro2 = new Monstro(10,10);
        Jogador Heroi = new Heroi(10,11);
        
                
        
        
        
        System.out.println("Monstro tem =>"+monstro1.vida);
        System.out.println("Heroi tem =>"+Heroi.vida);
        System.out.println("Monstro tem =>"+monstro2.vida);
        
        
        monstro1.atacar(Heroi);
        Heroi.atacar(monstro1);
        
        monstro1.atacar(Heroi);
        Heroi.atacar(monstro1);
        
        monstro1.atacar(Heroi);
        Heroi.atacar(monstro1);
        
        monstro1.atacar(Heroi);
        Heroi.atacar(monstro1);
        
        monstro1.andar(Direcao.NORTE);
        monstro1.atacar(Heroi);
        Heroi.atacar(monstro1);
        
       System.out.println("Monstro tem =>"+monstro1.vida);
        System.out.println("Heroi tem =>"+Heroi.vida);
        
        
    }
}
