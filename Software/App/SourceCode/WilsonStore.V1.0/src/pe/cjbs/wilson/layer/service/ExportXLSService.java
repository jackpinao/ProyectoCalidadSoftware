package pe.cjbs.wilson.layer.service;

import java.util.List;
import pe.cjbs.wilson.layer.export.ExportXLS;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;

public class ExportXLSService
{
	private ExportXLS exportXLS;
	
	public ExportXLSService()
	{
		exportXLS = new ExportXLS();
	}
	
	public void exportarXLSArt( List< ConsultaPorArticulo > lista, String fileName )
	{
		exportXLS.generateXlsFileA( lista, fileName );
	}
	
	public void exportarXLSCat( List< ConsultaPorCategoria > lista, String fileName )
	{
		exportXLS.generateXlsFileC( lista, fileName );
	}
}
