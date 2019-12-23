package solid2.acoplamentoestabilidade.depois;

public class NotaFiscalDao implements AcaoAposGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}