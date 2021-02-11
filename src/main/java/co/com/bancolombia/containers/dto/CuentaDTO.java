package co.com.bancolombia.containers.dto;

public class CuentaDTO {
	
	private Long id;
	private String tipoCuenta;
	private String numeroCuenta;
	public CuentaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CuentaDTO(Long id, String tipoCuenta, String numeroCuenta) {
		super();
		this.id = id;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
}
