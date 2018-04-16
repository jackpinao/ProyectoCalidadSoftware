package pe.cjbs.wilson.layer.service;

import pe.cjbs.wilson.domain.Usuario;
import pe.cjbs.wilson.layer.dao.espec.CrudDaoUsuario;
import pe.cjbs.wilson.layer.dao.impl.CrudDaoUsuarioImpl;

public class InicioService
{
	public Usuario validar( String usuario, String clave )
	{
		Usuario user;
		CrudDaoUsuario daoUsuario = new CrudDaoUsuarioImpl();
		user = daoUsuario.consultarPorUsuario( usuario );
		
		if( user == null )
		{
			throw new RuntimeException( "Usuario no existe." );
		}
		
		if( !user.getUsu_clave().equals( clave ) )
		{
			throw new RuntimeException( "Clave incorrecta." );
		}
		
		return user;
	}
}
