import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String username;
    private String password;
    private String name;
    private Gender gender;
    private String email;
    private RoleUser role;
    private Department department;

    private List<Proposal> proposals = new ArrayList<>();

    public User(int userId, String username, String password, String name,
                Gender gender, String email, RoleUser role, Department department) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.role = role;
        this.department = department;
    }

    public void userLogin() {
        System.out.println("User login");
    }

    public void addProposal(Proposal proposal) {
        proposals.add(proposal);
        System.out.println("Add Proposal");
    }

    public void viewProposal() {
        for (Proposal p : proposals) {
            p.viewProposal();
        }
    }

    public void confirmProposal(Proposal proposal) {
        proposal.changeStatus(StatusProposal.Accepted);
        System.out.println("Confirm Proposal");
    }

    public void viewReports() {
        System.out.println("View Reports");
    }

    public void editReports() {
        System.out.println("Edit Reports");
    }

    public void updateDepartment() {
        System.out.println("Update Department");
    }
}
