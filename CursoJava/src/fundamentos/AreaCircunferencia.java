package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		double raio = 3.4;
		//final deixa a variavel fixa sem poder ser alterada.
		final double PI = 3.14159;
		
		double area = PI*raio*raio;
		
		System.out.println(area);
		
		raio=10;
		area=PI* raio * raio;
		System.out.println("Área = "+area+" m2.");
		
	}

}
