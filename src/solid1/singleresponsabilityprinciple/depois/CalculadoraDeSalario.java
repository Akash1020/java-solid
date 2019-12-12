package solid1.singleresponsabilityprinciple.depois;

public class CalculadoraDeSalario {
	
	//Quando chamarmos o calculaSalario será retornado o resultado do método que calcula o salário de acordo com a sua implementação...
	//Saberemos qual é a respectiva interface a ser usado de acordo com oq vim do Funcionario, qual cargo dele será o responsavel por saber qual
	//implementação será chamada
	public static double calcula(Funcionario funcionario) {
		return funcionario.calculaSalario();
    }

}
