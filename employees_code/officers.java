package object;

public class officers extends employee{
    String department, shift;

    public officers(String fullName, String email, int phoneNum, String department, String shift){
        super(fullName, email, phoneNum);     // we must describe super class
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
