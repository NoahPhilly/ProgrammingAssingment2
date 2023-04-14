package burger.garnish;

import burger.AbstractBurgerItem;

public abstract class Garnish extends AbstractBurgerItem {

    /**
     *
     * @return value of subclass toString()
     */
    public abstract String toString();

    /**
     *
     * @return specific value from subclass that inherits this method
     */
    public Double getPrice() {
        return 0.50;
    }
}
