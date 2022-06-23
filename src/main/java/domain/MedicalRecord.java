package domain;

import java.util.List;

public class MedicalRecord {
    private Integer id;
    private Patient patient;
    private List<Appointment> history;
    private Doctor currentDoctor;

    public MedicalRecord(Integer id, Patient patient, List<Appointment> history, Doctor currentDoctor){
        this.id = id;
        this.patient = patient;
        this.history = history;
        this.currentDoctor = currentDoctor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Appointment> getHistory() {
        return history;
    }

    public void setHistory(List<Appointment> history) {
        this.history = history;
    }

    public Doctor getCurrentDoctor() {
        return currentDoctor;
    }

    public void setCurrentDoctor(Doctor currentDoctor) {
        this.currentDoctor = currentDoctor;
    }

    
}