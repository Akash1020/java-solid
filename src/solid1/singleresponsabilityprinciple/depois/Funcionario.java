package solid1.singleresponsabilityprinciple.depois;

import java.util.Calendar;

import solid1.singleresponsabilityprinciple.depois.Cargo;

public class Funcionario {
	
	private int id;
	private String nome;
	private Cargo cargo;
	private Calendar dataDeAdmissao;
	private double salarioBase;
	
	//Esse método retorna qual é a 'regra' de calculo para ser executada de acordo com a interface implementada respectiva
	//DezOuVintePorcento ou QuinzeOuVinteCincoPorcento
	//THIS -> faz referencia para a própria classe, ou seja Funcionario
	public double calculaSalario() {
		return cargo.getRegra().calcular(this);
	}
	
	Funcionario(String nome, Cargo cargo, double salarioBase){
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Calendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(Calendar dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
