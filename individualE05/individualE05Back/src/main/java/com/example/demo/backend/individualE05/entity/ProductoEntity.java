package com.example.demo.backend.individualE05.entity;


import com.example.demo.backend.individualE05.dto.ProductoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Data
@NoArgsConstructor
@Entity
@Table(name="producto_table")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Column(name = "nombre")
    private String nombre;
    
    @NotBlank
    @Column(name = "descripcion")
    private String descripcion;
    

    @Column(name = "cantidad")
    private int cantidad;
    
    @NotBlank
    @Column(name = "estado")
    private String estado;



    public ProductoEntity(@JsonProperty("id") int id,@JsonProperty("nombre") String nombre, @JsonProperty("descripcion") String descripcion,@JsonProperty("cantidad") int cantidad,@JsonProperty("estado") String estado) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.estado = estado;
    }
	public ProductoDTO toDTO() {
		ProductoDTO dto = new ProductoDTO();
		dto.setId(this.getId());
		dto.setCantidad(this.getCantidad());
		dto.setDescripcion(this.getDescripcion());
		dto.setNombre(this.getNombre());
		dto.setEstado(this.getEstado());
		return dto;
	}
}
