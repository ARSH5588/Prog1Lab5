/**
*@author Arshjit Sansoe
*@since May 3rd, 2020
*@return tv1 equals tv2
*/
public class School {
  public static void main(String[] args) {
    //2 courses
    Grades course1 = new Grades("Math", 'B');
    Grades course2 = new Grades("English", 'A');

    System.out.println(course1.getCourseName() + " " + course1.getGradeLetter());
    System.out.println(course2.getCourseName() + " " + course2.getGradeLetter());

    System.out.println(course1.toString() + " " + course2.toString());
    System.out.println(course1.equals(course2));

  }
}
//Client class named Grades
class Grades {

  char gradeLetter;
  String courseName;
  //Constructor
  public Grades(String c, char l) {
    courseName = c;
    gradeLetter = l;
  }
  public void setCourseName(String c) {
    courseName = c;
  }
  public String getCourseName() {
    return courseName;
  }
  public void setGradeLetter(char l) {
    gradeLetter = l;
  }
  public char getGradeLetter() {
    return gradeLetter;
  }
}

/*Write a class encapsulating the concept of a course grade,
assuming a course grade has the following attributes: a course
name and a letter grade. Include a constructor, the accessors and
mutators, and methods toString and equals. Write a client class to
test all the methods in your class.*/
