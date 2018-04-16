package pe.cjbs.wilson.layer.service;

import java.util.List;

import pe.cjbs.wilson.domain.Articulo;
import pe.cjbs.wilson.layer.dao.espec.CrudDaoArticulo;
import pe.cjbs.wilson.layer.dao.impl.CrudDaoArticuloImpl;

public class ArticuloService
{
	private CrudDaoArticulo crudDaoArticulo;
	
	public ArticuloService()
	{
		crudDaoArticulo = new CrudDaoArticuloImpl();
	}
	
	public Articulo consultarPorCodigo( String codigo )
	{
		return crudDaoArticulo.consultarPorCodigo( codigo );
	}
	
	public List<Articulo> consultarPorNombre( String nombre )
	{
		return crudDaoArticulo.consultarPorNombre( nombre );
	}
	
	public void insertar( Articulo articulo )
	{
		crudDaoArticulo.insertar( articulo );
	}
	
	public void actualizar( Articulo articulo )
	{
		crudDaoArticulo.actualizar( articulo );
	}
	
	public void eliminar( String codigo )
	{
		crudDaoArticulo.eliminar( codigo );
	}
}
