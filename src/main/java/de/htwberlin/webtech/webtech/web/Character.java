package de.htwberlin.webtech.webtech.web;

public class Character {

    private Long id;
    private String name;
    private int age;
    private String gender;
    private String species;
    private String significantSkill;
    private String weakness;



    public Character( Long id, String name, int age, String gender, String species,String significantSkill, String weakness ) {
       this.id= id;
       this.name = name;
       this.age=age;
       this.gender =gender;
       this.species = species;
       this.significantSkill = significantSkill;
       this.weakness = weakness;



    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSignificantSkill() {
        return significantSkill;
    }

    public void setSignificantSkill(String significantSkill) {
        this.significantSkill = significantSkill;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
}
