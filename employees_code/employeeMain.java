package object;
// Inheritance, Encapsulation, Polymorphism, Overriding
public class employeeMain {

    public static void main(String[] args){

        // uniAcademician ua1 = new uniAcademician();
         // ua1.entry();    //* we can access in the employee classes method "entry".

         professor p1 = new professor(" Eric ", " eric@mail.com ", 7821546, "Math", "Education", "Numerical Methods", "Prof");
          // we can access to each superclass
          p1.comeUniversity();    // from uniAcademician
          p1.entry();             // from employee BUT overriding in uniAcademician
         System.out.println("Name: " + p1.fullName + " email: " + p1.email + " Department: " + p1.department + " Lecture: " + p1.lectures);

         //* we can not use uniAcademician object because of abstraction
     //  uniAcademician ua1 = new uniAcademician(" John Devi "," john@email.com ",45612345," Computer Science ", "Coder","Algorithm");
     //  System.out.println(ua1.email + ua1.department); //* simple override example also

     employee emp1 = new officers(" Henry "," henry@mail.com ", 16987455, " Call Center ", " 08.00-18.00");
     System.out.println(emp1.fullName + emp1.phoneNum); // example of polymorphism
     emp1.entry();

     employee emp2 = new profAssistant("Frank", "frnk@email.com", 44156982, "Computer Science", "Data", "Data Structure", "YES");
     emp2.entry();

     employee[] emplist = {p1, emp1, emp2};
     employee.listEmp(emplist);

     p1.onLecture(8); // abstraction example
    }
}

