package burger.patty;

import burger.AbstractBurgerItem;

public abstract class Patty extends AbstractBurgerItem {

    /**
     *
     * @return string representation of a subclass that inherits this method
     */
    public abstract String toString();

    /**
     *
     * @return specific price of a subclass that inherits this method
     */
    public Double getPrice() {
        return 0.50;
    }
}
