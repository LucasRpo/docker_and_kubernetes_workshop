package co.com.bancolombia.containers.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.bancolombia.containers.dto.ClienteBancoDTO;
import co.com.bancolombia.containers.entities.ClienteBanco;
import co.com.bancolombia.containers.repositories.ClienteBancoRepository;
import co.com.bancolombia.containers.util.Constantes;
import co.com.bancolombia.containers.util.ConvertClienteBanco;

@RestController
public class CuentaController {
	
	@Autowired
	private ClienteBancoRepository clienteBancoRepository;
	
	@Autowired
	private ConvertClienteBanco convertClienteBanco;
	
	@PostMapping("/clientes/adicionarCliente")
	public Map<String, String> adicionarCliente(@RequestBody ClienteBancoDTO clienteBancoDTO) {
		Map<String, String> response = new HashMap<>();
		try {
			ClienteBanco clienteBanco = convertClienteBanco.convertToEntity(clienteBancoDTO);
			clienteBancoRepository.save(clienteBanco);
			response.put(Constantes.CODIGO_HTTP, "200");
			response.put(Constantes.MENSAJE_EXITO, "Registrado insertado exitosamente");
			return response;
		} catch (ParseException e) {
			response.put(Constantes.CODIGO_HTTP, "500");
			response.put(Constantes.MENSAJE_ERROR, "Ocurrió un problema al insertar");
			return response;
		}
		
	}

}
