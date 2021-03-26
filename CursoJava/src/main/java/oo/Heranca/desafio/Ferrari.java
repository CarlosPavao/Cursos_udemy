package oo.Heranca.desafio;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Ferrari extends Carro implements Esportivo, Luxo{
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;
    Ferrari(){

        this(315);
    }


    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void DesligarAr() {
        ligarAr = true;
    }



    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else if (!ligarTurbo && !ligarAr){
            return 20;
        }else {
            return 15;
        }
    }

    //@Override
//void Acelerar() {
//    velocidadeAtual += 15;
//}
    
    
    
    
    
}


