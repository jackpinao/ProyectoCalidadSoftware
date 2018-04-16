package pe.cjbs.wilson.layer.service;

import java.util.List;

import pe.cjbs.wilson.domain.Cliente;
import pe.cjbs.wilson.layer.dao.espec.CrudDaoCliente;
import pe.cjbs.wilson.layer.dao.impl.CrudDaoClienteImpl;

public class ClienteService
{
	private CrudDaoCliente crudDaoCliente;
	
	public ClienteService()
	{
		crudDaoCliente = new CrudDaoClienteImpl();
	}
	
	public Cliente consultarPorCodigo( String codigo )
	{
		return crudDaoCliente.consultarPorCodigo( codigo );
	}
	
	public List< Cliente > consultarPorNombre( String nombre )
	{
		return crudDaoCliente.consultarPorNombre( nombre );
	}
	
	public void insertar( Cliente cliente )
	{
		crudDaoCliente.insertar( cliente );
	}
	
	public void actualizar( Cliente cliente )
	{
		crudDaoCliente.actualizar(cliente );
	}
	
	public void eliminar( String codigo )
	{
		crudDaoCliente.eliminar( codigo );
	}
}
