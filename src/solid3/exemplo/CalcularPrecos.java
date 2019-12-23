package solid3.exemplo;

import solid3.ocddip.Compra;

public class CalcularPrecos {

	private ITabelaDePreco tabelaDePreco;
	private IServicoDeEntrega servicoDeEntrega;

	public CalcularPrecos(ITabelaDePreco tabelaDePreco, IServicoDeEntrega servicoDeEntrega) {
		this.tabelaDePreco = tabelaDePreco;
		this.servicoDeEntrega = servicoDeEntrega;
	}

	public double calcula(Compra produto) {
		double desconto = tabelaDePreco.descontoPara(produto.getValor());
		double frete = servicoDeEntrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}

}
