package Lambdas;

/**
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Soma implements Calculo {

    @Override
    public double executar(double a, double b) {
        return a + b;
    }

}
