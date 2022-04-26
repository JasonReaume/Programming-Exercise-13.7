/**
 * 
 * @author Jason Reaume
 * @version 4/26/2021
 * 
 *          Square is a subclass of GeometricObject. It implements the Colorable interface to inform
 *          the user how to color a Square object. It also contains methods that calculate the
 *          perimeter and area of a Square object.
 */

public class Square extends GeometricObject implements Colorable {
  private double side;

  // Construct a default Square object
  Square() {
    side = 0;
  }

  // Construct a Square object given a side value
  Square(double side) {
    this.side = side;
  }

  // Set the length of the side of a Square object
  private void setSide(double side) {
    this.side = side;
  }

  // Return the length of the side of a Square object
  private double getSide() {
    return side;
  }

  // Override the abstract method getPerimeter in GeometricObject
  @Override
  public double getPerimeter() {
    return side * 4;
  }

  // Override the abstract method getArea in GeometricObject
  @Override
  public double getArea() {
    return side * side;
  }

  // Override the abstract method howToColor in Colorable
  @Override
  public void howToColor() {
    System.out.print("Color all four sides.");
  }

}
