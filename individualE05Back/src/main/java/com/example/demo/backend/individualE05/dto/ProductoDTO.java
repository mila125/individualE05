package com.example.demo.backend.individualE05.dto;

import javax.validation.constraints.NotBlank;

import com.example.demo.backend.individualE05.entity.ProductoEntity;

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
	private String Descripcion;

	@NotBlank
	private int Cantidad;
	
	@NotBlank
	private String Estado;
	public ProductoEntity toEntity() {
		ProductoEntity e = new ProductoEntity();
		e.setCantidad(this.getCantidad());
		e.setDescripcion(this.getDescripcion());
		e.setEstado(this.getEstado());
		e.setId(this.getId());
		e.setNombre(this.getNombre());
		return e;
	}
}
