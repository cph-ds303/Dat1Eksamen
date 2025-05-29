

public abstract class  Employee {

    private String employeeName;

    public Employee (String employeeName){

        this.employeeName = employeeName;
    }


    public String getEmployeeName () {

        return employeeName;

    }

    public void setEmployeeName (String employeeName){}

    public abstract double calculateSalary();

}
