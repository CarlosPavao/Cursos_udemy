package oo.Heranca;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */

public class Heroi extends Jogador{
    /*
    *extend significa que vai receber código de Jogador por herança
    */  
    
    /*
    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        
        if((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)){
            oponente.vida -=10;
            return true;
        }else{
            return false;
        } 
        
    }
    */
    public Heroi(int x, int y){
        super(x,y);
    }

    @Override
        public boolean atacar(Jogador oponente){
            /*
            Para não ser necessario reescrever o código da classe pai,
            Basta usar Super
            */
            boolean ataque1 = super.atacar(oponente);
            boolean ataque2 = super.atacar(oponente);
            boolean ataque3 = super.atacar(oponente);
            return ataque1 || ataque2 || ataque3;
        
        }
}
