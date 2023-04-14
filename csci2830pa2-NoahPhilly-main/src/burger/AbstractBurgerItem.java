package burger;

public abstract class AbstractBurgerItem implements BurgerItem, Comparable<BurgerItem>{

    /**
     *
     * @return specific price of objects that implement this method
     */
    public abstract Double getPrice();

/**
 * implements compareTo() for all BurgerItems
 * @param bi the item being compared against us
 * @returns results of Double.compareTo()
 */
    public int compareTo(BurgerItem bi) {
        return this.getPrice().compareTo(bi.getPrice());
    }
}
