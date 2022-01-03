package Lab2;

public class Lab2 {
    public static void main(String[] args) {
        Student stud1 = new Student("John", "125632569");

        stud1.setUserId();
        stud1.setPhone("15698654236");
        stud1.setCity("New York");
        stud1.setState("NY");
        stud1.setEmail();

        System.out.println(stud1.toString());

        stud1.enroll("English", 50.10);
        stud1.enroll("Maths", 100);
        stud1.enroll("History of Culture", 45.55);
        stud1.showCourses();
        stud1.checkBalance();

        stud1.pay(150.50);
        stud1.checkBalance();


        System.out.println("**********************");
        Student stud2 = new Student("Jane", "335632358");

        stud2.setUserId();
        stud2.setPhone("98698654236");
        stud2.setCity("New York");
        stud2.setState("NY");
        stud2.setEmail();
        System.out.println(stud2.toString());

        stud2.enroll("English", 50.10);
        stud2.enroll("Maths", 100);
        stud2.showCourses();
        stud2.checkBalance();

        stud2.pay(50);
        stud2.checkBalance();

        System.out.println("**********************");
        Student stud3 = new Student("Jack", "859685632");

        stud3.setUserId();
        stud3.setPhone("00698654285");
        stud3.setCity("New York");
        stud3.setState("NY");
        stud3.setEmail();

        System.out.println(stud3.toString());
        stud3.enroll("Maths", 100);
        stud3.showCourses();
        stud3.checkBalance();

        stud3.pay(100);
        stud3.checkBalance();

    }
}

class Student {
    private static int iD = 1000;
    private String name;
    private String SSN;
    private String email; //email ID based on the name
    private String userId; // combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
    private String phone;
    private String city;
    private String state;
    private double balance;
    private String course;


    //Constructors

    public Student(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        iD++;
    }

    public void setUserId() {
        int random = (int) (Math.random() * 9000);
        if (random < 1000) {
            random = random + 1000;
        }
        userId = "" + iD + random + SSN.substring(5);
    }

    public void setEmail() {
        email = name + iD + "@student.com";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


//Define methods

    public void enroll(String course, double amount) {
        if (this.course == null) {
            this.course = course;
        } else {
            this.course = this.course + "; " + course;
        }
        balance = balance + amount;

    }

    public void pay(double amount) {
        balance = balance - amount;
        System.out.println("[Payment: $" + amount + "]");
    }

    public void checkBalance() {
        System.out.println("[Balance: $" + balance + "]");
    }

    @Override
    public String toString() {
        return "[Student Name: " + name + "]\n[SSN: " + SSN + "]\n[UserId: " + userId + "]\n[email: " + email + " ]\n[Phone: " + phone + "]\n[City: " + city + " ]\n[State: " + state + "]";
    }

    public void showCourses() {
        System.out.println("[Enrolled to courses: " + this.course + "]");

    }

}
