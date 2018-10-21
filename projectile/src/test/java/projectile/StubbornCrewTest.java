/*
 * @author Adam
 */

package projectile;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The Class StubbornCrewTest.
 */
public class StubbornCrewTest {

  /** The anomaly number. */
  private final transient int anomalyNumber;

  /**
   * Instantiates a new stubborn crew test.
   */
  public StubbornCrewTest() {
    anomalyNumber = 1;
  }

  /**
   * Test number one.
   */
  @Test
  public void testNumberOne() {
    final StubbornCrew objectUnderTest = new StubbornCrew(false);
    final long expected = 23 + anomalyNumber;
    objectUnderTest.manualGravity(Forcefulness.WEAK_POINT);
    final long actual = objectUnderTest.smash(1);
    assertEquals("Values should be equals", expected, actual, 0);
  }

  /**
   * Test number two.
   */
  @Test
  public void testNumberTwo() {
    final StubbornCrew objectUnderTest = new StubbornCrew(false);
    final long expected = 587 + anomalyNumber;
    objectUnderTest.manualGravity(Forcefulness.STRONG_MASS);
    final long actual = objectUnderTest.smash(4);
    assertEquals("Values should be equals", expected, actual, 0);
  }

  /**
   * Test number three.
   */
  @Test
  public void testNumberThree() {
    final StubbornCrew objectUnderTest = new StubbornCrew(false);
    final long expected = 74909 + anomalyNumber;
    objectUnderTest.manualGravity(Forcefulness.DECAY_PEAK);
    final long actual = objectUnderTest.smash(7);
    assertEquals("Values should be equals", expected, actual, 0);
  }
}
