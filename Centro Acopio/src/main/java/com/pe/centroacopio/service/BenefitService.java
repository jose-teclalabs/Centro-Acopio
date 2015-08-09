package com.pe.centroacopio.service;

import java.util.List;

import com.pe.centroacopio.pojo.Benefit;
import com.pe.centroacopio.pojo.Tip;

public interface BenefitService {
	public List getAllBenefits() ;
	public void addBenefit (Benefit benefit);
	public Benefit buscarPorIdBenefit(Benefit benefit);
	public void actualizarBenefit(Benefit benefit);
	public void eliminarBenefit(Benefit benefit);
}
