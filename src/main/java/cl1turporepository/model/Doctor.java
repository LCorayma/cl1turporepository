package cl1turporepository.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_doctor")
	private int d_id;
	
	@Column(name = "nom_doctor", length = 75)
	private String d_nombre;
	
	@Column(name = "especialidad_doctor", length = 75)
	private String d_especialidad;
	
	

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_nombre() {
		return d_nombre;
	}

	public void setD_nombre(String d_nombre) {
		this.d_nombre = d_nombre;
	}

	public String getD_especialidad() {
		return d_especialidad;
	}

	public void setD_especialidad(String d_especialidad) {
		this.d_especialidad = d_especialidad;
	}

}
