package burger.patty;

public class ChickenPatty extends Patty {

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
        return 2.25;
    }
}
