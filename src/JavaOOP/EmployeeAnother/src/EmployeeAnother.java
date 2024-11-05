public class EmployeeAnother extends Worker {

    public long employeeId;
    public String hireDate;
    private static int employeeNo = 1;

    public EmployeeAnother(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = EmployeeAnother.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
