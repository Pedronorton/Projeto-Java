package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import layout.Detalhe;
import layout.Header;
import layout.Trailler;

/**
 * @author Pedro Cobianchi Borges Paiva
 * @since 17/01/2020
 */


public class DetalheUtil {
	
	/**
	 * Método para a impressão na tela do menu de navegação
	 */
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
	/**
	 * Método que recebe o objeto Header e imprime as suas informações
	 * @param headerArquivo
	 */
	public static void informacoesHeader(Header headerArquivo){
		System.out.println("Versão Layout: "+headerArquivo.getVersaoLayout()+"\nVersão Release: "+headerArquivo.getVersaoRelease()+"\n\nDados da empresa:\nNúmero do estabeleciemnto: "+headerArquivo.getEstabelecimento()+"\nArquivo gerado em: "+headerArquivo.getDataProcessamento()
		+"\nPeríodo inicial: "+headerArquivo.getPeriodoInicial()+"\nPeríodo final: "+ headerArquivo.getPeriodoFinal()+"\n");
	}

	/**
	 * Método que recebe a lista de vendas e a bandeira e retorna a lista de vendas com a bandeira passada como parametro
	 * @param listaVendas
	 * @param bandeira
	 */
	public ArrayList<Detalhe> filtraBandeira(ArrayList<Detalhe> listaVendas, String bandeira) {
		ArrayList<Detalhe> bandeiras = new ArrayList<Detalhe>();
		for(Detalhe venda : listaVendas) {
			if(venda.getInstituicaoFinanceira().toLowerCase().split(" ")[0].equals(bandeira)) {
				bandeiras.add(venda);
			}
		}
		return bandeiras;
	}
	/**
	 * Método que retorna a quantidade de registros
	 * @param listaVendas
	 */
	public Integer filtraQuantidadeRegistros(ArrayList<Detalhe> listaVendas) {
		return listaVendas.size();
	}
	/**
	 * Método que retorna uma lista de vendas que foram pagas com débito a vista
	 * @param listaVendas
	 * @return conVendasDebito
	 */
	public Integer filtraVendasDebitoVista(ArrayList<Detalhe> listaVendas){
		int contVendasDebito = 0;
		for (Detalhe venda : listaVendas){
			if(venda.getQuantidadeParcela() == 0){
				contVendasDebito ++;
			}
		}
		return contVendasDebito;
	}
	/**
	 * Método que retorna uma lista de vendas que foram pagas com crédito a vista
	 * @param listaVendas
	 * @return contVendasCredito
	 */
	public Integer filtraVendasCreditoVista(ArrayList<Detalhe> listaVendas){
		int contVendasCredito = 0;
		for (Detalhe venda : listaVendas){
			if(venda.getQuantidadeParcela() == 1){
				contVendasCredito ++;
			}
		}
		return contVendasCredito;
	}
	/**
	 * Método que retorna uma lista de vendas que foram parceladas
	 * @param listaVendas
	 * @return contVendasParceladas
	 */
	public Integer filtraVendasParceladas(ArrayList<Detalhe> listaVendas){
		int contVendasParceladas = 0;
		for (Detalhe venda : listaVendas){
			if(venda.getQuantidadeParcela() >=2 && venda.getQuantidadeParcela()<=18){
				contVendasParceladas ++;
			}
		}
		return contVendasParceladas;
	}

	/**
	 * Método que retorna a porcentagem de vendas que foram parceladas 
	 * @param listaVendas
	 * @return 
	 */
	public Double porcentagemParcelado(ArrayList<Detalhe> listaVendas){
		return (double) (((double)filtraVendasParceladas(listaVendas) / (double)filtraQuantidadeRegistros(listaVendas)) * 100);
	}
	/**
	 * Método que retorna a porcentagem de vendas que foram pagas no crédito a vista 
	 * @param listaVendas
	 * @return 
	 */
	public Double porcentagemCredito(ArrayList<Detalhe> listaVendas){
		return (double) (((double)filtraVendasCreditoVista(listaVendas) / (double)filtraQuantidadeRegistros(listaVendas)) * 100);
	}
	/**
	 * Método que retorna a porcentagem de vendas que foram pagas no debito a vista 
	 * @param listaVendas
	 * @return 
	 */
	public Double porcentagemDebito(ArrayList<Detalhe> listaVendas){
		return (double) (((double)filtraVendasDebitoVista(listaVendas) / (double)filtraQuantidadeRegistros(listaVendas)) * 100);
	}
	/**
	 * Método que retorna a quantidade esperadas de registros
	 * @return 
	 */
	public Integer verificarQuantidadeEsperadaRegistro(Trailler traillerArquivo){
		return traillerArquivo.getTotalRegistro();
	}
	/**
	* Método que verifica se a quantidade de registros lidos é igual a quantidade de registros esperados
	* @param traillerArquivo
	* @param listaVendas
	* @return true se for igual e false se forem diferentes
	*/
	 public Boolean verificarQuantidadeLidaEsperadaRegistro(Trailler traillerArquivo, ArrayList<Detalhe> listaVendas){	
		 if (traillerArquivo.getTotalRegistro() == filtraQuantidadeRegistros(listaVendas)){
			 return true;
		 }else{
			 return false;
		 }
	 }
	 /**
	  * Método que ordena a lista de vendas por ordem crescente de data previstas para pagamento
	  *	@param listaVendas
	  * @return listaOrdenada
	  */
	 public ArrayList<Detalhe> filtraPorDataPrevistaPagamento(ArrayList<Detalhe> listaVendas){
		ArrayList<Detalhe> listaVendasOrdenada = listaVendas;
		 
		 Collections.sort (listaVendasOrdenada, new Comparator() {
			 /**
			  * Método que faz a ordenação propriamente dita, recebe dois objetos do tipo
			  * Detalhe e compara primeiramente ano, em seguida mês e por último dia
			  * @params objeto1
			  * @params objeto2
			  */
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
	 /**
	  * Método que recebe a lista de vendas e retorna o valor total das transacoes
	  * @param listaVendas 
	  * @return valorTotalTransacoes
	  */
	 public Long getTotalTransacoes(ArrayList<Detalhe> listaVendas){
		long valorTotalTransacoes = 0; 
		for(Detalhe venda : listaVendas){
			valorTotalTransacoes += venda.getValorTotalTransacao();
		 }
		 return valorTotalTransacoes;
	 }
	 

}
