package object;

public class employee {
    protected String fullName, email;
    protected int phoneNum;

    public employee(String fullName, String email, int phoneNum){
        this.fullName = fullName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public void entry(){
        System.out.println(this.fullName + " is enter");  // same method in uniAcademician that the method override to here
    }

    // getter and setter methods
    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }

    public static void listEmp(employee[] enter){
        for (employee e : enter){
            e.entry();
        }
    }

}
