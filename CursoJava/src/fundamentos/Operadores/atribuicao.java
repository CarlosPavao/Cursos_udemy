package fundamentos.Operadores;

public class atribuicao {
    
    public static void main(String[] args) {
        
        int a = 3;
        int b = a;
        int c = a + b;
        
        //c = c + b;
        c += b;
        //c = c - b;
        c -= b;
        //c = c * b;
        c *= b;
        //c = c / b;
        c /= a;
        
        System.out.println(c);        
        
        //c = c % b;
        c %= 2;
        System.out.println(c);
    }
}
