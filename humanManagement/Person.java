public class Person {
    protected String id;
    protected String name;
    protected String birthDate;
    protected String contact;
    protected String status;

    public Person(){
        id = "";
        name = "";
        birthDate = "";
        contact = "";
        status = "";
    }

    public Person(String id, String name, String birthDate, String contact, String status) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.contact = contact;
        this.status = status;
    }

    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Contact: " + contact);
        System.out.println("Status: " + status);
    }


}
