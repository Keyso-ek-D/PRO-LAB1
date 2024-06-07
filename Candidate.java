/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_07062024;

/**
 *
 * @author DUONG VAN DUNG
 */
public class Candidate {
    private int candidateId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public Candidate(int candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String displayInfo() {
        return "ID: " + candidateId + ", Name: " + firstName + " " + lastName + ", Birth Date: " + birthDate + ", Address: " + address + ", Phone: " + phone + ", Email: " + email + ", Type: " + candidateType;
    }
}
