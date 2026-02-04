public class Applicant {
    private int applicantId;
    private String applicantName;
    private String applicantJob;
    private String applicantAddress;
    private Gender applicantGender;
    private String applicantTel;

    public Applicant(int applicantId, String applicantName, String applicantJob,
                     String applicantAddress, Gender applicantGender, String applicantTel) {
        this.applicantId = applicantId;
        this.applicantName = applicantName;
        this.applicantJob = applicantJob;
        this.applicantAddress = applicantAddress;
        this.applicantGender = applicantGender;
        this.applicantTel = applicantTel;
    }

    public void insertApplicant() {
        System.out.println("Insert Applicant");
    }

    public void updateApplicant() {
        System.out.println("Update Applicant");
    }

    public void deleteApplicant() {
        System.out.println("Delete Applicant");
    }
}
