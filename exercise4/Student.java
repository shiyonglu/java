public class Student {

    // Attributes
    private String name;
    private int age;
    private double salary;

    // Constructors
    public Student() {
        // Default constructor
    }

    public Student(String name, int age, double salary) { // constructor
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Other methods
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Salary: $" + salary);
    }

    public static void main(String[] args) {
        Student s1 = new Student();   // first student
        s1.setName("John");
        s1.setAge(12);
        s1.setSalary(123900.00);
        
        s1.displayInfo();

        // second student
        Student s2 = new Student("luke", 32, 120000.00);
        s2.displayInfo();


    }
}
