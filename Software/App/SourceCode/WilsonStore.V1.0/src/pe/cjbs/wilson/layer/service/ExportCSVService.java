package pe.cjbs.wilson.layer.service;

import pe.cjbs.wilson.layer.export.ExportCSV;
import java.util.List;
import pe.cjbs.wilson.domain.ConsultaPorArticulo;
import pe.cjbs.wilson.domain.ConsultaPorCategoria;

public class ExportCSVService
{
	private ExportCSV exportCSV;
	
	public ExportCSVService()
	{
		exportCSV = new ExportCSV();
	}
	
	public void exportarCSVArt( List< ConsultaPorArticulo > lista, String fileName )
	{
		exportCSV.generateCsvFileA( lista, fileName );
	}
	
	public void exportarCSVCat( List< ConsultaPorCategoria > lista, String fileName )
	{
		exportCSV.generateCsvFileC(lista, fileName );
	}
}
