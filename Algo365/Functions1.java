package Algo365;
import java.util.*;
public class Functions1 {
  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Grade(1-12) And Subject To get the topper");
   var studentName = getTopperNameForSubject(12, "Science");
   System.out.println(studentName);
   printStudentDetails(1);
  }
  public static String getTopperNameForSubject(int grade,String subject)
  {
    String name = "Chandana";
    return name;
  }
  static void printStudentDetails(int StudentId){
    String name = "Chandana";
    int age = 19;
    int grade = 12;
    double CGPA = 9.2;
    boolean isRegularToSchool = true;
    System.out.println(name);
    System.out.println(age);
    System.out.println(grade);
    System.out.println(CGPA);
    System.out.println(isRegularToSchool);
  }
}
