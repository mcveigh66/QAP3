package Question1;
public class CollegeStudent extends Student {
    private int myYear;       
    private String myMajor;  

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
    
        super(name, age, gender, idNum, gpa);
        // Initialize CollegeStudent specific fields
        myYear = year;
        myMajor = major;
    }

    // Getters and Setters
    public int getYear() { return myYear; }
    public void setYear(int year) { this.myYear = year; }

    public String getMajor() { return myMajor; }
    public void setMajor(String major) { this.myMajor = major; }

    @Override
    public String toString() {
        // Use super reference to do things already done by superclass
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
