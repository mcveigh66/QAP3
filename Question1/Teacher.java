package Question1;
public class Teacher extends Person {
    private String mySubject;  // Subject taught
    private double mySalary;   // Annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
       
        super(name, age, gender);
        // Initialize Teacher specific fields
        mySubject = subject;
        mySalary = salary;
    }

    // Getters and Setters
    public String getSubject() { return mySubject; }
    public void setSubject(String subject) { this.mySubject = subject; }

    public double getSalary() { return mySalary; }
    public void setSalary(double salary) { this.mySalary = salary; }

    @Override
    public String toString() {
      // Super reference to do things done by my super class.
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}
