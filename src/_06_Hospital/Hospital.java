package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList<Doctor> doctors = new ArrayList<>();
ArrayList<Patient> patients = new ArrayList<>();
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
	doctors.add(doctor);
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		
		return patients;
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

}
