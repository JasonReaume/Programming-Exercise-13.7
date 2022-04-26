/**
 * 
 * GeometricObject is an abstract class that provides the user with several different methods to
 * change the style of a GeometricObject type object. It also contains two abstract methods for
 * calculating geometric formulas.
 * 
 * Code is retrieved from Material for Homework in Canvas Files
 */

public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  // Construct a default geometric object
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  // Construct a geometric object with color and filled value
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  // Return color
  public String getColor() {
    return color;
  }

  // Set a new color
  public void setColor(String color) {
    this.color = color;
  }

  // Return filled. Since filled is boolean, the get method is named isFilled
  public boolean isFilled() {
    return filled;
  }

  // Set a new filled
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  // Get dateCreated
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  // Return a string representation of this object
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }

  // Abstract method getPerimeter
  public abstract double getPerimeter();

  // Abstract method getArea
  public abstract double getArea();
}
