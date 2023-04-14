package burger;

import burger.bun.Bun;
import burger.cheese.Cheese;
import burger.garnish.Garnish;
import burger.patty.Patty;

import java.util.ArrayList;
import java.util.Collections;

public class Burger {

    private Bun burgBun;
    private ArrayList<Cheese> burgCheese;
    private ArrayList<Garnish> burgGarnish;
    private ArrayList<Patty> burgPatty;

    private ArrayList<AbstractBurgerItem> burgerComponents;

    public Burger(){
        this.burgBun = null;
        this.burgCheese = new ArrayList<Cheese>();
        this.burgGarnish = new ArrayList<Garnish>();
        this.burgPatty = new ArrayList<Patty>();
        this.burgerComponents = new ArrayList<AbstractBurgerItem>();
    }

    public Bun getBun() {
        return this.burgBun;
    }

    /**
     * In addition to setting crust, setCrust also sticks the crust into the burgerComponents list for future displays
     * @param bun the selected bun
     */
    public void setBun(Bun bun) {
        this.burgBun = bun;
        this.addComponent(burgBun);
    }

    /**
     * In addition to setting sauce, setSauce also sticks the sauce into the burgerComponents list for future displays
     * @param cheese the selected cheese
     */
    public void setCheese(Cheese cheese) {
        this.burgCheese.add(cheese);
        this.addComponent(cheese);
    }

    public void setGarnish(Garnish garnish) {
        this.burgGarnish.add(garnish);
        this.addComponent(garnish);
    }

    public void setPatty(Patty patty) {
        this.burgPatty.add(patty);
        this.addComponent(patty);
    }

    public ArrayList<Cheese> getCheese() {
        return this.burgCheese;
    }

    public ArrayList<Garnish> getGarnish() {
        return this.burgGarnish;
    }

    public ArrayList<Patty> getPatty() {
        return this.burgPatty;
    }



    public ArrayList<AbstractBurgerItem> getComponents() {
        return this.burgerComponents;
    }

    public void addComponent(AbstractBurgerItem item) {
        this.burgerComponents.add(item);
    }

    public String toNiceString() {
        return "Pizza is: " + toString();
    }

    /**
     * @returns the burger string as concatenation of all its component strings (ignore)
     */
    public String toString() {
        return "";
    }

    /**
     * Lists all burger components
     */
    public String display() {
        String displayString;
        StringBuilder builtString = new StringBuilder();
        for (BurgerItem bi : this.burgerComponents) {
            displayString = (bi.toString() + ": " + bi.getPrice() + "\n");
            builtString.append(displayString);
        }
        return builtString.toString();
    }

    /**
     * Sorts the burger components before listing them.
     * Note that sort is done in-place, this permanently changes the ordering in the list.
     */
    public void displaySorted() {
        Collections.sort(this.burgerComponents);
        display();
    }

    /**
     * Compute burger price as the sum of its parts.
     */
    public Double getPrice() {
        Double total = 0.0;
        for (BurgerItem bi : burgerComponents) {
            total += bi.getPrice();
        }
        return total;
    }

}
