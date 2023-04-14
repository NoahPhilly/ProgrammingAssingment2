package burger.patty;

public class VeggiePatty extends Patty {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Veggie Patty";
    }

    /**
     *
     * @return price of this specific object
     */
    @Override
    public Double getPrice() {
        return 3.30;
    }
}
