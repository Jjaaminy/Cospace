package com.example.cospace.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Mitglied {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String mail;
    private String password;
    Buchung buchung;

    public Mitglied(Long id, String firstname, String lastname, String mail, String password, Buchung buchung) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;
        this.buchung = buchung;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Buchung getBuchung() {
        return buchung;
    }

    public void setBuchung(Buchung buchung) {
        this.buchung = buchung;
    }
}
