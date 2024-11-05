public class SalariedEmployee extends EmployeeAnother{

    private double annaulSalary;
    private boolean isRetired;


    public void retire() {
        if (!isRetired) {
            isRetired = true;
        }
    }


}
