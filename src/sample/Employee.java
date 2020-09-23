package sample;

public class Employee {
    private int empId;
    private String empName;
    private String empDepartment;

    public Employee(int empId, String empName, String empDepartment) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString(){
        return empId + " , " + empName + " , " + empDepartment;
    }
}
