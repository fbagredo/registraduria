package com.springboot.soap.web.services.cedula;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cedulas.ValidarCedulaRequest;
import com.cedulas.ValidarCedulaResponse;

@Endpoint
public class CedulaEndpoint {

	@PayloadRoot(namespace = "http://localhost:8080/ws", localPart = "validarCedulaRequest")
	@ResponsePayload
	public ValidarCedulaResponse processCourseDetailsRequest(@RequestPayload ValidarCedulaRequest request) {
		ValidarCedulaResponse response = new ValidarCedulaResponse();
		

		if ("CC".equals(request.getTipoId()) && request.getNumCedula().contains("123")) {
			response.setIsValido(true);
		}else
			response.setIsValido(false);
		
		return response;
	}

}