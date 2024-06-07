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
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Candidate> candidates = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enter candidate information");
            System.out.println("1.1 Candidate experience");
            System.out.println("1.2 Fresher candidates");
            System.out.println("1.3 Intern candidates");
            System.out.println("2. Display candidate information");
            System.out.println("3. Search and display candidate information");
            System.out.println("4. Update candidate information");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1.1":
                    enterExperienceCandidate(scanner);
                    break;
                case "1.2":
                    enterFresherCandidate(scanner);
                    break;
                case "1.3":
                    enterInternCandidate(scanner);
                    break;
                case "2":
                    displayCandidates();
                    break;
                case "3":
                    searchCandidate(scanner);
                    break;
                case "4":
                    updateCandidate(scanner);
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void enterExperienceCandidate(Scanner scanner) {
        System.out.print("Enter candidate ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter birth date: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter years of experience: ");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter professional skill: ");
        String proSkill = scanner.nextLine();

        candidates.add(new Experience(id, firstName, lastName, birthDate, address, phone, email, 0, expInYear, proSkill));
    }

    private static void enterFresherCandidate(Scanner scanner) {
        System.out.print("Enter candidate ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter birth date: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter graduation date: ");
        String graduationDate = scanner.nextLine();
        System.out.print("Enter graduation rank: ");
        String graduationRank = scanner.nextLine();
        System.out.print("Enter education: ");
        String education = scanner.nextLine();

        candidates.add(new Fresher(id, firstName, lastName, birthDate, address, phone, email, 1, graduationDate, graduationRank, education));
    }

    private static void enterInternCandidate(Scanner scanner) {
        System.out.print("Enter candidate ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter birth date: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter majors: ");
        String majors = scanner.nextLine();
        System.out.print("Enter semester: ");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter university name: ");
        String universityName = scanner.nextLine();

        candidates.add(new Intern(id, firstName, lastName, birthDate, address, phone, email, 2, majors, semester, universityName));
    }

    private static void displayCandidates() {
        for (Candidate candidate : candidates) {
            System.out.println(candidate.displayInfo());
        }
    }

    private static void searchCandidate(Scanner scanner) {
        System.out.print("Enter candidate ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId() == id) {
                System.out.println(candidate.displayInfo());
                return;
            }
        }
        System.out.println("Candidate not found.");
    }

    private static void updateCandidate(Scanner scanner) {
        System.out.print("Enter candidate ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId() == id) {
                System.out.print("Enter new first name: ");
                candidate.setFirstName(scanner.nextLine());
                System.out.print("Enter new last name: ");
                candidate.setLastName(scanner.nextLine());
                System.out.print("Enter new birth date: ");
                candidate.setBirthDate(scanner.nextLine());
                System.out.print("Enter new address: ");
                candidate.setAddress(scanner.nextLine());
                System.out.print("Enter new phone: ");
                candidate.setPhone(scanner.nextLine());
                System.out.print("Enter new email: ");
                candidate.setEmail(scanner.nextLine());
                System.out.println("Candidate information updated.");
                return;
            }
        }
        System.out.println("Candidate not found.");
    }
}
