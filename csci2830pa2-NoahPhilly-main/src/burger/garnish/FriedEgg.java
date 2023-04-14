package burger.garnish;

public class FriedEgg extends Garnish {

    /**
     *
     * @return string representation of this object
     */
    @Override
    public String toString() {
        return "Fried Egg";
    }

    /**
     *
     * @return specific price of this object
     */
    @Override
    public Double getPrice() {
        return 2.50;
    }
}
