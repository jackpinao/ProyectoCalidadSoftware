package pe.cjbs.wilson.layer.controller;

import java.util.List;

import pe.cjbs.wilson.domain.Cliente;
import pe.cjbs.wilson.layer.service.ClienteService;

public class ClienteController
{
	private ClienteService clienteService;
	
	public ClienteController()
	{
		clienteService = new ClienteService();
	}
	
	public Cliente consultarPorCodigo( String codigo )
	{
		return clienteService.consultarPorCodigo( codigo );
	}
	
	public List< Cliente > consultarPorNombre( String nombre )
	{
		return clienteService.consultarPorNombre( nombre );
	}
	
	public void insertar( Cliente cliente )
	{
		clienteService.insertar( cliente );
	}
	
	public void actualizar( Cliente cliente )
	{
		clienteService.actualizar( cliente );
	}
	
	public void eliminar( String codigo )
	{
		clienteService.eliminar( codigo );
	}
}
