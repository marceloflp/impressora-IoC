package impressora;

public class Main {

	public static void main(String[] args) {
		
		Relatorio info = new Relatorio(new ImpressoraConsole()); //--> imprime o relatório
	//	Relatorio info = new Relatorio(new ImpressoraArquivo()); --> grava o relatório em um arquivo
		
		String relatorio = "NOME: Marcelo Felipe\n"
				+ "NACIONALIDADE: Brasileiro\n"
				+ "PROFISSÃO: Desenvolvedor";	
		
		info.gerarRelatorio(relatorio);
		
	}

}
