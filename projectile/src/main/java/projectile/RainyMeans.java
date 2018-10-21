/*
 * @author Adam
 */

package projectile;

/**
 * The Interface RainyMeans.
 */
public interface RainyMeans {

  /**
   * Manual gravity.
   *
   * @param force the force
   */
  void manualGravity(final Forcefulness force);

  /**
   * Smash.
   *
   * @param multiplication the multiplication
   * @return the long
   */
  long smash(final int multiplication);

}
