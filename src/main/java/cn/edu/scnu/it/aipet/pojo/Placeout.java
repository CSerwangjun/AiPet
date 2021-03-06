package cn.edu.scnu.it.aipet.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Placeout {
    private Long idplaceout = null;
    private Long iduser = null;
    private Long idpet;
    private String placeouttitle = null;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datetime = null;
    private String adoptres = null;
    private String realname = null;
    private String sex = null;
    private String number = null;
    private String address = null;
    private Pet pet = null;

    public Long getIdplaceout() {
        return idplaceout;
    }

    public void setIdplaceout(Long idplaceout) {
        this.idplaceout = idplaceout;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public Long getIdpet() {
        return idpet;
    }

    public void setIdpet(Long idpet) {
        this.idpet = idpet;
    }

    public String getPlaceouttitle() {
        return placeouttitle;
    }

    public void setPlaceouttitle(String placeouttitle) {
        this.placeouttitle = placeouttitle;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getAdoptres() {
        return adoptres;
    }

    public void setAdoptres(String adoptreq) {
        this.adoptres = adoptreq;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
