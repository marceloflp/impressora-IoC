package impressora;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ImpressoraArquivo implements Impressora{
	
	String path = "C:\\Users\\Usuario\\Documents\\arquivo.txt"; //Modificar "Usuario" pelo nome da máquina
	
	@Override
	public void imprimir(String texto) {
		
		String relatorio[] = {texto};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String linha: relatorio) {
				bw.write(linha);
				bw.newLine();
			}
			
		} catch(IOException e) {
			System.out.println("Ocorreu um erro ao escrever o arquivo.");
			e.printStackTrace();
		}
		
	}
	
}
