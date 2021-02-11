package co.com.bancolombia.containers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cuenta {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipoCuenta;
	private String numeroCuenta;
	@OneToOne(mappedBy = "cuenta")
	private ClienteBanco clienteBanco;
	
	
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuenta(Long id, String tipoCuenta, String numeroCuenta, ClienteBanco clienteBanco) {
		super();
		this.id = id;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.clienteBanco = clienteBanco;
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
