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
		int currentDoctor = 0;
		for (int i = 0; i < patients.size(); i++) {
			if(doctors.get(currentDoctor).getPatients().size()>=3) {
				currentDoctor++;
			}
			try {
				doctors.get(currentDoctor).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
