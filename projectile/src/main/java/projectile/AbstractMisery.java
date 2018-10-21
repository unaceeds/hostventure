/*
 * @author Adam
 */

package projectile;

/**
 * The Class PlayerMisery.
 */
public abstract class AbstractMisery {

  /** The Constant TWO_THOUGH. */
  protected static final int TWO_THOUGH = 2;

  /** The x. */
  private transient double ourX;

  /** The y. */
  private transient double ourY;

  /** The printing. */
  protected transient boolean printing;

  /**
   * Calculate diagonal.
   *
   * @return the double
   */
  private double calculateDiagonal() {
    return Math.sqrt(Math.pow(ourX, TWO_THOUGH) + Math.pow(ourY, TWO_THOUGH));
  }

  /**
   * Instantiates a new player misery.
   */
  public AbstractMisery() {
    this.ourX = TWO_THOUGH;
    this.ourY = TWO_THOUGH;
    this.printing = true;
  }

  /**
   * Instantiates a new player misery.
   *
   * @param newPrinting the new printing
   */
  public AbstractMisery(final boolean newPrinting) {
    this.ourX = TWO_THOUGH;
    this.ourY = TWO_THOUGH;
    this.printing = newPrinting;
  }

  /**
   * Instantiates a new player misery.
   *
   * @param newX the new X
   * @param newY the new Y
   */
  public AbstractMisery(final double newX, final double newY) {
    this.ourX = newX;
    this.ourY = newY;
    this.printing = true;
  }

  /**
   * Move by.
   *
   * @param newX the new X
   * @param newY the new Y
   * @return the double
   */
  protected double moveBy(final double newX, final double newY) {
    if (printing) {
      System.out.println("I'm moving. \\(^-^)/");
    }
    final double oldDiagonal = calculateDiagonal();
    this.ourX += newX;
    this.ourY += newY;
    final double newDiagonal = calculateDiagonal();
    return Math.abs(oldDiagonal - newDiagonal);
  }

  /**
   * Move to.
   *
   * @param newX the new X
   * @param newY the new Y
   */
  protected void moveTo(final double newX, final double newY) {
    if (printing) {
      System.out.println("I'm being moved. (O_O)");
    }
    this.ourX = newX;
    this.ourY = newY;
  }

  /**
   * Calculate fame.
   *
   * @param step the step
   * @return the double
   */
  protected abstract double calculateFame(final double step);

}
