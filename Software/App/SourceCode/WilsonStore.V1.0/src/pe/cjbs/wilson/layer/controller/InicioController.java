package pe.cjbs.wilson.layer.controller;

import pe.cjbs.wilson.domain.Usuario;
import pe.cjbs.wilson.layer.service.InicioService;
import pe.cjbs.wilson.layer.view.util.Sesion;

public class InicioController
{
	public void validar( String usuario, String clave )
	{
		InicioService service = new InicioService();
		Usuario user = service.validar( usuario, clave );
		Sesion.put( "usuario", user );
	}	
}
