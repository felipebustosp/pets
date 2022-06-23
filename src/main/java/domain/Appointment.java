package domain;

import java.util.Date;

public class Appointment {

    private Doctor currentDoctor;
    private Owner currentOwner;
    private Patient patient;
    private Date appointmentDate;
    private String description;
    
    public Appointment(Doctor currentDoctor, Owner currentOwner, Patient patient, Date appointmentDate,
            String description) {
        this.currentDoctor = currentDoctor;
        this.currentOwner = currentOwner;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    public Doctor getCurrentDoctor() {
        return currentDoctor;
    }

    public void setCurrentDoctor(Doctor currentDoctor) {
        this.currentDoctor = currentDoctor;
    }

    public Owner getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Owner currentOwner) {
        this.currentOwner = currentOwner;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    


}
