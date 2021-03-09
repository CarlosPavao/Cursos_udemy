package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final int AJUSTE= 32;
		final double FATOR = 5.0/9;
		
		int fahrenheit = 86;
				double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura = "+celsius+" Cº");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura = "+celsius+" Cº");
	}
}
