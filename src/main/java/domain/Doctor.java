package domain;

import java.util.Date;

public class Doctor extends User{

    private String speciality;
    private Date startDate;
    
    public Doctor (User personalInfo, String speciality, Date startDate){
        super(personalInfo.getExternalId(),
        personalInfo.getFirstName(),
        personalInfo.getLastName(),
        personalInfo.getAddresses(),
        personalInfo.getPhoneNumbers(),
        personalInfo.getEmails());

        this.speciality = speciality;
        this.startDate = startDate;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
}
