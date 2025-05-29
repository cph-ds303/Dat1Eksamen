

    public class Main {
    public static void main(String[] args) {


        Employee employee1 = new HourlyEmployee("Tumi", 50, 226);
        Employee employee2 = new CommissionEmployee("Aoife", 200, 1000, 0.5);
        Employee employee3 = new MonthlyEmployee("Dino", 30000);

        Employee[] employees = {employee1, employee2, employee3};

        for(Employee i : employees)
            System.out.println(i.getEmployeeName() + " " + i.calculateSalary());

        }
    }
