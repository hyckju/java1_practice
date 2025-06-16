import java.util.ArrayList;

public class Main {
    final static int studentNum = 3;
    //0: id 1: name 2: status 3: birth 4: contact
    static String[][] students = new String[studentNum][5];
    static ArrayList<String>[] courseList = new ArrayList[studentNum];

    public static void main(String[] args) {
        for (int i = 0; i < studentNum; i++)
            courseList[i] = new ArrayList<>();

        setStudent(0, "2022011981", "양혁주", "재학", "2003-01-19", "010-1234-5678");
        setStudent(2, "2022011901", "홀길동", "재학", "1890-04-19", "010-1234-5678");
        setStudent(3, "2022011231", "강감찬", "휴학", "2201-01-19", "010-1234-5678");






        addCourse(0, "자료구조");
        addCourse(0, "운영체제");

        addCourse(1, "자바");
        addCourse(1, "데이터");

        addCourse(2, "네트워크");
        addCourse(2, "자료구조");
        removeCourse(2, "자료구조");


        printAllStudents();


    }

    public static void setStudent(int index, String id, String name, String status, String birth, String contact){
        students[index][0] = id;
        students[index][1] = name;
        students[index][2] = status;
        students[index][3] = birth;
        students[index][4] = contact;
    }


    public static void printAllStudents(){
        for (int i = 0; i < students.length; i++) {
            printStudentInfo(i);
            System.out.println();
        }
    }

    public static void addCourse(int index, String courseName) {
        courseList[index].add(courseName);
    }

    public static void removeCourse(int index, String courseName) {
        courseList[index].remove(courseName);
    }

    public static int getcourseNum(int index){
        return courseList[index].size();
    }

    public static void printStudentInfo(int index){
        System.out.println("--- 학생" + (index+1) + "정보 ---");
        System.out.println(students[index][0]);
        System.out.println(students[index][1]);
        System.out.println(students[index][2]);
        System.out.println(students[index][3]);
        System.out.println(students[index][4]);

        int courseNum = getcourseNum(index);

        System.out.println("--- 수강 교과목 : " + courseNum + "개 ---");
        if(courseList[index].isEmpty())
            System.out.println("수강 교과목이 없습니다.");
        else
            for(String course : courseList[index])
                System.out.println(course);

        System.out.println(" ");
    }










//        for (int i = 0; i < studentNum; i++) {
//            System.out.println("--- 학생" + (i+1) + "정보 ---");
//            System.out.println(students[i][0] + " " + students[i][1] + " " + students[i][2] + " " + students[i][3] + " " + students[i][4]);
//            for (int j = 0; j < courseList[i].size(); j++) {
//                System.out.println(courseList[i].get(j));
//            }
//            System.out.println(" ");
//        }




//        student[0] = "2022011981";
//        student[1] = "양혁주";
//        student[2] = "재학";
//        student[3] = "2003-01-19";
//        student[4] = "010-1234-5678";
//
//        enrolledCourse.add("자료구조");
//        enrolledCourse.add("운영체제");
//        enrolledCourse.add("네트워크");
//        enrolledCourse.add("자바");
//
//        enrolledCourse.remove("운영채재");
//
//        System.out.println(student[0]);
//        System.out.println(student[1]);
//        System.out.println(student[2]);
//        System.out.println(student[3]);
//        System.out.println(student[4]);
//
//        System.out.println("--- 수강 교과목 목록 ---");
//        if(enrolledCourse.isEmpty())
//            System.out.println("수강 교과목이 없습니다.");
//        else
//            for (int i = 0; i < enrolledCourse.size(); i++) {
//                System.out.println(enrolledCourse.get(i));
//        }
}
