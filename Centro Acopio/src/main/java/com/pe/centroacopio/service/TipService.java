package com.pe.centroacopio.service;

import java.util.List;

import com.pe.centroacopio.pojo.Product;
import com.pe.centroacopio.pojo.Tip;

public interface TipService {
	
	public List getAllTips() ;
	public void addTip (Tip tip);
	public Tip buscarPorIdTip(Tip tip);
	public void actualizarTip(Tip tip);
	public void eliminarTip(Tip tip);
}
