package object;

public class professor extends uniAcademician {
    String degreeOfDr;

    public professor(String fullName, String email, int phoneNum, String department, String duty, String lectures, String degreeOfDr){
        super(fullName, email, phoneNum, department, duty, lectures);    // we must describe each super class
        this.degreeOfDr = degreeOfDr;
    }

    public String getDegreeOfDr() {
        return degreeOfDr;
    }

    public void setDegreeOfDr(String degreeOfDr) {
        this.degreeOfDr = degreeOfDr;
    }

    // abstraction
    @Override
    public void onLecture(int time) {
        System.out.println(getDegreeOfDr() + getFullName() + " in the class for " + getLectures() + " lecture");
    }
}
