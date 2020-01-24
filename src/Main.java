import java.util.ArrayList;

import layout.Detalhe;
import layout.Header;
import layout.Trailler;
import util.DetalheUtil;
import service.AdquirenteService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Detalhe> listaVendas = new ArrayList<Detalhe>();
		AdquirenteService adquirenteService = new AdquirenteService("arquivos", listaVendas);
		Trailler traillerArquivo = adquirenteService.getTrailler();
		Header headerArquivo = adquirenteService.getHeader();
		DetalheUtil detalheUtil = new DetalheUtil(listaVendas, traillerArquivo, headerArquivo);
	}

}
