/*
 * @author Adam
 */

package projectile;

/**
 * The Class StubbornCrew.
 */
public class StubbornCrew extends AbstractMisery implements RainyMeans {

  /** The z. */
  private transient long ourZ;

  /**
   * Gets the z.
   *
   * @return the z
   */
  private long getZ() {
    return ourZ;
  }

  /**
   * Instantiates a new stubborn crew.
   */
  public StubbornCrew() {
    super();
    this.ourZ = TWO_THOUGH * TWO_THOUGH;
  }

  /**
   * Instantiates a new stubborn crew.
   *
   * @param printing the printing
   */
  public StubbornCrew(final boolean printing) {
    super(printing);
    this.ourZ = TWO_THOUGH * TWO_THOUGH;
  }

  /*
   * (non-Javadoc)
   * @see projectile.RainyMeans#manualGravity(projectile.Forcefulness)
   */
  public void manualGravity(final Forcefulness force) {
    switch (force) {
      case WEAK_POINT:
        this.ourZ *= TWO_THOUGH;
        break;
      case STRONG_MASS:
        this.ourZ = Math.round(Math.pow(getZ(), TWO_THOUGH));
        break;
      case DECAY_PEAK:
        this.ourZ = Math.round(Math.pow(getZ(), TWO_THOUGH * TWO_THOUGH));
        break;
      default:
    }
  }

  /*
   * (non-Javadoc)
   * @see projectile.RainyMeans#smash()
   */
  public long smash(final int multiplication) {
    if (printing) {
      System.out.println("You are about to smash me, my man. (x_x)");
    }
    double fame = 0;
    for (int i = 0; i < multiplication; i++) {
      fame += calculateFame(Math.sqrt(getZ()) + i);
    }
    final long oldZ = getZ();
    this.ourZ = TWO_THOUGH * TWO_THOUGH;
    if (printing) {
      System.out.println("You have just lost " + (oldZ - getZ()) + " stages of progress. (o.o)");
      System.out.println("And you gained " + fame + " points of fame. \\(^=^)/");
    }
    return (long) ((oldZ - getZ()) * fame);
  }

  /*
   * (non-Javadoc)
   * @see projectile.PlayerMisery#calculateFame(double)
   */
  @Override
  protected double calculateFame(final double step) {
    final double misery = this.moveBy(step, step * TWO_THOUGH);
    this.moveTo(step, step * TWO_THOUGH);
    return misery;
  }

}
