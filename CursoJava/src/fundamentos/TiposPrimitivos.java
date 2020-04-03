package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		
		//Tipos Numéricos
		byte anosDeEmpresa = 23;
		short numeroDeVoos= 542;
		int id = 56789;
		/*l no final do numero converte o numero para uma 
		 * variavel long em vez de int
		*/
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos Numericos Reais.
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; 
		
		//Tipo Caractere
		char status = 'A';//Ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+ ": ganha -> "+salario);
		System.out.println("Férias? "+estaDeFerias);
		System.out.println("Status: "+status);
		
		
	}
}
