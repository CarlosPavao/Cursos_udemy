package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    
    public static void main(String[] args) {
        
        double a =1;
        System.out.println(a);

        //Conversão Explicita esta ciente
        // que pode ocorrer perda de informação
        float b = (float)1.123458845;
        System.out.println(b);

        int c = 130;
        System.out.println(c);
         //Conversão Explicita esta ciente
        // que pode ocorrer perda de informação
        byte d = (byte) c;
        System.out.println(d);
        double e = 1.9999;
        int f =(int) e;
        System.out.println(e +"\n"+ f);
    }
}