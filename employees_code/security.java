package object;

public class security extends officers {
    String document;

    public security(String fullName, String email, int phoneNum, String department, String shift, String document){
        super(fullName, email, phoneNum, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
