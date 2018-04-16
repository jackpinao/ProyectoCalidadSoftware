package pe.cjbs.wilson.layer.controller;

import java.util.List;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;
import pe.cjbs.wilson.layer.service.ConsultaService;

public class ConsultaController
{
	private ConsultaService consultaService;
	
	public ConsultaController()
	{
		consultaService = new ConsultaService();
	}
	
	public List< ConsultaPorArticulo > consultarPorArticulo( String fechaInicio, String fechaFinal )
	{
		return consultaService.consultarPorArticulo( fechaInicio, fechaFinal );
	}
	
	public List< ConsultaPorCategoria > consultarPorCategoria( String fechaInicio, String fechaFinal )
	{
		return consultaService.consultarPorCategoria( fechaInicio, fechaFinal );
	}
}
