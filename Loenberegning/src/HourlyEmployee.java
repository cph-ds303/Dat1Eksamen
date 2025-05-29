
    public class HourlyEmployee extends Employee {

    private double numberOfHours;
    private double payPrHour;

    public HourlyEmployee (String employeeName, double numberOfHours, double payPrHour){

        super(employeeName);
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }

    @Override
        public double calculateSalary(){
        return numberOfHours * payPrHour;
        }

    }
