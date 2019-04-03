package com.sicredi.api.dto;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssociadoDto {

	@NotEmpty(message = "Campo nome deve ser preenchido.")
	@Length(min = 3, max = 50, message = "Campo nome deve ter entre 3 e 50 caractéres.")
	private String nome;

}
