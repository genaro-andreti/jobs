package com.sicredi.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicredi.api.model.Pauta;
import com.sicredi.api.repository.PautaRepository;
import com.sicredi.api.service.PautaService;

@Service
public class PautaServiceImpl implements PautaService {
	
	@Autowired
	private PautaRepository pautaRepository;

	@Override
	public Pauta cadastrar(Pauta pauta) {
		return pautaRepository.save(pauta);
	}

	@Override
	public Boolean pautaCadastrada(Long idPauta) {
		return pautaRepository.existsById(idPauta);
	}

}
