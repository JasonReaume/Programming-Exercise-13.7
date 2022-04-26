/**
 * 
 * @author Jason Reaume
 * @version 4/26/2021
 * 
 *          ProgrammingExercise13_7 creates an array of five objects of GeometricObject type and
 *          displays the area for each object in the area. It will also invoke the howToColor method
 *          on every GeometricObject that implements Colorable.
 */

public class ProgrammingExercise13_7 {
  public static void main(String[] args) {
    GeometricObject[] geometricShapes = new GeometricObject[5]; // Creates an array with 5
                                                                // GeometricObjects
    geometricShapes[0] = new Square();
    geometricShapes[1] = new Square(2.0);
    geometricShapes[2] = new Square(50.0);
    geometricShapes[3] = new Square(8.0);
    geometricShapes[4] = new Square(1.0);

    /*
     * Displays the area for every shape. If the GeometricObject implements Colorable, it will
     * invoke howToColor on the object and define how the shape should be filled.
     */
    for (int i = 0; i < geometricShapes.length; i++) {
      System.out
          .println("The area of shape " + (i + 1) + " is " + geometricShapes[i].getArea() + ".");

      if (geometricShapes[i] instanceof Colorable) {
        System.out.print("How to color: ");
        ((Colorable) (geometricShapes[i])).howToColor();
      }
    }
  }
}
