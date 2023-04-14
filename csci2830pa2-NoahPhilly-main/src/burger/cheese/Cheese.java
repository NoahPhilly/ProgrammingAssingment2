package burger.cheese;

import burger.AbstractBurgerItem;

public abstract class Cheese extends AbstractBurgerItem {

    /**
     *
     * @return string representation of subclass objects
     */
    public abstract String toString();

    /**
     *
     * @return specific price of subclass that inherits this method
     */
    public Double getPrice() {
        return 0.50;
    }
}
