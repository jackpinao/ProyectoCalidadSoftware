package pe.cjbs.wilson.layer.controller;

import java.util.List;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;
import pe.cjbs.wilson.layer.service.ExportCSVService;

public class ExportCSVController
{
	private ExportCSVService exportCSV;
	
	public ExportCSVController()
	{
		exportCSV = new ExportCSVService();
	}
	
	public void exportarCSVArt( List< ConsultaPorArticulo > lista, String fileName )
	{
		exportCSV.exportarCSVArt( lista, fileName );
	}
	
	public void exportarCSVCat( List< ConsultaPorCategoria > lista, String fileName )
	{
		exportCSV.exportarCSVCat( lista, fileName );
	}
}
