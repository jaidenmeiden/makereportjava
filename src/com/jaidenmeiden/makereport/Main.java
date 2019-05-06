package com.jaidenmeiden.makereport;

/**
 * <h1>Make Report</h1>
 * Make Report es un programa que permite generar archivos de texto con cualquier contenido.
 * <p>
 * El programa puede ser utilizado en cualquier otro programa para generar evidencias,
 * documentos, reportes, etc.
 * 
 * @author Highlander Sword
 * @version 1.1
 * @since 2019
 * 
 * */
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: REPORTE:: \n");
		String content = report.getTitle();
		for (int i = 0; i < 5; i++) {
			content += "\nReporte : " + i;
		}
		report.setContent(content);
		report.makeReport();
		
		System.out.println("Guardo el archivo!");

	}
}
