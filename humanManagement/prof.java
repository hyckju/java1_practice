import java.util.ArrayList;

public class prof extends Person{
    private ArrayList<String> lectures;

    public prof(){
        super();
        this.lectures = new ArrayList<>();
    }

        public prof(String id, String name, String status, String birthDate, String contact){
            super(id, name, birthDate, contact, status);
            this.lectures = new ArrayList<>();
        }

        public void addlectures(String lecture){
            lectures.add(lecture);
        }

        public void printInfo(){
            super.printInfo();
            lectureInfo();
        }

        public void lectureInfo(){
            super.printInfo();
            System.out.println("Lectures:");
            if(lectures.isEmpty())
                System.out.println("No Lectures");
            else
                for(String lecture : lectures){
                    System.out.println(lecture);
                }
    }
}
