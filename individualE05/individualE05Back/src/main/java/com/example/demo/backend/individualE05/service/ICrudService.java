package com.example.demo.backend.individualE05.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.backend.individualE05.dto.ProductoDTO;

public interface ICrudService {
	public List<ProductoDTO> findAll();

	public Optional<ProductoDTO> findById(int id);

	public ProductoDTO save(ProductoDTO dto);

	public void delete(ProductoDTO dto);
}
