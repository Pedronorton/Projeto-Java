package Layout;

import java.util.Date;

/**
 * @author Pedro Cobianchi Borges Paiva
 * @since 17/01/2020
 */

/**
 * Classe Detalhe - Essa classe tem como o objetivo de construir o objeto venda propriamente dito que é representado por cada linha do arquivo
 * Todos os atributos de venda são declarados e inicializados nessa classe. 
 */
public class Detalhe {
	private Integer tipoRegistro;
	private	Integer estabelecimento;
	private Date dataInicialTransacao;
	private Date dataEvento;
	private Date horaEvento;
	private Integer tipoEvento;
	private	Integer tipoTransacao;
	private String numeroSerieLeitor;
	private String codTransacao;
	private String codPedido;
	private	Long valorTotalTransacao;
	private Long valorParcela;
	private String pagamento;
	private String plano;
	private	String parcela;
	private Integer qtdParcela;
	private Date dataPrevistaPagamento;
	private Long taxaParcelamentoComprador;
	private	Long tarifaBoleto;
	private Long valorOriginalTransacao;
	private Long taxaParcelamentoVendedor;
	private	Long taxaIntermediacao;
	private Long tarifaIntermediacao;
	private Long tarifaBoletoVendedor;
	private	Long repasseAplicacao;
	private Long valorLiquidoTransacao;
	private Integer statusPagamento;
	private	String filler;
	private Integer meioPagamento;
	private String instituicaoFinanceira;
	private	String canalEntrada;
	private Integer leitor;
	private Integer meioCaptura;
	private	String numeroLogico;
	private String nsu;
	private String cartaoBin;
	private String cartaoHolder;
	private String codAutorizacao;
	private String codCV;
	private Long usoFuturo;
	
	/**
	 * Constrói o objeto venda.
	 * 
	 * @param tipoRegistro
	 * @param estabelecimento
	 * @param dataInicialTransacao
	 * @param dataEvento
	 * @param horaEvento
	 * @param tipoEvento
	 * @param tipoTransacao
	 * @param numeroSerieLeitor
	 * @param codTransacao
	 * @param codPedido
	 * @param valorTotalTransacao
	 * @param valorParcela
	 * @param pagamento
	 * @param plano
	 * @param parcela
	 * @param qtdParcela
	 * @param dataPrevistaPagamento
	 * @param taxaParcelamentoComprador
	 * @param tarifaBoleto
	 * @param valorOriginalTransacao
	 * @param taxaParcelamentoVendedor
	 * @param taxaIntermediacao
	 * @param tarifaIntermediacao
	 * @param tarifaBoletoVendedor
	 * @param repasseAplicacao
	 * @param valorLiquidoTransacao
	 * @param statusPagamento
	 * @param filler1
	 * @param meioPagamento
	 * @param instituicaoFinanceira
	 * @param canalEntrada
	 * @param leitor
	 * @param meioCaptura
	 * @param numeroLogico
	 * @param nsu
	 * @param filler2
	 * @param cartaoBin
	 * @param cartaoHolder
	 * @param codAutorizacao
	 * @param codCV
	 */

	public Detalhe(Integer tipoRegistro, Integer estabelecimento, Date dataInicialTransacao, Date dataEvento, Date horaEvento, Integer tipoEvento, Integer tipoTransacao, String numeroSerieLeitor, String codTransacao, 
	String codPedido, Long valorTotalTransacao, Long valorParcela, String pagamento, String plano , String parcela , Integer qtdParcela, Date dataPrevistaPagamento, Long taxaParcelamentoComprador,Long tarifaBoleto, Long valorOriginalTransacao, 
	Long taxaParcelamentoVendedor, Long taxaIntermediacao, Long tarifaIntermediacao, Long tarifaBoletoVendedor, Long repasseAplicacao,Long valorLiquidoTransacao, Integer  statusPagamento,String filler1,
	Integer meioPagamento, String instituicaoFinanceira, String canalEntrada, Integer leitor,Integer  meioCaptura, String numeroLogico, String nsu, String filler2, String cartaoBin, String cartaoHolder, String codAutorizacao,String codCV){
		
		this.tipoRegistro = tipoRegistro;
		this.estabelecimento = estabelecimento;
		this.dataInicialTransacao = dataInicialTransacao;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.tipoEvento = tipoEvento;
		this.tipoTransacao = tipoTransacao;
		this.numeroSerieLeitor = numeroSerieLeitor;
		this.codTransacao = codTransacao;
		this.codPedido = codPedido;
		this.valorTotalTransacao = valorTotalTransacao;
		this.valorParcela = valorParcela;
		this.pagamento = pagamento;
		this.plano = plano;
		this.parcela = parcela;
		this.qtdParcela = qtdParcela;
		this.dataPrevistaPagamento = dataPrevistaPagamento;
		this.taxaParcelamentoComprador = taxaParcelamentoComprador;
		this.tarifaBoleto = tarifaBoleto;
		this.valorOriginalTransacao = valorOriginalTransacao;
		this.taxaParcelamentoVendedor = taxaParcelamentoVendedor;
		this.taxaIntermediacao = taxaIntermediacao;
		this.tarifaIntermediacao = tarifaIntermediacao;
		this.tarifaBoletoVendedor = tarifaBoletoVendedor;
		this.repasseAplicacao = repasseAplicacao;
		this.valorLiquidoTransacao = valorLiquidoTransacao;
		this.statusPagamento = statusPagamento;
		this.filler = filler1;
		this.meioPagamento = meioPagamento;
		this.instituicaoFinanceira = instituicaoFinanceira;
		this.canalEntrada = canalEntrada;
		this.leitor = leitor;
		this.meioCaptura = meioCaptura;
		this.numeroLogico = numeroLogico;
		this.nsu = nsu;
		this.filler = filler2;
		this.cartaoBin = cartaoBin; 
		this.cartaoHolder = cartaoHolder;
		this.codCV = codCV;

	}
	/**
	 * Método toString - Utilizado para escrever todas as informações do objeto passado.
	 */
	@Override
	public String toString(){
		
		return this.estabelecimento+" | "+this.dataInicialTransacao+" | "+this.dataEvento+" | "+this.horaEvento+" | "+this.tipoEvento+" | "+this.tipoTransacao+" | "+
		this.valorParcela+" | "+this.pagamento+" | "+this.plano+" | "+this.parcela+" | "+this.qtdParcela+" | "+this.estabelecimento+" | "+
		this.dataPrevistaPagamento+" | "+this.taxaParcelamentoComprador+" | "+this.tarifaBoleto+" | "+this.valorOriginalTransacao+" | "+this.taxaParcelamentoComprador+" | "+this.taxaIntermediacao+" | "+
		this.tarifaBoletoVendedor+" | "+this.repasseAplicacao+" | "+this.valorLiquidoTransacao+" | "+this.statusPagamento+" | "+this.meioPagamento+" | "+this.instituicaoFinanceira+" | "+
		this.canalEntrada+" | "+this.leitor+" | "+this.meioCaptura+" | "+this.numeroLogico+" | "+this.nsu+" | "+this.cartaoBin+" | "+this.cartaoHolder+" | "+this.codCV+"\n ";
	}
	/**
	 * retorna o tipo de registro passado 
	 * @return tipoRegistro
	 */
	public Integer getTipoRegistro() {
		return tipoRegistro;
	}
	/**
	 * seta a variavel tipo de registro
	 * @param tipoRegistro
	 */
	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	/**
	 * retorna o estabelecimento
	 * @return estabelecimento
	 */
	public Integer getEstabelecimento() {
		return estabelecimento;
	}
	/**
	 * seta o a variavel estabelecimento
	 * @param estabelecimento
	 */
	public void setEstabelecimento(Integer estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	/**
	 * retorna a data do evento
	 * @return dataEvento
	 */
	public Date getDataEvento() {
		return dataEvento;
	}
	/**
	 * seta o a variavel dataEvento
	 * @param dataEvento
	 */
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	/**
	 * retorna a hora do evento
	 * @return horaEvento
	 */
	public Date getHoraEvento() {
		return horaEvento;
	}
	/**
	 * seta o a variavel horaEvento
	 * @param horaEvento
	 */
	public void setHoraEvento(Date horaEvento) {
		this.horaEvento = horaEvento;
	}
	/**
	 * retorna o tipo de evento
	 * @return tipoEvento
	 */
	public Integer getTipoEvento() {
		return tipoEvento;
	}
	/**
	 * seta o a variavel tipoEvento
	 * @param tipoEvento
	 */
	public void setTipoEvento(Integer tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	/**
	 * retorna o tipo de transacao
	 * @return tipoTransacao
	 */
	public Integer getTipoTransacao() {
		return tipoTransacao;
	}
	/**
	 * seta o a variavel tipoTransacao
	 * @param tipoTransacao
	 */
	public void setTipoTransacao(Integer tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	/**
	 * retorna o numero de série do leitor
	 * @return numeroSerieLeitor
	 */
	public String getNumeroSerieLeitor() {
		return numeroSerieLeitor;
	}
	/**
	 * seta o a variavel numeroSerieLeitor
	 * @param numeroSerieLeitor
	 */
	public void setNumeroSerieLeitor(String numeroSerieLeitor) {
		this.numeroSerieLeitor = numeroSerieLeitor;
	}
	/**
	 * retorna o código da transação
	 * @return
	 */
	public String getCodTransacao() {
		return codTransacao;
	}
	/**
	 * seta o a variavel codTransacao
	 * @param codTransacao
	 */
	public void setCodTransacao(String codTransacao) {
		this.codTransacao = codTransacao;
	}
	/**
	 * retorna o código do pedido
	 * @return
	 */
	public String getCodPedido() {
		return codPedido;
	}
	/**
	 * seta o a variavel codPedido
	 * @param codPedido
	 */
	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}
	/**
	 * retorna o valor total da transacao
	 * @return
	 */
	public Long getValorTotalTransacao() {
		return valorTotalTransacao;
	}
	/**
	 * seta o a variavel valorTotalTransacao
	 * @param valorTotalTransacao
	 */
	public void setValorTotalTransacao(Long valorTotalTransacao) {
		this.valorTotalTransacao = valorTotalTransacao;
	}
	/**
	 * retorna o valor da parcela
	 * @return
	 */
	public Long getValorParcela() {
		return valorParcela;
	}
	/**
	 * seta o a variavel valorParcela
	 * @param valorParcela
	 */
	public void setValorParcela(Long valorParcela) {
		this.valorParcela = valorParcela;
	}
	/**
	 * retorna o pagamento
	 * @return pagamento
	 */
	public String getPagamento() {
		return pagamento;
	}
	/**
	 * seta o a variavel pagamento
	 * @param pagamento
	 */
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	/**
	 * retorna o plano
	 * @return plano
	 */
	public String getPlano() {
		return plano;
	}
	/**
	 * seta o a variavel plano
	 * @param plano
	 */
	public void setPlano(String plano) {
		this.plano = plano;
	}
	/**
	 * retorna a parcela
	 * @return parcela
	 */
	public String getParcela() {
		return parcela;
	}
	/**
	 * seta o a variavel parcela
	 * @param parcela
	 */
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	/**
	 * retorna a quantidade da parcela
	 * @return qtdParcela
	 */
	public Integer getQuantidadeParcela() {
		return qtdParcela;
	}
	/**
	 * seta o a variavel qtdParcela
	 * @param qtdParcela
	 */
	public void setQuantidadeParcela(Integer qtdParcela) {
		this.qtdParcela = qtdParcela;
	}
	/**
	 * retorna a data prevista para o pagamento
	 * @return
	 */
	public Date getDataPrevistaPagamento() {
		return dataPrevistaPagamento;
	}
	/**
	 * seta o a variavel dataPrevistaPagamento
	 * @param dataPrevistaPagamento
	 */
	public void setDataPrevistaPagamento(Date dataPrevistaPagamento) {
		this.dataPrevistaPagamento = dataPrevistaPagamento;
	}
	/**
	 * retorna a taxa de parcelamento do comprador
	 * @return taxaParcelamentoComprador
	 */
	public Long getTaxaParcelamentoComprador() {
		return taxaParcelamentoComprador;
	}
	/**
	 * seta o a variavel taxaParcelamentoComprador
	 * @param taxaParcelamentoComprador
	 */
	public void setTaxaParcelamentoComprador(Long taxaParcelamentoComprador) {
		this.taxaParcelamentoComprador = taxaParcelamentoComprador;
	}
	/**
	 * retorna a tarifa do boleto
	 * @return tarifaBoleto
	 */
	public Long getTarifaBoleto() {
		return tarifaBoleto;
	}
	/**
	 * seta o a variavel tarifaBoleto
	 * @param tarifaBoleto
	 */
	public void setTarifaBoleto(Long tarifaBoleto) {
		this.tarifaBoleto = tarifaBoleto;
	}
	/**
	 * retorna o valor original da transacao
	 * @return valorOriginalTransacao
	 */
	public Long getValorOriginalTransacao() {
		return valorOriginalTransacao;
	}
	/**
	 * seta o a variavel valorOriginalTransacao
	 * @param valorOriginalTransacao
	 */
	public void setValorOriginalTransacao(Long valorOriginalTransacao) {
		this.valorOriginalTransacao = valorOriginalTransacao;
	}
	/**
	 * retorna a taxa de parcelamento do vendedor
	 * @return taxaParcelamentoVendedor
	 */
	public Long getTaxaParcelamentoVendedor() {
		return taxaParcelamentoVendedor;
	}
	/**
	 * seta o a variavel taxaParcelamentoVendedor
	 * @param taxaParcelamentoVendedor
	 */
	public void setTaxaParcelamentoVendedor(Long taxaParcelamentoVendedor) {
		this.taxaParcelamentoVendedor = taxaParcelamentoVendedor;
	}
	/**
	 * retorna a taxa de intermediacao
	 * @return
	 */
	public Long getTaxaIntermediacao() {
		return taxaIntermediacao;
	}
	/**
	 * seta o a variavel taxaIntermediacao
	 * @param taxaIntermediacao
	 */
	public void setTaxaIntermediacao(Long taxaIntermediacao) {
		this.taxaIntermediacao = taxaIntermediacao;
	}
	/**
	 * retorna a tarifa da intermediacao
	 * @return tarifaIntermediacao
	 */
	public Long getTarifaIntermediacao() {
		return tarifaIntermediacao;
	}
	/**
	 * seta o a variavel tarifaIntermediacao
	 * @param tarifaIntermediacao
	 */
	public void setTarifaIntermediacao(Long tarifaIntermediacao) {
		this.tarifaIntermediacao = tarifaIntermediacao;
	}
	/**
	 * retorna a tarifa do boleto do vendedor
	 * @return tarifaBoletoVendedor
	 */
	public Long getTarifaBoletoVendedor() {
		return tarifaBoletoVendedor;
	}
	/**
	 * seta o a variavel tarifaBoletoVendedor
	 * @param tarifaBoletoVendedor
	 */
	public void setTarifaBoletoVendedor(Long tarifaBoletoVendedor) {
		this.tarifaBoletoVendedor = tarifaBoletoVendedor;
	}
	/**
	 * retorna o repasse da aplicacao
	 * @return repasseAplicacao
	 */
	public Long getRepasseAplicacao() {
		return repasseAplicacao;
	}
	/**
	 * seta o a variavel repasseAplicacao
	 * @param repasseAplicacao
	 */
	public void setRepasseAplicacao(Long repasseAplicacao) {
		this.repasseAplicacao = repasseAplicacao;
	}
	/**
	 * retorna o valor liquido da transacao
	 * @return valorLiquidoTransacao
	 */
	public Long getValorLiquidoTransacao() {
		return valorLiquidoTransacao;
	}
	/**
	 * seta o a variavel valorLiquidoTransacao
	 * @param valorLiquidoTransacao
	 */
	public void setValorLiquidoTransacao(Long valorLiquidoTransacao) {
		this.valorLiquidoTransacao = valorLiquidoTransacao;
	}
	/**
	 * retorna o status do pagamento
	 * @return statusPagamento
	 */
	public Integer getStatusPagamento() {
		return statusPagamento;
	}
	/**
	 * seta o a variavel statusPagamento
	 * @param statusPagamento
	 */
	public void setStatusPagamento(Integer statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	/**
	 * retorna o filler
	 * @return filler
	 */
	public String getFiller() {
		return filler;
	}
	/**
	 * retorna o meio de pagamento
	 * @return meioPagamento
	 */
	public Integer getMeioPagamento() {
		return meioPagamento;
	}
	/**
	 * seta o a variavel meioPagamento
	 * @param meioPagamento
	 */
	public void setMeioPagamento(Integer meioPagamento) {
		this.meioPagamento = meioPagamento;
	}
	/**
	 * retorna a instituicao financeira
	 * @return instituicaoFinanceira
	 */
	public String getInstituicaoFinanceira() {
		return instituicaoFinanceira;
	}
	/**
	 * seta o a variavel instituicaoFinanceira
	 * @param instituicaoFinanceira
	 */
	public void setInstituicaoFinanceira(String instituicaoFinanceira) {
		this.instituicaoFinanceira = instituicaoFinanceira;
	}
	/**
	 * retorna o canal de entrada
	 * @return canalEntrada
	 */
	public String getCanalEntrada() {
		return canalEntrada;
	}
	/**
	 * seta o a variavel canalEntrada
	 * @param canalEntrada
	 */
	public void setCanalEntrada(String canalEntrada) {
		this.canalEntrada = canalEntrada;
	}
	/**
	 * retorna o leitor
	 * @return leitor
	 */
	public Integer getLeitor() {
		return leitor;
	}
	/**
	 * seta o a variavel leitor
	 * @param leitor
	 */
	public void setLeitor(Integer leitor) {
		this.leitor = leitor;
	}
	/**
	 * retorna o meio de captura
	 * @return meioCaptura
	 */
	public Integer getMeioCaptura() {
		return meioCaptura;
	}
	/**
	 * seta o a variavel meioCaptura
	 * @param meioCaptura
	 */
	public void setMeioCaptura(Integer meioCaptura) {
		this.meioCaptura = meioCaptura;
	}
	/**
	 * retorna o numero lógico
	 * @return numeroLogico
	 */
	public String getNumeroLogico() {
		return numeroLogico;
	}
	/**
	 * seta o a variavel numeroLogico
	 * @param numeroLogico
	 */
	public void setNumeroLogico(String numeroLogico) {
		this.numeroLogico = numeroLogico;
	}
	/**
	 * retorna o nsu
	 * @return nsu
	 */
	public String getNsu() {
		return nsu;
	}
	/**
	 * seta o a variavel nsu
	 * @param nsu
	 */
	public void setNsu(String nsu) {
		this.nsu = nsu;
	}
	/**
	 * retorna o cartão bin
	 * @return cartaoBin
	 */
	public String getCartaoBin() {
		return cartaoBin;
	}
	/**
	 * seta o a variavel cartaoBin
	 * @param cartaoBin
	 */
	public void setCartaoBin(String cartaoBin) {
		this.cartaoBin = cartaoBin;
	}
	/**
	 * retorna o cartao holder
	 * @return cartaoHolder
	 */
	public String getCartaoHolder() {
		return cartaoHolder;
	}
	/**
	 * seta o a variavel cartaoHolder
	 * @param cartaoHolder
	 */
	public void setCartaoHolder(String cartaoHolder) {
		this.cartaoHolder = cartaoHolder;
	}
	/**
	 * retorna o codigo de autorizacao
	 * @return
	 */
	public String getCodAutorizacao() {
		return codAutorizacao;
	}
	/**
	 * seta o a variavel codAutorizacao
	 * @param codAutorizacao
	 */
	public void setCodAutorizacao(String codAutorizacao) {
		this.codAutorizacao = codAutorizacao;
	}
	/**
	 * retorna o codgio CV
	 * @return codCV
	 */
	public String getCodCV() {
		return codCV;
	}
	/**
	 * seta o a variavel codCV
	 * @param codCV
	 */
	public void setCodCV(String codCV) {
		this.codCV = codCV;
	}
	/**
	 * retorna a variavel usoFuturo
	 * @return usoFuturo
	 */
	public Long getUsoFuturo() {
		return usoFuturo;
	}
	/**
	 * seta o a variavel usoFuturo
	 * @param usoFuturo
	 */
	public void setUsoFuturo(Long usoFuturo) {
		this.usoFuturo = usoFuturo;
	}
	/**
	 * retorna a data inicial da transacao
	 * @return dataInicialTransnacao
	 */
	public Date getDataInicialTransacao() {
		return dataInicialTransacao;
	}
	/**
	 * seta o a variavel dataInicialTransacao
	 * @param dataInicialTransacao
	 */
	public void setDataInicialTransacao(Date dataInicialTransacao) {
		this.dataInicialTransacao = dataInicialTransacao;
	}
	
}
