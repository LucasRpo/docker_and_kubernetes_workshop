package co.com.bancolombia.containers;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.com.bancolombia.containers.dto.CuentaDTO;
import co.com.bancolombia.containers.util.ConvertClienteBanco;
import co.com.bancolombia.containers.util.ConvertCuenta;

@SpringBootApplication
public class ContainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public CuentaDTO cuentaDTO() {
		return new CuentaDTO();
	}
	
	@Bean
	public ConvertCuenta convertCuenta() {
		return new ConvertCuenta();
	}
	
	@Bean
	public ConvertClienteBanco convertClienteBanco() {
		return new ConvertClienteBanco();
	}

}
