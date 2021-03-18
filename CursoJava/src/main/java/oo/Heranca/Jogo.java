package oo.Heranca;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Jogo {
    public static void main(String[] args) {
        
        Monstro Monstro = new Monstro();
        
        Monstro.x = 10;
        Monstro.y = 10;
        
        Jogador Heroi = new Heroi();
        
        Heroi.x = 10;
        Heroi.y = 11;
                
        
        
        
        System.out.println("Monstro tem =>"+Monstro.vida);
        System.out.println("Heroi tem =>"+Heroi.vida);
        
        Monstro.atacar(Heroi);
        Heroi.atacar(Monstro);
        
        Monstro.atacar(Heroi);
        Heroi.atacar(Monstro);
        
        Monstro.atacar(Heroi);
        Heroi.atacar(Monstro);
        
        Monstro.atacar(Heroi);
        Heroi.atacar(Monstro);
        
        Monstro.andar(Direcao.NORTE);
        Monstro.atacar(Heroi);
        Heroi.atacar(Monstro);
        
       System.out.println("Monstro tem =>"+Monstro.vida);
        System.out.println("Heroi tem =>"+Heroi.vida);
        
        
    }
}
