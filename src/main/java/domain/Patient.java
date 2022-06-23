package domain;

import java.util.Date;

public class Patient {

    private String id;
    private String name;
    private Date birthDate;
    private Integer age;
    private Owner owner;
    private Species species;


    public Patient(String id, String name, Date birthDate, Integer age, Owner owner, Species species) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.owner = owner;
        this.species = species;
    }
    public Patient(String id, String name, Date birthDate, Owner owner, Species species) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.owner = owner;
        this.species = species;
    }
    public Patient(String id, String name, Integer age, Owner owner, Species species) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.species = species;
    }


    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public Integer getAge() {
        return age;
    }
    public Owner getOwner() {
        return owner;
    }
    public Species getSpecies() {
        return species;
    }


}