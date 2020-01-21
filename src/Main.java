import java.util.ArrayList;

import Layout.Detalhe;
import Util.DetalheUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Detalhe> listaVendas = new ArrayList<Detalhe>();
		Processamento p = new Processamento("arquivos", listaVendas);
		
		DetalheUtil d = new DetalheUtil(listaVendas);
	}

}
