package cl1turporepository.main;

import jakarta.persistence.EntityManager;
import cl1turporepository.model.Cita;
import cl1turporepository.model.Doctor;

import cl1turporepository.configuration.Conn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager cl = Conn.getInstancia().getFactory().createEntityManager();
		
		Cita cita1 = new Cita();
		cita1.setC_numero(45);
		cita1.setC_fecha(11112012);
		cita1.setC_paciente("Jorgue Garcia Miron");
		
		Cita cita2 = new Cita();
		cita2.setC_numero(28);
		cita2.setC_fecha(11072012);
		cita2.setC_paciente("Jose Miranda");
		
		Cita cita3 = new Cita();
		cita3.setC_numero(74);
		cita3.setC_fecha(10082012);
		cita3.setC_paciente("Juan Paquito Perez");
		
		Doctor doctor1 = new Doctor();
		doctor1.setD_nombre("Manolito Manguera");
		doctor1.setD_especialidad("Dentista");
		
		Doctor doctor2 = new Doctor();
		doctor2.setD_nombre("Raul Gutierres");
		doctor2.setD_especialidad("Dermatologo");
		
		Doctor doctor3 = new Doctor();
		doctor3.setD_nombre("Maria Isabelle");
		doctor3.setD_especialidad("Nutricionista");
		
		
		cl.getTransaction().begin();
		cl.persist(cita1);
		cl.persist(cita2);
		cl.persist(cita3);
		cl.persist(doctor1);
		cl.persist(doctor2);
		cl.persist(doctor3);
		cl.getTransaction().commit();
		
		Doctor doctores = cl.find(Doctor.class, 1);
		
		System.out.println("Nombre del doctor: " + doctores.getD_nombre());
		
		Cita citados = cl.find(Cita.class, 1);
		
		System.out.println("Nombre del doctor: " + citados.getC_paciente());
		
		
		
		
		
		System.out.println("Paciente Citado");
	}

}
