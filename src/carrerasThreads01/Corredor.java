package carrerasThreads01;

import java.awt.Frame;
import java.util.Iterator;

import javax.swing.JLabel;

public class Corredor extends Thread{
	private String nombre;
	private JLabel etiqueta;

	// Constructor -> Le damos un nombre y que herede los métodos de thread
	public Corredor(String nombre, JLabel etiqueta) {
		super();
		this.nombre = nombre;
		this.etiqueta = etiqueta;
	}
	
	// Getters & Setters
	//---------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCoordenada(int coordenada) {
	}

	// Método de correr
	public void correr() {
		Interfaz pantalla = new Interfaz();
		
		while(etiqueta.getX()<800) {
			try {
			// Instrucciones del thread
			this.sleep((long)(Math.random() * 1000));
			this.etiqueta.setLocation(etiqueta.getX()+5, etiqueta.getY());

			// Dormimos el hilo un tiempo aleatorio
			
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}	
		}
		System.out.println(nombre + " llega a la meta");
	}
	
	@Override
	public void run() {
		this.correr();
	}
}
