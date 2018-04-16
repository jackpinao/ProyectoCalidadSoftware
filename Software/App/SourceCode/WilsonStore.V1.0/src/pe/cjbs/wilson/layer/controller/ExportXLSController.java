package pe.cjbs.wilson.layer.controller;

import java.util.List;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;
import pe.cjbs.wilson.layer.service.ExportXLSService;

public class ExportXLSController
{
	private ExportXLSService exportXLS;
	
	public ExportXLSController()
	{
		exportXLS = new ExportXLSService();
	}
	
	public void exportarXLSArt( List< ConsultaPorArticulo > lista, String fileName )
	{
		exportXLS.exportarXLSArt( lista, fileName );
	}
	
	public void exportarXLSCat( List< ConsultaPorCategoria > lista, String fileName )
	{
		exportXLS.exportarXLSCat( lista, fileName );
	}
}
