package object;
// Abstraction
public abstract class uniAcademician extends employee{
    String department, duty;
    String lectures;
    // constructor
    public uniAcademician(String fullName, String email, int phoneNum, String department, String duty, String lectures ){
        super(fullName, email, phoneNum);     // we must describe super class
        this.department = department;
        this.duty = duty;
        this.lectures = lectures;
    }
    public void comeUniversity(){
        System.out.println("Professors and their assistant in University!");
    }

    public void entry(){
        System.out.println(this.fullName + " is enter from C block"); //overriding employee
    }

    public abstract void onLecture(int time);

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getLectures() {
        return lectures;
    }

    public void setLectures(String lectures) {
        this.lectures = lectures;
    }
}
