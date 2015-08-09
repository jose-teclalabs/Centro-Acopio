package com.pe.centroacopio.service;

import java.util.List;

import com.pe.centroacopio.model.ProductDTO;
import com.pe.centroacopio.pojo.Product;
import com.pe.centroacopio.pojo.ProductApplication;


public interface ProductJoinService {
	public List getAllProductApplications(ProductDTO prod);
	public List getAllProducts();
	public List getAllApplicattions();
	public List getAllTips();
	public List getAllBenefits();
	public void addProductApplication(ProductApplication productApplication);
	public ProductApplication buscarPorIdProductApplication(ProductApplication productApplication);
	public void eliminarProductoApplication(ProductApplication productApplication);
	public void addProductoAndTip(ProductApplication productApplication);
}
