package fundamentos;

public class conversaoNumeroString {
    
    public static void main(String[] args) {
        Integer num1=10000;
        System.out.println(num1.toString());

        int num2=10000;
        System.out.println(Integer.toString(num2));

        //Conversão de numero para String.
        System.out.println((""+num1).length());
        System.out.println((""+num2).length());
    }
}