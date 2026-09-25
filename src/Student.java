public class Student extends BSU_Member{
    double gpa;
    String classification;
    Course [] enrolled_courses;

    Student(){
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    public Course[] get_enrolled_courses(){
       return this.enrolled_courses;
    }

    @Override
    public void display_information(){
        System.out.println("Inside student-----Status: " +status);
    }
    Student (String classification){
        this.classification = classification;
    }
}
