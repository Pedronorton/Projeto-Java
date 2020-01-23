package Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Layout.Detalhe;
import Layout.Trailler;

public class DetalheUtil {
	
	public DetalheUtil(ArrayList<Detalhe> listaVendas, Trailler traillerArquivo) {
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

	public Integer filtrarVendasParceladas(ArrayList<Detalhe> listaVendas){
		int contVendasParceladas = 0;
		for (Detalhe d : listaVendas){
			if(d.getQtdParcela() >=2 && d.getQtdParcela()<=18){
				contVendasParceladas ++;
			}
		}
		return contVendasParceladas;
	}
	
	public Integer verificarQtdEsperadaRegistro(Trailler traillerArquivo){
		return traillerArquivo.getTotalRegistro();
	}

	 public Boolean verificarQtdLidaEsperadaRegistro(Trailler traillerArquivo, ArrayList<Detalhe> listaVendas){	
		 if (traillerArquivo.getTotalRegistro() == filtrarQuantidadeVenda(listaVendas)){
			 return true;
		 }else{
			 return false;
		 }
	 }

	 public ArrayList<Detalhe> filtrarPorDataPrevistaPagamento(ArrayList<Detalhe> listaVendas){
		ArrayList<Detalhe> listaOrdenada = listaVendas;
		 
		 Collections.sort (listaOrdenada, new Comparator() {
			public int compare(Object o1, Object o2) {
				Detalhe d1 = (Detalhe) o1;
				Detalhe d2 = (Detalhe) o2;
				if(d1.getDataPrevistaPagamento().getYear() < d1.getDataPrevistaPagamento().getYear()){
					return -1;
				}else if(d1.getDataPrevistaPagamento().getYear() > d2.getDataPrevistaPagamento().getYear()){
					return 1;
				}else if (d1.getDataPrevistaPagamento().getMonth() < d2.getDataPrevistaPagamento().getMonth()){
					return -1;
				}else if(d1.getDataPrevistaPagamento().getMonth() > d2.getDataPrevistaPagamento().getMonth()){
					return 1;
				}else if(d1.getDataPrevistaPagamento().getDate() < d2.getDataPrevistaPagamento().getDate()){
					return -1;
				}else if(d1.getDataPrevistaPagamento().getDate() > d2.getDataPrevistaPagamento().getDate()){
					return 1;
				}else {
					return 0;
				}
			}
		});
		return listaOrdenada;
	 }

}
