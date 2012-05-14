package org.yarlithub.yschool.mayooranjsf.model;

import java.util.Date;

/**
 *
 * @author GuruMayoo
 */
public class Student {
    
    private String admissionno;
    private String firstname;
    private String lastname;
    private String address;
    private Date dateOfBirth;
    private int grade;

    public Student() {
    }

    public Student(String admissionno, String firstname, String lastname, String address, Date dateOfBirth, int grade) {
        this.admissionno = admissionno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}
