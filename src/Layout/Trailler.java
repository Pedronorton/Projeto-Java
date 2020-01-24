package Layout;

public class Trailler {
	private Integer tipoRegistro;
	private Integer totalRegistro;
	private String usoFuturo;

	public Trailler(Integer tipoRegistro,Integer totalRegistro,String usoFuturo){
		this.tipoRegistro = tipoRegistro;
		this.totalRegistro = totalRegistro;
		this.usoFuturo = usoFuturo;
	}
	
	public Integer getTipoRegistro() {
		return tipoRegistro;
	}
	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	public Integer getTotalRegistro() {
		return totalRegistro;
	}
	public void setTotalRegistro(Integer totalRegistro) {
		this.totalRegistro = totalRegistro;
	}
	public String getUsoFuturo() {
		return usoFuturo;
	}
	public void setUsoFuturo(String usoFuturo) {
		this.usoFuturo = usoFuturo;
	}
}
