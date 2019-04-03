package com.sicredi.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicredi.api.model.Associado;
import com.sicredi.api.repository.AssociadoRepository;
import com.sicredi.api.service.AssociadoService;

@Service
public class AssociadoServiceImpl implements AssociadoService {
	
	@Autowired
	private AssociadoRepository associadoRepository;

	@Override
	public Associado cadastrar(Associado associado) {
		return associadoRepository.save(associado);
	}

	@Override
	public Boolean associadoCadastrado(Long idAssociado) {
		return associadoRepository.existsById(idAssociado);
	}
	

}
