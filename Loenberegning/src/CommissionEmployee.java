public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double salesAmount;
    private double commissionPercentage;

    public CommissionEmployee(String employeeName, double baseSalary, double salesAmount, double commissionPercentage){

        super(employeeName);
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commissionPercentage;
    }


    @Override
    public double calculateSalary(){
        return baseSalary + salesAmount * commissionPercentage;
    }

    public double getBaseSalary (){

        return baseSalary;
    }

    public double getSalesAmount () {

        return salesAmount;
    }

    public double getCommissionPercentage(){

        return commissionPercentage;
    }


    public void setBaseSalary (double baseSalary){

        this.baseSalary = baseSalary;
    }

    public void setSalesAmount (double salesAmount) {

        this.salesAmount = salesAmount;
    }

    public void setCommissionPercentage (double commissionPercentage){

        this.commissionPercentage = commissionPercentage;
    }





}
