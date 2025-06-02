import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlyEmployee("Tumi", 50, 226));
        employees.add(new CommissionEmployee("Aoife", 200, 1000, 0.5));
        employees.add(new MonthlyEmployee("Dino", 30000));

        for(Employee i : employees)
            System.out.println(i.getEmployeeName() + " " + i.calculateSalary());

        }
    }
