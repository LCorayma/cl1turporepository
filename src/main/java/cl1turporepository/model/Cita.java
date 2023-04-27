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

}
