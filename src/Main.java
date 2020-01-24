import java.util.ArrayList;

import Layout.Detalhe;
import Layout.Header;
import Layout.Trailler;
import Util.DetalheUtil;

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
