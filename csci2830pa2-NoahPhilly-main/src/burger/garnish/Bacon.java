package burger.garnish;

public class Bacon extends Garnish {

    /**
     *
     * @return string representation of this object
     */
    @Override
    public String toString() {
        return "Bacon Garnish";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 3.00;
    }
}
