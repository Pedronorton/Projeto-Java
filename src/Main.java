import java.util.ArrayList;

import Layout.Detalhe;
import Layout.Header;
import Layout.Trailler;
import Util.DetalheUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Detalhe> listaVendas = new ArrayList<Detalhe>();
		Processamento p = new Processamento("arquivos", listaVendas);
		Trailler traillerArquivo = p.getTrailler();
		Header headerArquivo = p.getHeader();
		DetalheUtil d = new DetalheUtil(listaVendas, traillerArquivo, headerArquivo);
	}

}
