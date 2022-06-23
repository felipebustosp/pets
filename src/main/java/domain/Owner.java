package domain;

import java.util.List;

public class Owner extends User{

     private List<Patient> patients;

     public Owner(User personalInfo, 
                 List<Patient> listPatients
                ){
        super(personalInfo.getExternalId(),
              personalInfo.getFirstName(),
              personalInfo.getLastName(),
              personalInfo.getAddresses(),
              personalInfo.getPhoneNumbers(),
              personalInfo.getEmails());
        this.patients = listPatients;
     }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

     

}
