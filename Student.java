/**
*@author Arshjit Sansoe
*@since May 3rd, 2020
*@return tv1 equals tv2
*/
public class Student {
  public static void main(String[] args) {
    //2 students
    Grade student1 = new Grade("Joe", 12345, 36.5);
    Grade student2 = new Grade("Mike", 67890, 6.7);

    System.out.println("Best student: " + student1.getName() + " " + student1.getSocialNumber() + " " + student1.getGPA());
    System.out.println("Worst student " + student2.getName() + " " + student2.getSocialNumber() + " " + student2.getGPA());

    System.out.println(student1.toString() + " " + student2.toString());
    System.out.println(student1.equals(student2));
  }
}
//Client class named Grade
class Grade {

  String name = "";
  int socialNumber;
  double gpa;
  //Constructor
  public Grade(String n, int sn, double g) {
    name = n;
    socialNumber = sn;
    gpa = g;
  }
  public void setName(String n) {
    name = n;
  }
  public void setSocialNumber(int sn) {
    socialNumber = sn;
  }
  public void setGPA(double g) {
    gpa = g;
  }
  public String getName() {
    return name;
  }
  public int getSocialNumber() {
    return socialNumber;
  }
  public double getGPA() {
    return gpa;
  }
}


/*Write a class encapsulating the concept of a student, assuming a
student has the following attributes: a name, a Social Security
number, and a GPA (for instance, 3.5). Include a constructor, the
accessors and mutators, and methods toString and equals. Write a
client class to test all the methods in your class.*/
