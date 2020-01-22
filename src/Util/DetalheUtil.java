package Util;

import java.util.ArrayList;
import java.util.Scanner;

import Layout.Detalhe;

public class DetalheUtil {
	
	public DetalheUtil(ArrayList<Detalhe> listaVendas) {
		Scanner leitura = new Scanner(System.in);
		String bandeira = leitura.nextLine();
		ArrayList<Detalhe> listaBandeiras = filtrarBandeira(listaVendas, bandeira);
		for(Detalhe d : listaBandeiras) {
			System.out.println(d);
		}	
	}
	
	public ArrayList<Detalhe> filtrarBandeira(ArrayList<Detalhe> listaVendas, String bandeira) {
		ArrayList<Detalhe> bandeiras = new ArrayList<Detalhe>();
		for(Detalhe d : listaVendas) {
			if(d.getInstituicaoFinanceira().split(" ")[0].equals(bandeira)) {
				bandeiras.add(d);
			}
		}
		return bandeiras;
	}
	public Integer filtrarQuantidadeVenda(ArrayList<Detalhe> listaVendas) {
		return listaVendas.size();
	}

	public Integer filtrarVendasDebitoVista(ArrayList<Detalhe> listaVendas){
		int contVendasDebito = 0;
		for (Detalhe d : listaVendas){
			if(d.getQtdParcela() == 0){
				contVendasDebito ++;
			}
		}
		return contVendasDebito;
	}

	public Integer filtrarVendasCreditoVista(ArrayList<Detalhe> listaVendas){
		int contVendasCredito = 0;
		for (Detalhe d : listaVendas){
			if(d.getQtdParcela() == 1){
				contVendasCredito ++;
			}
		}
		return contVendasCredito;
	}

}
