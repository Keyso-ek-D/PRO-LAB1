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
public class Fresher extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(int candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType, String graduationDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Graduation Date: " + graduationDate + ", Graduation Rank: " + graduationRank + ", Education: " + education;
    }
}
