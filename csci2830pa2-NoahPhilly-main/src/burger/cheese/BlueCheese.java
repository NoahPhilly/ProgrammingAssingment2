package burger.cheese;

public class BlueCheese extends Cheese {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Blue Cheese";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 1.75;
    }

}
