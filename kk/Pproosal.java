import java.util.Date;

public class Pproosal {
    private String proposalCode;
    private String proposalTitle;
    private String proposalText;
    private Date proposalDate;
    private StatusProposal proposalStatus;
    private Applicant applicant;

    public Proposal(String proposalCode, String proposalTitle, String proposalText,
                    Date proposalDate, Applicant applicant) {
        this.proposalCode = proposalCode;
        this.proposalTitle = proposalTitle;
        this.proposalText = proposalText;
        this.proposalDate = proposalDate;
        this.proposalStatus = StatusProposal.Waiting;
        this.applicant = applicant;
    }

    public void viewProposal() {
        System.out.println("View Proposal: " + proposalTitle);
    }

    public void viewStatus() {
        System.out.println("Status: " + proposalStatus);
    }

    public void updateProposal() {
        System.out.println("Update Proposal");
    }

    public void deleteProposal() {
        System.out.println("Delete Proposal");
    }

    public void archiveProposal() {
        System.out.println("Archive Proposal");
    }

    public void viewApplicant() {
        System.out.println("Applicant: " + applicant);
    }

    public void changeStatus(StatusProposal status) {
        this.proposalStatus = status;
    }
}
