package Notes.JavaDoc;

/**
 * Created by jhudeska on Oct, 2020
 * Create student class from person
 */
public class Student extends Person {
    /**
     * age of a student
     */
    private int age;

    /**
     * Create object student
     * @param name student name
     * @param age student age
     */
    public Student(String name, int age) {
        super(name); // call parent constructor
        this.age = age;
    }
}
