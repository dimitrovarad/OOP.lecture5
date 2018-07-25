package people;

public class Startup {
    public static void main (String[] args) {
        //Student radina = new Student("Radina", "Progress");
        Employee radina = new Employee("Radina", 29, "TechHuddle", 800.00);


        //System.out.println(radina.getSchool());  в случай, че екзекютваш school
        System.out.println(radina.getName());
        System.out.println(radina.getAge());
        System.out.println(radina.getSalary());
    }
}
