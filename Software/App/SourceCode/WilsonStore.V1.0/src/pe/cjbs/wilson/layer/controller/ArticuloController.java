package pe.cjbs.wilson.layer.controller;

import java.util.List;

import pe.cjbs.wilson.domain.Articulo;
import pe.cjbs.wilson.layer.service.ArticuloService;

public class ArticuloController
{
	private ArticuloService articuloService;
	
	public ArticuloController()
	{
		articuloService = new ArticuloService();
	}
	
	public Articulo consultarPorCodigo( String codigo )
	{
		return articuloService.consultarPorCodigo( codigo );
	}
	
	public List<Articulo> consultarPorNombre( String nombre )
	{
		return articuloService.consultarPorNombre( nombre );
	}
	
	public void insertar( Articulo articulo )
	{
		articuloService.insertar( articulo );
	}
	
	public void actualizar( Articulo articulo )
	{
		articuloService.actualizar( articulo );
	}
	
	public void eliminar( String codigo )
	{
		articuloService.eliminar( codigo );
	}
}
