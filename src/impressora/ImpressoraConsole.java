package impressora;

public class ImpressoraConsole implements Impressora{

	@Override
	public void imprimir(String texto) {
		System.out.println(texto);
	}

}
