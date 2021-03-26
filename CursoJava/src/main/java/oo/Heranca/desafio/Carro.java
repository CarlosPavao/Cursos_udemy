package oo.Heranca.desafio;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Carro {
    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    private int delta = 5;
    
    
    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void Acelerar(){
        
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }
        
    }
    
    public void Frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual =0;
        }
        
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }


}
