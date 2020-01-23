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
		int opcao;
		Scanner entrada = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);
		String dados;
		do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
			case 1:
				System.out.println("Digite a bandeira a ser procurada");
				dados = leitura.nextLine();
				for(Detalhe d : filtrarBandeira(listaVendas, dados)){
					System.out.println(d);
				}
                break;
                
			 case 2:
			 	System.out.println("A quantidade de vendas foi de: "+ filtrarQuantidadeVenda(listaVendas)+" vendas\n");
            
                 break;
                
			case 3:
				System.out.println("A quantidade de vendas no débito a vista foi de: "+ filtrarVendasDebitoVista(listaVendas)+" vendas\n");
           
                break;
                
			case 4:
				System.out.println("A quantidade de vendas no crédito a vista foi de: "+ filtrarVendasCreditoVista(listaVendas)+" vendas\n");
                
                break;
			
			case 5:
				System.out.println("A quantidade de vendas parceladas foi de: "+ filtrarVendasParceladas(listaVendas)+" vendas\n");
				break;

			case 6:
				System.out.println("Lista de vendas prevista de pagamento ordenadas por data: \n");
				for(Detalhe d : filtrarPorDataPrevistaPagamento(listaVendas)){
					System.out.println(d);
				}
				break;
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);	
	}
	
	public static void menu(){
        System.out.println("\tFiltro Registro de Vendas");
        System.out.println("0. Sair");
        System.out.println("1. Filtrar por bandeira");
        System.out.println("2. Número de vendas");
        System.out.println("3. Número de vendas em Débito a vista");
		System.out.println("4. Número de vendas em Crédito a vista");
		System.out.println("5. Número de vendas parceladas");
		System.out.println("6. Listar vendas por data prevista de pagamento");
        System.out.println("Opcao:");
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
