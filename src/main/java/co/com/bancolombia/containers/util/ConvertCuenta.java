package co.com.bancolombia.containers.util;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.bancolombia.containers.dto.CuentaDTO;
import co.com.bancolombia.containers.entities.Cuenta;

public class ConvertCuenta {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Cuenta convertToEntity(CuentaDTO cuentaDTO) throws ParseException {
		return modelMapper.map(cuentaDTO, Cuenta.class);
	}
	
	public CuentaDTO convertToDTO(Cuenta cuenta) throws ParseException {
		return modelMapper.map(cuenta, CuentaDTO.class);
	}

}
