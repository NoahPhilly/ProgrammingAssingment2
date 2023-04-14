package burger.patty;

public class BeefPatty extends Patty {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Beef Patty";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 2.75;
    }
}
