package solid2.acoplamentoestabilidade.antes;

public class EnviadorDeEmail {
	
    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}