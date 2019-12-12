package solid1.singleresponsabilityprinciple.depois;

public class QuinzeOuVinteCincoPorcento implements IRegraDeCalculo {
	
	 public double calcular(Funcionario funcionario) {
	        if(funcionario.getSalarioBase() > 2000.0) {
	            return funcionario.getSalarioBase() * 0.75;
	        }
	        else {
	            return funcionario.getSalarioBase() * 0.85;
	        }
	    }

}
