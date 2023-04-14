package burger.bun;

import burger.AbstractBurgerItem;

/**
 * Bun parent class of subclasses
 */
public abstract class Bun extends AbstractBurgerItem {

    /**
     *
     * @return String representation of item inputted
     */
    public abstract String toString();

    /**
     *
     * @return returns price of item, default value of .50 should be ignored
     */
    public Double getPrice() {
        return 0.50;
    }
}
