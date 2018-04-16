package pe.cjbs.wilson.layer.dao.espec;

import java.util.List;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;

public interface DaoConsulta
{
	List< ConsultaPorArticulo > consultarPorArticulo( String fechaInicio, String fechaFinal );
	List< ConsultaPorCategoria > consultarPorCategoria( String fechaInicio, String fechaFinal );
}
