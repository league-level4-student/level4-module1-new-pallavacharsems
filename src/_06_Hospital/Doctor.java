package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Doctor {
ArrayList <Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		if(patients.size()>=3) {
			throw new DoctorFullException();
		} else {
			patients.add(patient);
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
			
		}
	}
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

}
