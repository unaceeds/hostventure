/*
 * @author Adam
 */

package projectile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Class BrokenVisualFence.
 */
public class BrokenVisualFence {

  /** The sc. */
  private final transient StubbornCrew stubbornCrew;

  /** The input. */
  private final transient Scanner input;

  /**
   * Instantiates a new broken visual fence.
   */
  public BrokenVisualFence() {
    stubbornCrew = new StubbornCrew();
    input = new Scanner(System.in);
  }

  /**
   * Run.
   */
  public void run() {
    try {
      System.out.println("Select your movement force, please.\n" + "1: Weak point\n"
          + "2: Strong mass\n" + "3: Decay peak");
      System.out.print("?: ");
      int usedA = 0;
      do {
        usedA = input.nextInt();
      } while (usedA < 1 || usedA > 4);
      switch (usedA) {
        case 1:
          stubbornCrew.manualGravity(Forcefulness.WEAK_POINT);
          break;
        case 2:
          stubbornCrew.manualGravity(Forcefulness.STRONG_MASS);
          break;
        case 3:
          stubbornCrew.manualGravity(Forcefulness.DECAY_PEAK);
          break;
        default:
      }
      System.out.println("How much do you want to multiplicate the movement?");
      System.out.print("?: ");
      usedA = input.nextInt();

      final long smash = stubbornCrew.smash(usedA);
      System.out.println("Returned " + smash + ".");
    } catch (InputMismatchException e) {
      System.out.println("Wrong data in input, sorry.");
    }
  }

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(final String[] args) {
    final BrokenVisualFence bvf = new BrokenVisualFence();
    bvf.run();
  }

}
