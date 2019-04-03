package com.sicredi.api;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sicredi.api.model.Associado;
import com.sicredi.api.repository.AssociadoRepository;
import com.sicredi.api.service.AssociadoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssociadoServiceTest {

	@Autowired
	private AssociadoService associadoService;

	@MockBean
	private AssociadoRepository AssociadoRepository;

	@Test
	public void quandoInserimosUmAssociado() {

		Associado associadoMock = Associado.builder().id(1l).nome("Genaro")
				.build();

		Mockito.when(associadoService.cadastrar(associadoMock)).thenReturn(associadoMock);

		Associado associado = associadoService.cadastrar(associadoMock);

		Assertions.assertThat(associado.getId()).isEqualTo(associadoMock.getId());
		Assertions.assertThat(associado.getNome()).isEqualTo(associadoMock.getNome());
	}

}
