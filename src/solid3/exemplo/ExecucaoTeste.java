package solid3.exemplo;

public class ExecucaoTeste {
	
	public static void main(String[] args) {
		
		//Interface PADRÃO -> Implementações diferentes
		//Pensar sempre na abstração, pensar nos padrões.... deixar de lado a implementação
		ITabelaDePreco tabelaA = new TabelaDePrecoDiferenteA();
		ITabelaDePreco tabelaB = new TabelaDePrecoDiferenciaaalB();
		
		
		IServicoDeEntrega entregaNormal = new Frete();
		IServicoDeEntrega entregaMotoboy = new FreteMotoboy();
		
		
		//Calculo os precos da tabela de precos A e a entrega de Frete
		new CalcularPrecos(tabelaA, entregaNormal);
		
		
		//Calculo os precos da tabela de precos A e a entrega de Frete (poderia ter criado um Frete dif)
		new CalcularPrecos(tabelaB, entregaMotoboy);
		
		
		
		
	}

}
