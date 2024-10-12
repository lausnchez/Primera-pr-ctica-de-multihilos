package carrerasThreads01;

import java.util.Iterator;

import javax.swing.JLabel;

public class Corredor extends Thread{
	private String nombre;
	private int coordenada;

	// Constructor -> Le damos un nombre y que herede los métodos de thread
	public Corredor(String nombre, int coordenada) {
		super();
		this.nombre = nombre;
		this.coordenada = coordenada;
	}
	
	// Getters & Setters
	//---------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(int coordenada) {
		this.coordenada = coordenada;
	}

	// Método de correr
	public void correr() {
		
		for(int i = 0; i < 10; i++) {
			
			// Instrucciones del thread
			this.coordenada = coordenada+10;
			
			
			System.out.println( nombre + ": " + i*1);
			// Dormimos el hilo un tiempo aleatorio
			try {
				this.sleep((long)(Math.random() * 1000));
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
