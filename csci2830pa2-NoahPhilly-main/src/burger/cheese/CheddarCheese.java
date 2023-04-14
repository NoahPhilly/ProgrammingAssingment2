package burger.cheese;

public class CheddarCheese extends Cheese {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Cheddar Cheese";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 1.10;
    }
}
