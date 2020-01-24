package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import layout.Detalhe;
import layout.Header;
import layout.Trailler;

public class DetalheUtil {
	
	
	public static void menu(){
        System.out.println("\tFiltro Registro de Vendas");
        System.out.println("0. Sair");
        System.out.println("1. Filtrar por bandeira");
        System.out.println("2. Número de vendas");
        System.out.println("3. Número de vendas em Débito a vista");
		System.out.println("4. Número de vendas em Crédito a vista");
		System.out.println("5. Número de vendas parceladas");
		System.out.println("6. Listar vendas por data prevista de pagamento");
		System.out.println("7. Prcentagem de vendas (Crédito a vista, Débito a vista, Parcelado)");
		System.out.println("8. Valor total em transação");
        System.out.println("Opcao:");
    }
	public static void informacoesHeader(Header headerArquivo){
		System.out.println("Versão Layout: "+headerArquivo.getVersaoLayout()+"\nVersão Release: "+headerArquivo.getVersaoRelease()+"\n\nDados da empresa:\nNúmero do estabeleciemnto: "+headerArquivo.getEstabelecimento()+"\nArquivo gerado em: "+headerArquivo.getDataProcessamento()
		+"\nPeríodo inicial: "+headerArquivo.getPeriodoInicial()+"\nPeríodo final: "+ headerArquivo.getPeriodoFinal()+"\n");
	}

	public ArrayList<Detalhe> filtraBandeira(ArrayList<Detalhe> listaVendas, String bandeira) {
		ArrayList<Detalhe> bandeiras = new ArrayList<Detalhe>();
		for(Detalhe venda : listaVendas) {
			if(venda.getInstituicaoFinanceira().toLowerCase().split(" ")[0].equals(bandeira)) {
				bandeiras.add(venda);
			}
		}
		return bandeiras;
	}
	public Integer filtraQuantidadeVenda(ArrayList<Detalhe> listaVendas) {
		return listaVendas.size();
	}

	public Integer filtraVendasDebitoVista(ArrayList<Detalhe> listaVendas){
		int contVendasDebito = 0;
		for (Detalhe venda : listaVendas){
			if(venda.getQtdParcela() == 0){
				contVendasDebito ++;
			}
		}
		return contVendasDebito;
	}

	public Integer filtraVendasCreditoVista(ArrayList<Detalhe> listaVendas){
		int contVendasCredito = 0;
		for (Detalhe venda : listaVendas){
			if(venda.getQtdParcela() == 1){
				contVendasCredito ++;
			}
		}
		return contVendasCredito;
	}

	public Integer filtraVendasParceladas(ArrayList<Detalhe> listaVendas){
		int contVendasParceladas = 0;
		for (Detalhe venda : listaVendas){
			if(venda.getQtdParcela() >=2 && venda.getQtdParcela()<=18){
				contVendasParceladas ++;
			}
		}
		return contVendasParceladas;
	}

	public Double porcentagemParcelado(ArrayList<Detalhe> listaVendas){
		return (double) (((double)filtraVendasParceladas(listaVendas) / (double)filtraQuantidadeVenda(listaVendas)) * 100);
	}
	public Double porcentagemCredito(ArrayList<Detalhe> listaVendas){
		return (double) (((double)filtraVendasCreditoVista(listaVendas) / (double)filtraQuantidadeVenda(listaVendas)) * 100);
	}
	public Double porcentagemDebito(ArrayList<Detalhe> listaVendas){
		return (double) (((double)filtraVendasDebitoVista(listaVendas) / (double)filtraQuantidadeVenda(listaVendas)) * 100);
	}
	
	public Integer verificarQuantidadeEsperadaRegistro(Trailler traillerArquivo){
		return traillerArquivo.getTotalRegistro();
	}

	 public Boolean verificarQuantidadeLidaEsperadaRegistro(Trailler traillerArquivo, ArrayList<Detalhe> listaVendas){	
		 if (traillerArquivo.getTotalRegistro() == filtraQuantidadeVenda(listaVendas)){
			 return true;
		 }else{
			 return false;
		 }
	 }

	 public ArrayList<Detalhe> filtraPorDataPrevistaPagamento(ArrayList<Detalhe> listaVendas){
		ArrayList<Detalhe> listaVendasOrdenada = listaVendas;
		 
		 Collections.sort (listaVendasOrdenada, new Comparator() {
			public int compare(Object objeto1, Object objeto2) {
				Detalhe data1 = (Detalhe) objeto1;
				Detalhe data2 =  (Detalhe) objeto2;
				Integer anoData1 = data1.getDataPrevistaPagamento().getYear();
				Integer anoData2 = data2.getDataPrevistaPagamento().getYear();
				Integer mesData1 = data1.getDataPrevistaPagamento().getMonth();
				Integer mesData2 = data2.getDataPrevistaPagamento().getMonth();
				Integer diaData1 = data1.getDataPrevistaPagamento().getDate();
				Integer diaData2 = data2.getDataPrevistaPagamento().getDate();

				if(anoData1 < anoData2){
					return -1;
				}else if(anoData1 > anoData2){
					return 1;
				}else if (mesData1 < mesData1){
					return -1;
				}else if(mesData1 > mesData2){
					return 1;
				}else if(diaData1 < diaData2){
					return -1;
				}else if(diaData1 > diaData2){
					return 1;
				}else {
					return 0;
				}
			}
		});
		return listaVendasOrdenada;
	 }

	 public Long getTotalTransacoes(ArrayList<Detalhe> listaVendas){
		long valorTotalTransacoes = 0; 
		for(Detalhe venda : listaVendas){
			valorTotalTransacoes += venda.getValorTotalTransacao();
		 }
		 return valorTotalTransacoes;
	 }
	 //IMPLEMENTAR VALOR RECEBIDO !!!!!!!!!!!!

}
