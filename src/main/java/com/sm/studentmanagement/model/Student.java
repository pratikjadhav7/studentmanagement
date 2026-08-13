package com.sm.studentmanagement.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
    private String frn;
    private String name;
    private String batchName;
    private String address;
    private LocalDate dob;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String frn, String name, String batchName, String address, LocalDate dob) {
        this.frn = frn;
        this.name = name;
        this.batchName = batchName;
        this.address = address;
        this.dob = dob;
    }

    // Getters and Setters

    public String getFrn() {
        return frn;
    }

    public void setFrn(String frn) {
        this.frn = frn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // toString()

    @Override
    public String toString() {
        return "Student{" +
                "frn='" + frn + '\'' +
                ", name='" + name + '\'' +
                ", batchName='" + batchName + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                '}';
    }
}