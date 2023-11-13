package com.example.demo.frontend.individualE05.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
	private int id;

	@NotBlank
	private String nombre;

	@NotBlank
	private String descripcion;
	
	@NotBlank
	private String estado;


	private int cantidad;

}
