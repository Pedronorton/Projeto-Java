package layout;

import java.util.Date;
/**
 * @author Pedro Cobianchi Borges Paiva
 * @since 17/01/2020
 */

public class Header {
	

	private Integer tipoRegistro;
	private Long estabelecimento;
	private Date dataProcessamento;
	private Date periodoInicial;
	private Date periodoFinal;
	private Integer sequencia;
	private String empresaAdquirinte;
	private Integer tipoExtrato;
	private String filler;
	private String versaoLayout;
	private String versaoRelease;
	private String usoFuturo;
	
	/**
	 * Contrturo da classe Header - Tem como objetivo criar o objeto header com as informações gerais da empresa e layout.
	 * @param tipoRegistro
	 * @param estabelecimento
	 * @param dataProcessamento
	 * @param periodoInicial
	 * @param periodoFinal
	 * @param sequencia
	 * @param empresaAdquirinte
	 * @param tipoExtrato
	 * @param filler
	 * @param versaoLayout
	 * @param versaoRelease
	 * @param usoFuturo
	 */
	public Header(Integer tipoRegistro, Long estabelecimento, Date dataProcessamento, Date periodoInicial,Date  periodoFinal, Integer sequencia, String empresaAdquirinte, 
	Integer tipoExtrato, String filler, String versaoLayout, String versaoRelease, String usoFuturo){

		this.tipoRegistro = tipoRegistro;
		this.estabelecimento = estabelecimento;
		this.dataProcessamento = dataProcessamento;
		this.periodoInicial = periodoInicial;
		this.periodoFinal = periodoFinal;
		this.sequencia = sequencia;
		this.empresaAdquirinte = empresaAdquirinte;
		this.tipoExtrato = tipoExtrato;
		this.filler = filler;
		this.versaoLayout = versaoLayout;
		this.versaoRelease = versaoRelease;
		this.usoFuturo = usoFuturo;
	}
	
	/**
	 * seta a variavel tipoRegistro
	 * @param tipoRegistro
	 */
	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	/**
	 * seta a variavel estabelecimento
	 * @param estabelecimento
	 */
	public void setEstabelecimento(long estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	/**
	 * seta a variavel dataProcessamento
	 * @param dataProcessamento
	 */
	public void setDataProcessamento(Date dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	/**
	 * seta a variavel periodoInicial
	 * @param periodoInicial
	 */
	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}
	/**
	 * seta a variavel periodoFinal
	 * @param periodoFinal
	 */
	public void setperiodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
	}
	/**
	 * seta a variavel sequencia
	 * @param sequencia
	 */
	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}
	/**
	 * seta a variavel empresaAdquirinte
	 * @param empresaAdquirinte
	 */
	public void setEmpresaAdquirinte(String empresaAdquirinte) {
		this.empresaAdquirinte = empresaAdquirinte;
	}
	/**
	 * seta a variavel tipoRegistro
	 * @param tipoExtrato
	 */
	public void setTipoExtrato(Integer tipoExtrato) {
		this.tipoExtrato = tipoExtrato;
	}
	/**
	 * seta a variavel versaoLayout
	 * @param versaoLayout
	 */
	public void setVersaoLayout(String versaoLayout) {
		this.versaoLayout = versaoLayout;
	}
	/**
	 * seta a variavel versaoRelease
	 * @param versaoRelease
	 */
	public void setVersaoRelease(String versaoRelease) {
		this.versaoRelease = versaoRelease;
	}
	/**
	 * seta a variavel usoFuturo
	 * @param usoFuturo
	 */
	public void setUsoFuturo(String usoFuturo) {
		this.usoFuturo = usoFuturo;
	}
	/**
	 * retorna o estabelecimento
	 * @return estabelecimento
	 */
	public Long getEstabelecimento() {
		return estabelecimento;
	}
	/**
	 * retorna o periodoFinal
	 * @return periodoFinal
	 */
	public Date getPeriodoFinal() {
		return periodoFinal;
	}
	/**
	 * retorna o tipo de registro
	 * @return tipoRegistro
	 */
	public Integer getTipoRegistro() {
		return tipoRegistro;
	}
	/**
	 * retorna a data de processamento
	 * @return dataProcessamento
	 */
	public Date getDataProcessamento() {
		return dataProcessamento;
	}
	/**
	 * retorna o periodo inicial
	 * @return periodoInicial
	 */
	public Date getPeriodoInicial() {
		return periodoInicial;
	}
	/**
	 * retorna a sequencia
	 * @return sequencia
	 */
	public Integer getSequencia() {
		return sequencia;
	}
	/**
	 * retorna a empresa adquirinte
	 * @return empresaAdquirinte
	 */
	public String getEmpresaAdquirinte() {
		return empresaAdquirinte;
	}
	 /**
	  * retorna o filler
	  * @return filler
	  */
	public String getFiller() {
		return filler;
	}
	/**
	 * retorna o tipo de extrato
	 * @return tipoExtrato
	 */
	public Integer getTipoExtrato() {
		return tipoExtrato;
	}
	/**
	 * retorna a versao do layout
	 * @return versaoLayout
	 */
	public String getVersaoLayout() {
		return versaoLayout;
	}
	/**
	 * retorna a versao da release
	 * @return versaoRelease
	 */
	public String getVersaoRelease() {
		return versaoRelease;
	}
	/**
	 * retorna a variavel usoFuturo
	 * @return usoFuturo
	 */
	public String getUsoFuturo() {
		return usoFuturo;
	}
	
	
}

