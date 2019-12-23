package solid4.telldontsask.depois;

public class ExecucaoTeste {

	public static void main(String[] args) {
		
		IGerarArquivo pdf = new GeradorDePDF();
		IGerarArquivo csv = new GeradorDeCSV();
		
		
		//PERGUNTAS DO 'TELL DONT ASK'
		//1. O QUE O MÉTODO FAZ? R: Validar o formato do PDF
		//2. COMO ELE FAZ? R: NÃO SEI, NUNCA DEVEMOS SABER COMO ELE FAZ
		
		//CONCLUSÃO: Nunca devemos saber o que ele faz, simplemente devemos chama-lo... Caso mude a regra, todas as chamadas não mudarão
		
		Boolean validPDF = pdf.validarFormatoPDF();
		System.out.println("PDF: " + pdf.gerarArquivo());
		System.out.println("PDF Valido: " + validPDF);
		
		System.out.println();
		
		Boolean validCSV = csv.validarFormatoPDF();
		System.out.println("MSG: " + csv.gerarArquivo());
		System.out.println("CSV Valido: " + validCSV);
	}

}
