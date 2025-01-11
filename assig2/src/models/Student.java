
package models;

public class Student extends Person {

    private static final double STIPEND = 36660.0;

    private double gpa;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {

        if (gpa > 2.67) {
            return STIPEND;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
