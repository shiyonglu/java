 import java.util.HashMap;
      

public class Roster {
    public static void main(String[] args) {
        HashMap<Integer, Student> myroster = new HashMap<Integer, Student>();

        Student s1 = new Student();   // first student
        s1.setName("John");
        s1.setAge(12);
        s1.setSalary(123900.00);
        
        myroster.put(1, s1);

        // second student
        Student s2 = new Student("luke", 32, 120000.00);
        s2.displayInfo();

        myroster.put(2, s2);

        System.out.println(myroster);

    }
    
}
