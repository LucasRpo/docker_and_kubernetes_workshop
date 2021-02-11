package co.com.bancolombia.containers.util;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.bancolombia.containers.dto.ClienteBancoDTO;
import co.com.bancolombia.containers.entities.ClienteBanco;

public class ConvertClienteBanco {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ClienteBanco convertToEntity(ClienteBancoDTO clienteBancoDTO) throws ParseException {
		return modelMapper.map(clienteBancoDTO, ClienteBanco.class);
	}
	
	public ClienteBancoDTO convertToDTO(ClienteBanco clienteBanco) throws ParseException {
		return modelMapper.map(clienteBanco, ClienteBancoDTO.class);
	}

}
