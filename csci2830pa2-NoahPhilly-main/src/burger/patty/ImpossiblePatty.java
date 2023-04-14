package burger.patty;

public class ImpossiblePatty extends Patty {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Impossible Patty";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 3.50;
    }
}
