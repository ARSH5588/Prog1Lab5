/**
*@author Arshjit Sansoe
*@since May 3rd, 2020
*@return tv1 equals tv2
*/
public class Tv {
  public static void main(String[] args) {
    //2 tvs
    Television tv1 = new Television("LG124", 340.56);
    Television tv2 = new Television("Razer25", 560.45);

    System.out.println("First TV I bought: " + tv1.getBrand() + " " + tv1.getPrice());
    System.out.println("Latest TV I own: " + tv2.getBrand() + " " + tv2.getPrice());

    System.out.println(tv1.toString() + " " + tv2.toString());
    System.out.println(tv1.equals(tv2));
  }
}
//Client class named Television
class Television {
  String brand = "";
  double price;
  //Constructor
  public Television(String b, double p) {
    brand = b;
    price = p;
  }

  public void setBrand(String b) {
    brand = b;
  }
  public void setPrice(double p) {
    price = p;
  }
  public String getBrand() {
    return brand;
  }
  public double getPrice() {
    return price;
  }
}

/*Write a class encapsulating the concept of a television set,
assuming a television set has the following attributes: a brand and a
price. Include a constructor, the accessors and mutators, and
methods toString and equals. Write a client class to test all the
methods in your class.*/
