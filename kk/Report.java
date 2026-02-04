import java.util.Date;

public class Report {
    private int reportCode;
    private Date reportDate;

    public Report(int reportCode) {
        this.reportCode = reportCode;
        this.reportDate = new Date();
    }

    public void viewReports() {
        System.out.println("View Report");
    }

    public void createReports() {
        System.out.println("Create Report");
    }
}
