package com.pe.centroacopio.service;

import java.util.List;

import com.pe.centroacopio.model.ProductDTO;
import com.pe.centroacopio.pojo.Product;

public interface ProductService {
	public void addProduct (Product product);
	public List getAllProducts() ;
	public Product buscarPorIdProduct(Product product);
	public void actualizarProducto(Product product);
	public void actualizarPhotoProducto(Product product);
	public void eliminarProducto(Product product);
	public Product capturarIdProduct(Product product);
	
	

}
