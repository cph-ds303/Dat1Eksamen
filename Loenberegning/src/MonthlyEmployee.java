    public class MonthlyEmployee extends Employee{

    private double salary;


        public MonthlyEmployee (String employeeName, double salary) {

            super(employeeName);
            this.salary = salary;

        }

    @Override
    public double calculateSalary(){
        return salary;
    }




}
