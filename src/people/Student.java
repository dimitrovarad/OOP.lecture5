package people;

public class Student extends Person{

    private String school;

    //constructor for Student
    public Student (String name, String school){
        super(name);
        this.setSchool(school);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String value) {
        this.school = value;
    }

}
