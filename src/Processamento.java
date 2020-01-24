
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import layout.Detalhe;
import layout.Header;
import layout.Trailler;


public class Processamento {
	Trailler traillerArquivo;
	Header headerArquivo;
	Detalhe venda;
	public Processamento(String nomeArquivo, ArrayList<Detalhe> listaVendas) {
		try {
			FileReader arquivo = new FileReader(nomeArquivo);
			BufferedReader bufferedReaderArquivo = new BufferedReader(arquivo);
			String registro = bufferedReaderArquivo.readLine();

			while(registro != null) {
				int tipoRegistro = verificaRegistro(registro);
				if(tipoRegistro == 0 ) {
					montaReader(registro);

				}else if (tipoRegistro == 1){
					Detalhe venda = montarVenda(registro);
					
					listaVendas.add(venda);
				}else if(tipoRegistro == 9) {
					
					montaTrailler(registro);

				}else if(tipoRegistro == -1) {
					System.out.println("Erro na leitura");
				}
				
				registro = bufferedReaderArquivo.readLine();
			}
			
			bufferedReaderArquivo.close();
		}catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	public Integer verificaRegistro(String registro) {
		return Integer.parseInt(registro.split("")[0]);
	}
	
	public Detalhe montarVenda(String registro) {
		
		Integer tipoDado = Integer.parseInt(registro.substring(0,1));
		Integer estabelecimento = Integer.parseInt(registro.substring(1,11));
		Date dataInicialTransacao = stringParaDate(registro.substring(11, 19));
		Date dataEvento =  stringParaDate(registro.substring(19, 27));
		Date horaEvento = stringParaHora(registro.substring(27, 33));
		Integer tipoEvento = Integer.parseInt(registro.substring(33,35));
		Integer tipoTransicao = Integer.parseInt(registro.substring(35,37));
		String numeroSerieLeitor = registro.substring(37,45);
		String codTransacao = registro.substring(45,77);
		String codPedido = registro.substring(77,97);
		Long valorTotalTransacao = Long.parseLong(registro.substring(97,110));
		Long valorParcela = Long.parseLong(registro.substring(110,123));
		String pagamento = registro.substring(123,124);
		String plano = registro.substring(124,126);
		String parcela = registro.substring(126,128);
		Integer qtdParcela = Integer.parseInt(registro.substring(128,130));
		Date dataPrevistaPagamento = stringParaDate(registro.substring(130,138));
		Long taxaParcelamentoComprador = Long.parseLong(registro.substring(138,151));
		Long tarifaBoleto = Long.parseLong(registro.substring(151,164));
		Long valorOriginalTransacao = Long.parseLong(registro.substring(164,177));
		Long taxaParcelamentoVendedor = Long.parseLong(registro.substring(177,190));
		Long taxaIntermediacao = Long.parseLong(registro.substring(190,203));
		Long tarifaIntermediacao = Long.parseLong(registro.substring(203,216));
		Long tarifaBoletoVendedor = Long.parseLong(registro.substring(216,229));
		Long repasseAplicacao = Long.parseLong(registro.substring(229,242));
		Long valorLiquidoTransacao  = Long.parseLong(registro.substring(242,255));
		Integer statusPagamento = Integer.parseInt(registro.substring(255,257));
		String filler = registro.substring(257,259);
		Integer meioPagamento = Integer.parseInt(registro.substring(259,261));
		String instituicaoFinanceira = registro.substring(261,291);
		String canalEntrada = registro.substring(291,293);
		Integer leitor = Integer.parseInt(registro.substring(293,295));
		Integer meioCaptura = Integer.parseInt(registro.substring(295,297));
		String meioLogico = registro.substring(297,329);
		String nsu = registro.substring(329,340);
		filler = registro.substring(340,343);
		String cartaoBin = registro.substring(343,349);
		String cartaoHolder = registro.substring(349,353);
		String codAutorizacao = registro.substring(353,359);
		String codCV = registro.substring(359,391);

		venda = new Detalhe(tipoDado, estabelecimento, dataInicialTransacao, dataEvento, horaEvento, tipoEvento, tipoTransicao, numeroSerieLeitor, codTransacao, 
		codPedido,valorTotalTransacao, valorParcela, pagamento,plano ,parcela ,qtdParcela,dataPrevistaPagamento, taxaParcelamentoComprador, tarifaBoleto,valorOriginalTransacao, 
		taxaParcelamentoVendedor, taxaIntermediacao, tarifaIntermediacao,tarifaBoletoVendedor, repasseAplicacao, valorLiquidoTransacao, statusPagamento,filler,
		meioPagamento, instituicaoFinanceira, canalEntrada, leitor, meioCaptura, meioLogico, nsu, filler, cartaoBin, cartaoHolder, codAutorizacao, codCV  );
		
		return venda;
	}

	public Header montaReader(String registro){
		Integer tipoRegistro = Integer.parseInt(registro.substring(0,1));
		Long estabelecimento = Long.parseLong(registro.substring(1,11));
		Date dataProcessamento = stringParaDate(registro.substring(11,19));
		Date periodoInicial = stringParaDate(registro.substring(19,27));
		Date periodoFinal = stringParaDate(registro.substring(27,35));
		Integer sequencia = Integer.parseInt(registro.substring(35,42));
		String empresaAdquirinte = registro.substring(42,47);
		Integer tipoExtrato = Integer.parseInt(registro.substring(47,49));
		String filler = registro.substring(49,71);
		String versaoLayout = registro.substring(70,75);
		String versaoRelease = registro.substring(73,79);
		String usoFuturo = registro.substring(78,530);

		headerArquivo = new Header(tipoRegistro, estabelecimento, dataProcessamento, periodoInicial, periodoFinal, sequencia, empresaAdquirinte, tipoExtrato, filler, versaoLayout,
		versaoRelease, usoFuturo) ;

		return headerArquivo;
	}

	public Trailler montaTrailler(String registro){
		Integer tipoRegistro = Integer.parseInt(registro.substring(0,1));
		Integer totalRegistro = Integer.parseInt(registro.substring(1,12));
		String usoFuturo = registro.substring(12,530);


		traillerArquivo = new Trailler(tipoRegistro, totalRegistro, usoFuturo);
		return traillerArquivo;
	}


	public Trailler getTrailler(){
		return traillerArquivo;
	}

	public Header getHeader(){
		return headerArquivo;
	}

	public Date stringParaDate(String stringData){
		String data = "";
		data = data+stringData.charAt(0)+stringData.charAt(1)+stringData.charAt(2)+stringData.charAt(3)+"/"+stringData.charAt(4)+stringData.charAt(5)+"/"+stringData.charAt(6)+stringData.charAt(7);
		Date dataNova = null;
		try {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
			dataNova = formato.parse(data);
			return dataNova;
		} catch (ParseException e) {
			System.out.println("Erro em converter a data");
			return dataNova;
		}
	}

	public Date stringParaHora(String stringHora){
		String hora = "";
		hora = hora+stringHora.charAt(0)+stringHora.charAt(1)+":"+stringHora.charAt(2)+stringHora.charAt(3)+":"+stringHora.charAt(4)+stringHora.charAt(5);
		Date horaNova = null;
		try {
			SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss"); 
			horaNova = formato.parse(hora);
			return horaNova;
		} catch (ParseException e) {
			System.out.println("Erro em converter a data");
			return horaNova;
		}
	}
		
}
