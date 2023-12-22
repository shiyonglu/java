 /* 
  *   - git clone https://github.com/libgit2/libgit2    // copy a remote repo as a local one
  *   - git clone https://github.com/libgit2/libgit2 newdir // if a newdir needs to be used 
  *   - git init         // create an empty local repo in .git directory
  *   - git add *.java   // add all current .java files to the local branch
  *   - git commit -m 'Initial project version'     // commit one version
  *   - git remote add origin https://github.com/example/repo.git, // reference the remote repo as `origin`
  *   - git branch -M main                                         // reference the local branch as `main`
  *   - git push -u origin main // push the local branch named "main" to the remote repository named "origin" and set up tracking between the local and remote branches.
 */
 
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
