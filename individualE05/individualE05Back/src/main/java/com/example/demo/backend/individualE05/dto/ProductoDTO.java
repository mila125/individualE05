package com.example.demo.backend.individualE05.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import com.example.demo.backend.individualE05.entity.ProductoEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {

		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@NotBlank
		private String nombre;

		@NotBlank
		private String descripcion;

		 @NotNull
		private int cantidad;
		
		
		private String estado;
		
		public ProductoEntity toEntity() {
			ProductoEntity e = new ProductoEntity();
		
			e.setDescripcion(this.getDescripcion());
			e.setCantidad(this.getCantidad());
			e.setEstado(this.getEstado());
			e.setNombre(this.getNombre());
	
			return e;
		}
	}

}
