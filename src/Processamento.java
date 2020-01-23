
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Layout.Detalhe;
import Layout.Header;
import Layout.Trailler;


public class Processamento {
	Trailler traillerArquivo;
	Header headerArquivo;
	
	public Processamento(String nArquivo, ArrayList<Detalhe> listaVendas) {
		 headerArquivo = new Header();
		 traillerArquivo = new Trailler();
		try {
			FileReader arq = new FileReader(nArquivo);
			BufferedReader bf = new BufferedReader(arq);
			String registro = bf.readLine();
			Date date;
			while(registro != null) {
				int tipoRegistro = verificaRegistro(registro);
				if(tipoRegistro == 0 ) {
					headerArquivo.setTipoRegistro(Integer.parseInt(registro.substring(0,1)));
					headerArquivo.setEstabelecimento(Long.parseLong(registro.substring(1,11)));
					date = transformarStringDate(registro.substring(11,19));
					headerArquivo.setDataProcessamento(date);
					date = transformarStringDate(registro.substring(19,27));
					headerArquivo.setPeriodoInicial(date);
					date = transformarStringDate(registro.substring(27,35));
					headerArquivo.setperiodoFinal(date);
					headerArquivo.setSequencia(Integer.parseInt(registro.substring(35,42)));
					headerArquivo.setEmpresaAdquirinte(registro.substring(42,47));
					headerArquivo.setTipoExtrato(Integer.parseInt(registro.substring(47,49)));
					headerArquivo.setFiller(registro.substring(49,71));
					headerArquivo.setVersaoLayout(registro.substring(70,75));
					headerArquivo.setVersaoRelease(registro.substring(73,79));
					headerArquivo.setUsoFuturo(registro.substring(78,530));
				}else if (tipoRegistro == 1){
					//registro.substring() pega o valor inicial e o valor final-1
					
					//FALTA O USO FUTURO
					Detalhe venda = montarVenda(registro);
					
					listaVendas.add(venda);
				}else if(tipoRegistro == 9) {
					
					traillerArquivo.setTipoRegistro(Integer.parseInt(registro.substring(0,1)));
					traillerArquivo.setTotalRegistro(Integer.parseInt(registro.substring(1,12)));
					traillerArquivo.setUsoFuturo(registro.substring(12,530));
				}else if(tipoRegistro == -1) {
					System.out.println("Erro na leitura");
				}
				
				registro = bf.readLine();
			}
			
			bf.close();
		}catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	public Integer verificaRegistro(String registro) {
		return Integer.parseInt(registro.split("")[0]);
	}
	
	public Detalhe montarVenda(String registro) {
		Detalhe venda = new Detalhe();
		Date date;
		Date hour;
		venda.setTipoRegistro(Integer.parseInt(registro.substring(0,1)));
		venda.setEstabelecimento(Integer.parseInt(registro.substring(1,11)));
		date = transformarStringDate(registro.substring(11, 19));
		venda.setDataInicialTransacao(date);
		date = transformarStringDate(registro.substring(19, 27));
		venda.setDataEvento(date);
		hour = transformaStringHora(registro.substring(27, 33));
		venda.setHoraEvento(hour); // vai ate o 33
		venda.setTipoEvento(Integer.parseInt(registro.substring(33,35)));
		venda.setTipoTransacao(Integer.parseInt(registro.substring(35,37)));
		venda.setNumeroSerieLeitor(registro.substring(37,45));
		venda.setCodTransacao(registro.substring(45,77));
		venda.setCodPedido(registro.substring(77,97));
		venda.setValorTotalTransacao(Long.parseLong(registro.substring(97,110)));
		venda.setValorParcela(Long.parseLong(registro.substring(110,123)));
		venda.setPagamento(registro.substring(123,124));
		venda.setPlano(registro.substring(124,126));
		venda.setParcela(registro.substring(126,128));
		venda.setQtdParcela(Integer.parseInt(registro.substring(128,130)));
		date = transformarStringDate(registro.substring(130,138));
		venda.setDataPrevistaPagamento(date);
		venda.setTaxaParcelamentoComprador(Long.parseLong(registro.substring(138,151)));
		venda.setTarifaBoleto(Long.parseLong(registro.substring(151,164)));
		venda.setValorOriginalTransacao(Long.parseLong(registro.substring(164,177)));
		venda.setTaxaParcelamentoVendedor(Long.parseLong(registro.substring(177,190)));
		venda.setTaxaIntermediacao(Long.parseLong(registro.substring(190,203)));
		venda.setTarifaIntermediacao(Long.parseLong(registro.substring(203,216)));
		venda.setTarifaBoletoVendedor(Long.parseLong(registro.substring(216,229)));
		venda.setRepasseAplicacao(Long.parseLong(registro.substring(229,242)));
		venda.setValorLiquidoTransacao(Long.parseLong(registro.substring(242,255)));
		venda.setStatusPagamento(Integer.parseInt(registro.substring(255,257)));
		venda.setFiller(registro.substring(257,259));
		venda.setMeioPagamento(Integer.parseInt(registro.substring(259,261)));
		venda.setInstituicaoFinanceira(registro.substring(261,291));
		venda.setCanalEntrada(registro.substring(291,293));
		venda.setLeitor(Integer.parseInt(registro.substring(293,295)));
		venda.setMeioCaptura((Integer.parseInt(registro.substring(295,297))));
		venda.setNumeroLogico(registro.substring(297,329));
		venda.setNsu(registro.substring(329,340));
		venda.setFiller(registro.substring(340,343));
		venda.setCartaoBin(registro.substring(343,349));
		venda.setCartaoHolder(registro.substring(349,353));
		venda.setCodAutorizacao(registro.substring(353,359));
		venda.setCodCV(registro.substring(359,391));
		
		return venda;
	}
	
	public Trailler getTrailler(){
		return traillerArquivo;
	}

	public Header getHeader(){
		return headerArquivo;
	}

	public Date transformarStringDate(String d){
		String date = "";
		date = date+d.charAt(0)+d.charAt(1)+d.charAt(2)+d.charAt(3)+"/"+d.charAt(4)+d.charAt(5)+"/"+d.charAt(6)+d.charAt(7);
		Date dataN = null;
		try {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
			dataN = formato.parse(date);
			return dataN;
		} catch (ParseException e) {
			System.out.println("Erro em converter a data");
			return dataN;
		}
	}

	public Date transformaStringHora(String d){
		String date = "";
		date = date+d.charAt(0)+d.charAt(1)+":"+d.charAt(2)+d.charAt(3)+":"+d.charAt(4)+d.charAt(5);
		Date dataN = null;
		try {
			SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss"); 
			dataN = formato.parse(date);
			return dataN;
		} catch (ParseException e) {
			System.out.println("Erro em converter a data");
			return dataN;
		}
	}
		
}
