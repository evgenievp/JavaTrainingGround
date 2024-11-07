package JavaOOP.EmployeeAnother;

public class SalariedEmployee extends EmployeeAnother{

    private double annaulSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate, employeeId, hireDate);
    }


    public void retire() {
        if (!isRetired) {
            isRetired = true;
        }
    }


}
