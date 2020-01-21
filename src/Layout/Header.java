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
	private String filler;
	private Integer tipoExtrato;
	private String versaoLayout;
	private String versaoRelease;
	private String usoFuturo;
	
	
	public void setTipoRegistro(Integer v) {
		tipoRegistro = v;
	}
	
	public void setEstabelecimento(long v) {
		estabelecimento = v;
	}
	
	public void setDataProcessamento(Date v) {
		dataProcessamento = v;
	}
	
	public void setPeriodoInicial(Date v) {
		periodoInicial = v;
	}
	
	public void setperiodoFinal(Date v) {
		periodoFinal = v;
	}
	
	public void setSequencia(Integer v) {
		sequencia = v;
	}
	
	public void setFiller(String v) {
		filler = v;
	}
	
	public void setEmpresaAdquirinte(String v) {
		empresaAdquirinte = v;
	}
	
	public void setTipoExtrato(Integer v) {
		tipoExtrato = v;
	}
	
	public void setVersaoLayout(String v) {
		versaoLayout = v;
	}
	
	public void setVersaoRelease(String v) {
		versaoRelease = v;
	}
	
	public void setUsoFuturo(String v) {
		usoFuturo = v;
	}
	
	public Long getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Long estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Date getPeriodoFinal() {
		return periodoFinal;
	}

	public void setPeriodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
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

