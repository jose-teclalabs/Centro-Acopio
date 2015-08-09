package com.pe.centroacopio.dao;

import java.util.List;

import com.pe.centroacopio.model.BenefitDTO;
import com.pe.centroacopio.pojo.Benefit;

public interface BenefitDao {
	
	public List getAllBenefits();
	public void addBenefit (BenefitDTO bene);
	public Benefit buscarPorIdBenefit(BenefitDTO bene);
	public void actualizarBenefit(BenefitDTO bene);
	public void eliminarBenefit(BenefitDTO bene);
	public List getFilterBenefit ();

}
