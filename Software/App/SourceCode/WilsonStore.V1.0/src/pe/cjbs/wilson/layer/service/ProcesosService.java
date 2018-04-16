package pe.cjbs.wilson.layer.service;

import pe.cjbs.wilson.domain.Venta;
import pe.cjbs.wilson.layer.dao.espec.DaoProcesos;
import pe.cjbs.wilson.layer.dao.impl.DaoProcesosImpl;

public class ProcesosService
{
	private DaoProcesos daoProcesos;
	
	public ProcesosService()
	{
		daoProcesos = new DaoProcesosImpl();
	}
	
	public void grabarVenta( Venta venta )
	{
		daoProcesos.grabarVenta( venta );
	}
}
