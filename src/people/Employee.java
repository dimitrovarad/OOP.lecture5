package people;


public class Employee extends Person {

    private String company;
    private double salary;

    //Constructor for Employee
    public Employee(String name, int age, String company) {
        this(name, age, company, 800.00);
    }

    public Employee(String name, int age, String company, double salary) {
        super(name, age);
        this.setCompany(company);
        this.setSalary(salary);

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String value) {
        this.company = value;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double value) {
        this.salary = value;
    }
}
