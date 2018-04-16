package pe.cjbs.wilson.layer.service;

import pe.cjbs.wilson.domain.Empleado;
import pe.cjbs.wilson.layer.dao.espec.CrudDaoEmpleado;
import pe.cjbs.wilson.layer.dao.impl.CrudDaoEmpleadoImpl;

public class EmpleadoService
{
	private CrudDaoEmpleado crudDaoEmpleado;
	
	public EmpleadoService()
	{
		crudDaoEmpleado = new CrudDaoEmpleadoImpl();
	}
	
	public Empleado consultarPorCodigo( String codigo )
	{
		return crudDaoEmpleado.consultarPorCodigo( codigo );
	}
}
