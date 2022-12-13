package object;

public class it extends officers {
    String dutyIt;

    public it(String fullName, String email, int phoneNum, String department, String shift, String dutyIt){
        super(fullName, email, phoneNum, department, shift);
        this.dutyIt = dutyIt;
    }

    public String getDutyIt() {
        return dutyIt;
    }

    public void setDutyIt(String dutyIt) {
        this.dutyIt = dutyIt;
    }
}
