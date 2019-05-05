package com.jaidenmeiden.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

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
	
	public void makeReport() {
		if ( (getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
			//Crear el archivo
			try {
				
				File file = new File(getNameFile()+"."+getExtension());//Se crea el archivo
				FileOutputStream fos = new FileOutputStream(file);//Covierte el archivo a String de bytes
				OutputStreamWriter osw = new OutputStreamWriter(fos);//Covierte todos los bytes en el archivo
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
