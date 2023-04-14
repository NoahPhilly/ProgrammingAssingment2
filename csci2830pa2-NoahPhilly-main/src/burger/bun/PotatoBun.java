package burger.bun;


public class PotatoBun extends Bun {

    /**
     *
     * @return overriden string value of inherited object
     */
    @Override
    public String toString() {
        return "Potato Bun";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 1.50;
    }
}
