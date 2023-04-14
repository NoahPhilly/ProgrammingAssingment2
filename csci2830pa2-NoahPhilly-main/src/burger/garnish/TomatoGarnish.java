package burger.garnish;

public class TomatoGarnish extends Garnish {

    /**
     *
     * @return string respresentation of this object
     */
    @Override
    public String toString() {
        return "Tomato Garnish";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 0.60;
    }
}
