package pe.cjbs.wilson.layer.controller;

import pe.cjbs.wilson.domain.Empleado;
import pe.cjbs.wilson.layer.service.EmpleadoService;

public class EmpleadoController
{
	private EmpleadoService empleadoService;
	
	public EmpleadoController()
	{
		empleadoService = new EmpleadoService();
	}
	
	public Empleado consultarPorCodigo( String codigo )
	{
		return empleadoService.consultarPorCodigo( codigo );
	}
}
