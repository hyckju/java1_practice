public class Main {
    public static void main(String[] args) {
        prof prof1 = new prof();
        prof prof2 = new prof("2022011981", "양혁주", "재학", "030125", "010-1234-1234");

        prof2.addlectures("Java");
        prof2.addlectures("Python");

        System.out.println("교수1의 정보");
        prof1.printInfo();

        System.out.println("교수2의 정보");
        prof2.printInfo();
    }
}











//        student student1 = new student();
//        student student2 = new student("2022011981", "양혁주", "재학", "030125", "010-1234-1234");
//
//        student2.addCourse("Java");
//        student2.addCourse("Python");
//
//        System.out.println("학생1의 정보");
//        student1.printInfo();
//
//        System.out.println("학생2의 정보");
//        student2.printInfo();
//    }
//    }
