package com.ipartek.formacion.pajaros;

public class DatosPersonales {
	public static String nombreAve;
	public String nombreDue�o;
	
	
	public DatosPersonales() {
		nombreAve="paquito";
		nombreDue�o="PEPE";
	}
	
	public static String getNombreAve() {
		return nombreAve;
	}
	public static void setNombreAve(String nombreAver) {
		nombreAve=nombreAver;
		Piolin.setNombre(nombreAver);
	}	
	
}