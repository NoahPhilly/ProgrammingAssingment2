package burger.garnish;

public class OnionRings extends Garnish {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Onion Rings";
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
