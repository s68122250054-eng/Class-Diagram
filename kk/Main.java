import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department dept = new Department(1, "IT Department");

        User user = new User(
                1,
                "admin",
                "1234",
                "Somchai",
                Gender.Male,
                "admin@email.com",
                RoleUser.Manager,
                dept
        );

        Applicant applicant = new Applicant(
                1,
                "Anan",
                "Engineer",
                "Bangkok",
                Gender.Male,
                "0812345678"
        );

        Proposal proposal = new Proposal(
                "P001",
                "Project Management System",
                "Create a system for managing proposals",
                new Date(),
                applicant
        );

        user.addProposal(proposal);
        user.viewProposal();
        user.confirmProposal(proposal);
        proposal.viewStatus();
    }
}
