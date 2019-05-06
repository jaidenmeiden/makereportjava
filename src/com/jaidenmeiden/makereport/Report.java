package com.jaidenmeiden.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <h1>Report</h1>
 * Report es una clase para generar archivos
 * <p>
 * Esta clase se utiliza para generar archivos con contenido personalizado 
 * usando la función {@code makeReport()} que es la que escribe el contenido en 
 * el archivo de texto. Se podría configurar con un formato especifico.
 * 
 * 
 * @author Highlander Sword
 * @version 1.1
 * @since 2018
 * */
public class Report {
	
	private String nameFile;
	private String title;
	private String content;
	private String extension;
	
	public String getNameFile() {
		return nameFile;
	}
	
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getExtension() {
		return extension;
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	/**
	 * {@code makeReport()} que es la que escribe el contenido en el archivo de texto
	 * */
	public void makeReport() {
		if ( (getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
			//Crear el archivo
			try {
				
				File file = new File(getNameFile()+"."+getExtension());//Se crea el archivo
				FileOutputStream fos = new FileOutputStream(file);//Convierte el archivo a String de bytes
				OutputStreamWriter osw = new OutputStreamWriter(fos);//Convierte todos los bytes en el archivo
				BufferedWriter bw = new BufferedWriter(osw);//Iniciamos el buffer
				bw.write(getContent());//Escribimos el contenido
				bw.close();//Cerramos el buffer
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} else {
			System.out.println("Ingresa los datos del archivo");
		}
	}

}
