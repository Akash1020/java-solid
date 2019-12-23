package solid4.telldontsask.depois;

public class GeradorDeCSV implements IGerarArquivo {

	@Override
	public String gerarArquivo() {
		return "Arquivo CSV gerado!";
	}

	@Override
	public Boolean validarFormatoPDF() {
		double a = 2.0;
		return a == 2.0 ? false : true;
	}

}
