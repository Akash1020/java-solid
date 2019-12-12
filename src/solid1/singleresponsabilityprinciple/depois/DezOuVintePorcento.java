package solid1.singleresponsabilityprinciple.depois;

public class DezOuVintePorcento implements IRegraDeCalculo{
	
	public double calcular(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }


}
