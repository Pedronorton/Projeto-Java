import java.util.ArrayList;
import java.util.Scanner;

import layout.Detalhe;
import layout.Header;
import layout.Trailler;
import util.DetalheUtil;
import service.AdquirenteService;
/**
 * @author Pedro Cobianchi Borges Paiva
 * @since 17/01/2020
 */

 /**
  * Classe main, onde é instanciado os obejtos AdquirenteService, Trailler, Header e DetalheUtil, alem de conter o menu com as opções de filtro
  */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner entrada = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);
		String dados;
		ArrayList<Detalhe> listaRetornada;

		ArrayList<Detalhe> listaVendas = new ArrayList<Detalhe>();
		AdquirenteService adquirenteService = new AdquirenteService("arquivos", listaVendas);
		Trailler traillerArquivo = adquirenteService.getTrailler();
		Header headerArquivo = adquirenteService.getHeader();
		DetalheUtil detalheUtil = new DetalheUtil();

		
		if(detalheUtil.verificarQuantidadeLidaEsperadaRegistro(traillerArquivo, listaVendas)){
			System.out.println("A quantidade de dados lida foi igual a quantidade de dados esperada");
		}else{
			System.out.println("A quantidade de dados lida foi diferente da quantidade de dados esperada"+" Quantidade de dados esperada: "+traillerArquivo.getTotalRegistro()+" Quantidade de dados lida: "+detalheUtil.filtraQuantidadeRegistros(listaVendas));
		}
		detalheUtil.informacoesHeader(headerArquivo);
		
		do{
            detalheUtil.menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
			case 1:
				System.out.println("Digite a bandeira a ser procurada");
				dados = leitura.nextLine().toLowerCase();
				listaRetornada = detalheUtil.filtraBandeira(listaVendas, dados);
				if(listaRetornada.size() == 0){
					System.out.println("Nenhum registro encontrado\n");
				}else{
					System.out.println("Informações gerais da venda");
					for(Detalhe venda : listaRetornada){
						System.out.println(venda);
					}
				}
				
                break;
                
			 case 2:
			 	System.out.println("A quantidade de recebimentos foi de: "+ detalheUtil.filtraQuantidadeRegistros(listaVendas)+" recebimentos\n");
            
                 break;
                
			case 3:
				System.out.println("A quantidade de vendas no débito a vista foi de: "+ detalheUtil.filtraVendasDebitoVista(listaVendas)+" vendas\n");
           
                break;
                
			case 4:
				System.out.println("A quantidade de vendas no crédito a vista foi de: "+ detalheUtil.filtraVendasCreditoVista(listaVendas)+" vendas\n");
                
                break;
			
			case 5:
				System.out.println("A quantidade de vendas parceladas foi de: "+ detalheUtil.filtraVendasParceladas(listaVendas)+" vendas\n");
				break;

			case 6:
				listaRetornada = detalheUtil.filtraPorDataPrevistaPagamento(listaVendas);
				if(listaRetornada.size() == 0){
					System.out.println("Não há vendas cadastradas");
				}else{
					System.out.println("Lista de vendas prevista de pagamento ordenadas por data com informações gerais: \n");
					for(Detalhe venda : detalheUtil.filtraPorDataPrevistaPagamento(listaVendas)){
						System.out.println("Data Prevista para pagamento: "+venda.getDataPrevistaPagamento());
						System.out.println(venda+"\n");
					}
				}
				
				break;
			case 7:
				System.out.println("Porcentagem de vendas: "+detalheUtil.porcentagemCredito(listaVendas)+"% Vendas no crédito | "+detalheUtil.porcentagemDebito(listaVendas)+"% Vendas no débito | "+detalheUtil.porcentagemParcelado(listaVendas)+"% Vendas parceladas\n");
				break;

			case 8:
				System.out.println("Total valor original em transações: "+detalheUtil.getTotalValorOriginalTransacoes(listaVendas));
				break;

			case 9:
				System.out.println("Total valor líquido em transações: "+detalheUtil.getTotalValorLiquidoTransacoes(listaVendas)+"\n");
				break;

			case 10:
				System.out.println("Valor total em tarifa de boleto do vendedor: "+detalheUtil.getTotalTarifaBoletoVendedor(listaVendas)+"\n");
				break;

			case 11:
				System.out.println("Valor total em tarifa de boleto do comprador: "+detalheUtil.getTotalTarifaBoletoComprador(listaVendas)+"\n");
				break;
			
			case 0:
			System.out.println("Saindo do Menu Filtro de Vendas...");
				break;
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);	
	}
	

}
