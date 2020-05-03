/**
*@author Arshjit Sansoe
*@since May 3rd, 2020
*@return tv1 equals tv2
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Grades {
  public static void main(String[] args) throws FileNotFoundException {
    //Variables
    int counter = 0;
    int highestGrade = 0;
    String bestStudentName = "";
    String bestname = "";
    String bestname2 = "";
    int lowestGrade = 100;
    String worstStudentName = "";
    String worstname = "";
    String worstname2 = "";
    int total = 0;
    double average;
    //Reading file with scanner and file class
    File inFile = new File("C:\\Users\\UPINDER\\Desktop\\Q1.txt");
    Scanner scan = new Scanner(inFile);
    //loop
    while (scan.hasNext()) {
      counter++;
      //first name
      String name = scan.next();
      //last name
      String name2 = scan.next();
      //equal sign
      String equalSign = scan.next();
      //grade
      String num = scan.next();
      //change string to int
      int num1 = Integer.parseInt(num);
      //add each grade to total to find average
      total += num1;
      //if found grade higher than highest grade then first and last name will be the new variables for bestname and bestname2
      if (num1 >= highestGrade) {
        highestGrade = num1;
        bestname = name;
        bestname2 = name2;
      }
      //if found grade lower than lowest grade then first and last name will be the new variables for worstname and worstname2
      if (num1 <= lowestGrade) {
        lowestGrade = num1;
        worstname = name;
        worstname2 = name2;
      }
    }
    //average calculated
    average = total/counter;
    //All outputs
    System.out.println("The highest score is " + highestGrade + " and the holder is " + bestname + " " + bestname2 + ".");
    System.out.println("The lowest score is " + lowestGrade + " and the holder is " + worstname + " " + worstname2 + ".");
    System.out.println("The total amount of grades processed are " + counter + ".");
    System.out.println("The average is " + average + ".");
  }
}
