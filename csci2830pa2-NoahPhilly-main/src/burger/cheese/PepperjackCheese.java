package burger.cheese;

public class PepperjackCheese extends Cheese {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Pepperjack Cheese";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 1.25;
    }
}
