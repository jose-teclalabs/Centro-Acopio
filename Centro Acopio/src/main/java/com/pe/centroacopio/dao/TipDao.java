package com.pe.centroacopio.dao;

import java.util.List;

import com.pe.centroacopio.model.ProductDTO;
import com.pe.centroacopio.model.TipDTO;
import com.pe.centroacopio.pojo.Product;
import com.pe.centroacopio.pojo.Tip;

public interface TipDao {
	
	public List getAllTips();
	public void addTip (TipDTO tip);
	public Tip buscarPorIdTip(TipDTO tip);
	public void actualizarTip(TipDTO tip);
	public void eliminarTip(TipDTO tip);
	public List getFilterTips ();

}
