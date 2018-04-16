package pe.cjbs.wilson.layer.controller;

import pe.cjbs.wilson.domain.Venta;
import pe.cjbs.wilson.layer.service.ProcesosService;

public class ProcesosController
{
	private ProcesosService procesosService;
	
	public ProcesosController()
	{
		procesosService = new ProcesosService();
	}
	
	public void grabarVenta( Venta venta )
	{
		procesosService.grabarVenta( venta );
	}
}
