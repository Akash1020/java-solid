package solid4.telldontsask.depois;

public class GeradorDePDF implements IGerarArquivo {

	@Override
	public String gerarArquivo() {
		return "Arquivo PDF gerado!";
	}

	@Override
	public Boolean validarFormatoPDF() {
		double a = 1.0;
		return a == 1.0 ? true : false;
	}

}
