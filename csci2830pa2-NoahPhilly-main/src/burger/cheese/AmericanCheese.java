package burger.cheese;

public class AmericanCheese extends Cheese {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "American Cheese";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 2.00;
    }
}
