package solid1.singleresponsabilityprinciple.depois;

public class ExecuteSingleResponsabilityPrinciple {
	
	public static void main(String[] args) {
		System.out.print("OLÁ");
		
		Cargo c1 = Cargo.DESENVOLVEDOR;
		Cargo c2 = Cargo.DBA;
		
		Funcionario f1 = new Funcionario("Murillo Pezzuol", c1, 4500d);
		Funcionario f2 = new Funcionario("Raul Zambelli", c2, 4500d);
		
		System.out.println("################## INICIO ##################");
		System.out.println("Funcionário: " + f1.getNome());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Salário Base: " + f1.getSalarioBase());
		System.out.println("Calculo final: " + CalculadoraDeSalario.calcula(f1));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("################## INICIO ##################");
		System.out.println("Funcionário: " + f2.getNome());
		System.out.println("Cargo: " + f2.getCargo());
		System.out.println("Salário Base: " + f2.getSalarioBase());
		System.out.println("Calculo final: " + CalculadoraDeSalario.calcula(f2));
		
		System.out.println("################## FIM ##################");
	}

}
