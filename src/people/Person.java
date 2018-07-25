package people;

public class Person {
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name){ //this is the main constructor
        this(name, 0);
    }

    public Person(String name, int age) { //constructor
        this.setName(name);
        this.setAge(age);
    }

    public String getName() { //getter for name
        return this.name;
    }

    public void setName(String value) { //setter for name
        if (value == null) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (value.length()==0){
            throw new IllegalArgumentException("Name must be longer than 2");
        }
        this.name = value;

    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Age can not be negative");
        }
        this.age = value;
    }
}
