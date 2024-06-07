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
public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience(int candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Years of Experience: " + expInYear + ", Professional Skill: " + proSkill;
    }
}
