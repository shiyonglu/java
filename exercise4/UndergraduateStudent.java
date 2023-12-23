public class UndergraduateStudent extends Student{
      private String major;
      private String status;

       // Constructors
    public UndergraduateStudent() {
        // Default constructor
        super();
    }

    public UndergraduateStudent(String name, int age, double salary, String major, String status) { // constructor
        super(name, age, salary); // Student.Student()

        this.major = major;
        this.status = status;
    }


    public String getMajor(){
        return major;
    }

    public String getStatus(){
       return status; 
    }

    public void setMajor(String major)
    {
        this.major = major;        
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student major: " + major);
        System.out.println("Student staus: " + status);
    }

    public static void main(String[] args) {
        UndergraduateStudent s1 = new UndergraduateStudent();   // first student
        s1.setName("John");
        s1.setAge(12);
        s1.setSalary(123900.00);
        s1.setMajor("CS");
        s1.setStatus("sophomore");
        
        s1.displayInfo();

        // second student
        UndergraduateStudent s2 = new UndergraduateStudent("luke", 32, 120000.0, "PHY", "Junior");
        s2.displayInfo();

    }

    
}
