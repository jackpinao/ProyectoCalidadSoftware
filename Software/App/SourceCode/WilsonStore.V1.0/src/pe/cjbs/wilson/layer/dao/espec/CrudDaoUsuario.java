package pe.cjbs.wilson.layer.dao.espec;

import pe.cjbs.wilson.domain.Usuario;

public interface CrudDaoUsuario extends CrudDao<Usuario>
{
	Usuario consultarPorUsuario( String usuario );
}
