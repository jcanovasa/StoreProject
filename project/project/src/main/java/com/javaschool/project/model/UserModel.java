package com.javaschool.project.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class UserModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false) 
    private Long id;


    private String name; 
    private String surname;
    private int dbirth;
    private int mbirth;
    private int ybirth;
    private String pwd;


    //Getters y Setters
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void getDayBirth(int dbirth) {
        this.dbirth = dbirth;
    }

    public int setDayBirth() {
        return dbirth;
    }

    public void getMonthBirth(int mbirth) {
        this.mbirth = mbirth;
    }

    public int setMonthBirth() {
        return mbirth;
    }

    public void getYearBirth(int ybirth) {
        this.ybirth = ybirth;
    }

    public int setYearBirth() {
        return ybirth;
    }

    public void getPassword(String pwd) {
        this.pwd = pwd;
    }

    public String setPassword() {
        return pwd;
    }

}

