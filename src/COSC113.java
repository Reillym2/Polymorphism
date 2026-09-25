// Parent/Super/Base class: Course
//Child/Sub/Derived class: COSC113
public class COSC113 extends Course{
    // Public, Default, Protected attributes are inherited
    // Not inherited
    String syllabus;
    String coding_language;
    Instructor i1;
    Student[] students;

    COSC113(){
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number = 113;
        this.credit = 4;
        this.name = "COSC113";
    }

    // Parent class Constructors are not inherited, but can be invoked/called
    COSC113(int course_number, int credit, String name){
        // Super will invoke the parent classes default constructor - course()
       // super();

        super(course_number, credit, name);
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
    }

    // Setters and getters -Lab Work for all the attributes


    // Method Overriding: Defining a method with the same method signature from the parent class
    @Override
    public void  display_course_information(){
        //Lab Work - Use super.ATTRIBUTE_NAME in a print statement

        System.out.println(super.name);
        System.out.println(super.course_number);

        System.out.println("Syllabus: "+ this.syllabus + " Language: " +this.coding_language +
                "Instructor: " + this.i1 + "Students: "+ this.students);
    }

    // Methods: Public, Default, Protected methods are inherited
    public String getSyllabus(){
        return this.syllabus;
    }
    public void setSyllabus(String syllabus){
        this.syllabus = syllabus;
    }

    public String getCoding_language(){
        return this.coding_language;
    }
    public void setCoding_language(String coding_language){
        this.coding_language = coding_language;
    }
    public Instructor getI1(){
        return this.i1;
    }
    public void setI1(Instructor i1){
        this.i1 = i1;
    }
    public Student[] getStudents(){
        return this.students;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }

    // Package: Java files under same folder are considered to be in a same package
}
