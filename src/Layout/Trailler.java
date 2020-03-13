package Layout;

/**
 * @author Pedro Cobianchi Borges Paiva
 * @since 17/01/2020
 */

public class Trailler {
	private Integer tipoRegistro;
	private Integer totalRegistro;
	private String usoFuturo;

	/**
	 * Construtor da classe Trailler que tem como objetivo criar o objeto trailler.
	 * @param tipoRegistro
	 * @param totalRegistro
	 * @param usoFuturo
	 */
	public Trailler(Integer tipoRegistro,Integer totalRegistro,String usoFuturo){
		this.tipoRegistro = tipoRegistro;
		this.totalRegistro = totalRegistro;
		this.usoFuturo = usoFuturo;
	}
	/**
	 * retorna o tipo de registro
	 * @return tipoRegistro
	 */
	public Integer getTipoRegistro() {
		return tipoRegistro;
	}
	/**
	 * seta a variavel tipoRegistro
	 * @param tipoRegistro
	 */
	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	/**
	 * retorna o numero total de registros
	 * @return totalRegistro
	 */
	public Integer getTotalRegistro() {
		return totalRegistro;
	}
	/**
	 * seta a variavel totalRegistro
	 * @param totalRegistro
	 */
	public void setTotalRegistro(Integer totalRegistro) {
		this.totalRegistro = totalRegistro;
	}
	/**
	 * retorna a variavel usoFuturo
	 * @return usoFuturo
	 */
	public String getUsoFuturo() {
		return usoFuturo;
	}
	/**
	 * seta a variavel usoFuturo
	 * @param usoFuturo
	 */
	public void setUsoFuturo(String usoFuturo) {
		this.usoFuturo = usoFuturo;
	}
}
