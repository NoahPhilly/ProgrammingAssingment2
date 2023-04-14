package burger.bun;

public class SesameBun extends Bun {

    /**
     *
     * @return string representation of this object
     */
    @Override
    public String toString() {
        return "Sesame Bun";
    }

    /**
     *
     * @return specific price for this object
     */
    @Override
    public Double getPrice() {
        return 1.00;
    }
}
