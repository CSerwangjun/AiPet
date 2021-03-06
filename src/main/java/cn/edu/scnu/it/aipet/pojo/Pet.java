package cn.edu.scnu.it.aipet.pojo;

import org.springframework.stereotype.Component;


public class Pet {
    private Long idpet=null;
    private String petspecies=null;
    private String name=null;
    private String sex=null;
    private int age_year=0;
    private int age_month=0;
    private Long weight=null;
    private String petdescri=null;
    private String petphotourl=null;

    public Long getIdpet() {
        return idpet;
    }

    public void setIdpet(Long idpet) {
        this.idpet = idpet;
    }

    public String getPetspecies() {
        return petspecies;
    }

    public void setPetspecies(String petspecies) {
        this.petspecies = petspecies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge_year() {
        return age_year;
    }

    public void setAge_year(int age_year) {
        this.age_year = age_year;
    }

    public int getAge_month() {
        return age_month;
    }

    public void setAge_month(int age_month) {
        this.age_month = age_month;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getPetdescri() {
        return petdescri;
    }

    public void setPetdescri(String petdescri) {
        this.petdescri = petdescri;
    }

    public String getPetphotourl() {
        return petphotourl;
    }

    public void setPetphotourl(String petphotourl) {
        this.petphotourl = petphotourl;
    }
}
