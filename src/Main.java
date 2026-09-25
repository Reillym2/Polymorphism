

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.display_course_information();

        COSC113 section1 = new COSC113();
        section1.display_course_information();

        //Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();
        // The relationship is: IS-A Relationship between course and COSC113

        cosc214.display_course_information();
        section2.display_course_information();

        // Student object
        Student arturo = new Student();
        Course math141 = new Course();
        Course frac = new Course();
        Course cosc107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;
        //Lab work populate index 1-4 with the other course references

        BSU_Member[] members = new BSU_Member[10];

        BSU_Member b1, b2;
        // Creating an object of student type and storing the reference in a BSU-Member type variable
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;

        System.out.println("===========================================");

            members[2] = new Instructor();
            members[3] = new Student();
            members[4] = new BSU_Member();
            members[5] = new Instructor();
            members[6] = new Student();
            members[7] = new BSU_Member();
            members[8] = new Instructor();
            members[9] = new Student();

        System.out.println("===========================================");

        for (int j = 0; j < 10; j++) {
            members[j].display_information();
        }
        Instructor i1 = new Instructor("Math Professor");
        System.out.println(i1.role);

        Student s1 = new Student("Sophomore");
        System.out.println(s1.classification);
    }
}
