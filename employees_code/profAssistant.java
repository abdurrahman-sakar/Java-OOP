package object;

public class profAssistant extends uniAcademician {
    protected String postgraduate;

    public profAssistant(String fullName, String email, int phoneNum, String department, String duty, String lectures, String postgraduate){
        super(fullName, email, phoneNum, department, duty, lectures);    // we must describe each super class
        this.postgraduate = postgraduate;
    }

    public String getPostgraduate() {
        return postgraduate;
    }

    public void setPostgraduate(String postgraduate) {
        this.postgraduate = postgraduate;
    }

    // abstraction
    @Override
    public void onLecture(int time) {
        System.out.println(getFullName() + " in the class for " + getLectures() + " lecture");
    }
}
