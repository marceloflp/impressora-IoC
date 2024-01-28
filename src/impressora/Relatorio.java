package impressora;

public class Relatorio {

	private Impressora impressora;

	public Relatorio(Impressora impressora) {
		this.impressora = impressora;
	}
	
	public void gerarRelatorio(String texto) {
		impressora.imprimir(texto);
	}
	
}
