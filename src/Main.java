import java.util.ArrayList;

import layout.Detalhe;
import layout.Header;
import layout.Trailler;
import util.DetalheUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Detalhe> listaVendas = new ArrayList<Detalhe>();
		Processamento processamento = new Processamento("arquivos", listaVendas);
		Trailler traillerArquivo = processamento.getTrailler();
		Header headerArquivo = processamento.getHeader();
		DetalheUtil detalheUtil = new DetalheUtil(listaVendas, traillerArquivo, headerArquivo);
	}

}
