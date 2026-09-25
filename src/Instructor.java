import java.lang.classfile.instruction.ReturnInstruction;

public class Instructor extends BSU_Member{
    String department;
    String role;

    Instructor(){
        this.department = "CS";
        this.status = "Faculty";
    }

    // Task: Create a display method that will print the department and status
    public void Faculty (){
        System.out.println("Inside Instructor------Department: " + this.department + "Faculty: " + this.status);
    }
    Instructor(String role){
        this.role = role;
    }

}
