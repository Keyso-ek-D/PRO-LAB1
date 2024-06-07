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
public class Intern extends Candidate {
    private String majors;
    private int semester;
    private String universityName;

    public Intern(int candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType, String majors, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Majors: " + majors + ", Semester: " + semester + ", University: " + universityName;
    }
}
