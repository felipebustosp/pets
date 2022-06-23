package domain;

import java.util.List;

public class User {
    private Integer id;
    private String externalId;
    private String firstName;
    private String lastName;
    private List<String> addresses;
    private List<String> phoneNumbers;

    public User(String externalId, 
                 String firstName,
                 String lastName,
                 List<String> addresses,
                 List<String> phoneNumbers,
                 List<String> emails){
                    this.externalId = externalId;
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.addresses = addresses;
                    this.phoneNumbers = phoneNumbers;
                    this.emails = emails;
                 }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<String> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public List<String> getEmails() {
        return emails;
    }
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
    private List<String> emails;

}
