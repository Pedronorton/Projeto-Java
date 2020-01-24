package Layout;

import java.util.Date;

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
	
	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	
	public void setEstabelecimento(long estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	public void setDataProcessamento(Date dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	
	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}
	
	public void setperiodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
	}
	
	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}
	
	public void setFiller(String filler) {
		this.filler = filler;
	}
	
	public void setEmpresaAdquirinte(String empresaAdquirinte) {
		this.empresaAdquirinte = empresaAdquirinte;
	}
	
	public void setTipoExtrato(Integer tipoExtrato) {
		this.tipoExtrato = tipoExtrato;
	}
	
	public void setVersaoLayout(String versaoLayout) {
		this.versaoLayout = versaoLayout;
	}
	
	public void setVersaoRelease(String versaoRelease) {
		this.versaoRelease = versaoRelease;
	}
	
	public void setUsoFuturo(String usoFuturo) {
		this.usoFuturo = usoFuturo;
	}
	
	public Long getEstabelecimento() {
		return estabelecimento;
	}

	public Date getPeriodoFinal() {
		return periodoFinal;
	}

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public Date getDataProcessamento() {
		return dataProcessamento;
	}

	public Date getPeriodoInicial() {
		return periodoInicial;
	}

	public Integer getSequencia() {
		return sequencia;
	}

	public String getEmpresaAdquirinte() {
		return empresaAdquirinte;
	}

	public String getFiller() {
		return filler;
	}

	public Integer getTipoExtrato() {
		return tipoExtrato;
	}

	public String getVersaoLayout() {
		return versaoLayout;
	}

	public String getVersaoRelease() {
		return versaoRelease;
	}

	public String getUsoFuturo() {
		return usoFuturo;
	}
	
	
}

