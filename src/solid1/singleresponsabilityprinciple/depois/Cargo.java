package solid1.singleresponsabilityprinciple.depois;

public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento());
		
	private IRegraDeCalculo regra;
	
	//Passo obrigatoriamente no construtor do ENUM qual implementação dessa interface 'IRegraDeCalculo' será usada para cada tipo do ENUM
	Cargo(IRegraDeCalculo regra) {
		this.regra = regra;
	}

	public IRegraDeCalculo getRegra() {
		return regra;
	}

}
