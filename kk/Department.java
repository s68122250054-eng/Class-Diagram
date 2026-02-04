public class Department {
    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public void insertDepartment() {
        System.out.println("Insert Department");
    }

    public void updateDepartment() {
        System.out.println("Update Department");
    }

    public void deleteDepartment() {
        System.out.println("Delete Department");
    }
}
