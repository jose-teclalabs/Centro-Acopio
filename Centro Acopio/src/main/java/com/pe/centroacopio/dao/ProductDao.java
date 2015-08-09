package com.pe.centroacopio.dao;

import java.util.List;

import com.pe.centroacopio.model.ProductDTO;
import com.pe.centroacopio.pojo.Product;

public interface ProductDao {
	
	public void addProduct (ProductDTO product);
	public List getAllProducts();
	public Product buscarPorIdProduct(ProductDTO product);
	public void actualizarProducto(ProductDTO product);
	public void actualizarPhoto(ProductDTO product);
	public void eliminarProducto(ProductDTO product);
	public Product capturarIdProduct(ProductDTO product);
	public List getFilterProduct ();
}
