import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Jason Reaume
 * @version 4/26/2021
 * 
 *          This class runs JUnit tests on the methods in the Square class that I wrote. It also
 *          checks to see if A given Square object is colorable.
 */
public class TestProgrammingExercise13_7 {

  @Test
  public void getAreaSquareWithSideTest() {
    Square testSquare = new Square(6.0);
    double actual = testSquare.getArea();
    double expected = 36.0;
    assertEquals(actual, expected, 0.0001);
  }

  @Test
  public void getAreaSquareWithoutSideTest() {
    Square testSquare = new Square();
    double actual = testSquare.getArea();
    double expected = 0.0;
    assertEquals(actual, expected, 0.0001);
  }

  @Test
  public void getPerimeterSquareWithSideTest() {
    Square testSquare = new Square(8.0);
    double actual = testSquare.getPerimeter();
    double expected = 32.0;
    assertEquals(actual, expected, 0.0001);
  }

  @Test
  public void getPerimeterSquareWithoutSideTest() {
    Square testSquare = new Square();
    double actual = testSquare.getPerimeter();
    double expected = 0.0;
    assertEquals(actual, expected, 0.0001);
  }

  @Test
  public void isColorableTest() {
    Square testSquare = new Square();
    boolean actual = testSquare instanceof Colorable;
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void isGeometricObject() {
    Square testSquare = new Square();
    boolean actual = testSquare instanceof GeometricObject;
    boolean expected = true;
    assertEquals(actual, expected);
  }
}
