import java.util.ArrayList;

public class student extends Person {
    private ArrayList<String> course;

    public student(){
//        this.id = "";
//        this.name = "";
//        this.contact = "";
//        this.status = "";
//        this.birthDate = "";
        super();
        this.course = new ArrayList<>();
    }

    public student(String id , String name, String status, String birthDate, String contact){
        super(id,name,birthDate,contact,status);
        this.course = new ArrayList<>();
    }

    public void addCourse(String courses){
        course.add(courses);
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Courses:");
        if(course.isEmpty())
            System.out.println("No courses added");
        else
            for(String course : course){
                System.out.println(course);
            }

    }
}
//    private String id;
//    private String name;
//    private String birthDate;
//    private String contact;
//    private ArrayList <String> courses;
//
//    ///Constructor, class명과 일치
//    public student() {
//        id = "";
//        name = "";
//        birthDate = "";
//        contact = "";
//        courses = new ArrayList<>();
//    }
//    ///Constructor
//    public student(String id, String name, String birthDate, String contact) {
//        this.id = id;
//        this.name = name;
//        this.birthDate = birthDate;
//        this.contact = contact;
//        courses = new ArrayList<>();
//    }
//
//    public void addCourse(String courseName) {
//        this.courses.add(courseName);
//    }
//    ///Method
//    public void setStudent(String id,  String name, String birthDate, String contact) {
//        this.id = id;
//        this.name = name;
//        this.birthDate = birthDate;
//        this.contact = contact;
//
//    }
//    /// Method
//    public void printInfo(){
//        System.out.println("ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Birth Date: " + birthDate);
//        System.out.println("Contact: " + contact);
//        this.printCourses();
//    }
//
//    public void printCourses(){
//        if(courses.isEmpty())
//           System.out.println("없음");
//        else
//           for(String course : courses)
//               System.out.println(course);
//    }
//
//
//}
