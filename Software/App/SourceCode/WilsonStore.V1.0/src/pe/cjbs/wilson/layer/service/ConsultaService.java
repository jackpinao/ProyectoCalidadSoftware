package pe.cjbs.wilson.layer.service;

import java.util.List;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;
import pe.cjbs.wilson.layer.dao.espec.DaoConsulta;
import pe.cjbs.wilson.layer.dao.impl.DaoConsultaImpl;

public class ConsultaService
{
	private DaoConsulta daoConsulta;
	
	public ConsultaService()
	{
		daoConsulta = new DaoConsultaImpl();
	}
	
	public List< ConsultaPorArticulo > consultarPorArticulo( String fechaInicio, String fechaFinal )
	{
		return daoConsulta.consultarPorArticulo(fechaInicio, fechaFinal);
	}
	
	public List< ConsultaPorCategoria > consultarPorCategoria( String fechaInicio, String fechaFinal )
	{
		return daoConsulta.consultarPorCategoria( fechaInicio, fechaFinal );
	}
}
