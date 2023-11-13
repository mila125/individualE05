package com.example.demo.frontend.individualE05.service;

import java.util.List;

import com.example.demo.frontend.individualE05.dto.ProductoDTO;

public interface ICrudService {

	public List<ProductoDTO> findAllREST();

	public ProductoDTO findByIdREST(int id);

	public ProductoDTO saveREST(ProductoDTO producto);

	public ProductoDTO deleteREST(int id);
}
