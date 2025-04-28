import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main{
    public static void main(String[] args){
        System.out.println("hello world");

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("null", "xd", 445));
        cars.add(new Car("ford", "xd", 51521));

        Car ford = cars.get(1);
        System.out.println(ford.getBrand()); 

        Collections.sort( cars);

        for (Car c : cars) {
            System.out.println(c.getBrand() + " " + c.model + " " + c.year);
          }

        
    }

    
}

class Car implements Comparable<Car> {

    private String brand;
    public String model;
    public int year;
    
    public String getBrand() {
        return brand;
    }
    public Car(String b, String m, int y) {
      brand = b;
      model = m;
      year = y;
    }

    
    public int compareTo(Car obj){
        Car other = (Car)obj;
        if (year < other.year) return -1; // This object is smaller than the other one
        if (year > other.year) return 1;  // This object is larger than the other one
      return 0; // Both objects are the same
    }

    
}

/*
 * class Car implements Comparable {

    public String brand;
    public String model;
    public int year;
    
    public Car(String b, String m, int y) {
      brand = b;
      model = m;
      year = y;
    }

    
    public int compareTo(Object obj){
        Car other = (Car)obj;
        if (year < other.year) return -1; // This object is smaller than the other one
        if (year > other.year) return 1;  // This object is larger than the other one
      return 0; // Both objects are the same
    }

    
}
 */

 /*
  * // Define a Car class
class Car {
  public String brand;
  public String model;
  public int year;
  
  public Car(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
}

// Create a comparator
class SortByYear implements Comparator {
  public int compare(Object obj1, Object obj2) {
    // Make sure that the objects are Car objects
    Car a = (Car) obj1;
    Car b = (Car) obj2;
    
    // Compare the year of both objects
    if (a.year < b.year) return -1; // The first car has a smaller year
    if (a.year > b.year) return 1;  // The first car has a larger year
    return 0; // Both cars have the same year
  }
}

public class Main { 
  public static void main(String[] args) { 
    // Create a list of cars
    ArrayList<Car> myCars = new ArrayList<Car>();    
    myCars.add(new Car("BMW", "X5", 1999));
    myCars.add(new Car("Honda", "Accord", 2006));
    myCars.add(new Car("Ford", "Mustang", 1970));

    // Use a comparator to sort the cars
    Comparator myComparator = new SortByYear();
    Collections.sort(myCars, myComparator);

    // Display the cars
    for (Car c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}

  */
