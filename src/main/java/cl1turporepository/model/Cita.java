package cl1turporepository.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cita")
public class Cita implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cita")
	private int c_id;
	
	@Column(name = "num_cita")
	private int c_numero;
	
	@Column(name = "fecha_cita")
	private int c_fecha;

	@Column(name = "nom_paciente_cita", length = 50)
	private String c_paciente;

	@ManyToOne
	@JoinColumn(name = "ide_doctor")
	private Doctor c_doctor;
	
	

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getC_numero() {
		return c_numero;
	}

	public void setC_numero(int c_numero) {
		this.c_numero = c_numero;
	}

	public int getC_fecha() {
		return c_fecha;
	}

	public void setC_fecha(int c_fecha) {
		this.c_fecha = c_fecha;
	}

	public String getC_paciente() {
		return c_paciente;
	}

	public void setC_paciente(String c_paciente) {
		this.c_paciente = c_paciente;
	}

	public Doctor getC_doctor() {
		return c_doctor;
	}

	public void setC_doctor(Doctor c_doctor) {
		this.c_doctor = c_doctor;
	}

}
