package cl1turporepository.configuration;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import cl1turporepository.configuration.Conn;

public class Conn {
	
	private static Conn instancia = new Conn();
	private EntityManagerFactory factory;
	
	public Conn() {
		this.factory = Persistence.createEntityManagerFactory("cl1turpo01");
	}
	
	public static Conn getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}

}
