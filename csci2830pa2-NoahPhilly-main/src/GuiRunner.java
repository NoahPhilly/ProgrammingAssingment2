import burger.Burger;
import burger.bun.PotatoBun;
import burger.bun.SesameBun;
import burger.cheese.AmericanCheese;
import burger.cheese.BlueCheese;
import burger.cheese.CheddarCheese;
import burger.cheese.PepperjackCheese;
import burger.garnish.Bacon;
import burger.garnish.FriedEgg;
import burger.garnish.OnionRings;
import burger.garnish.TomatoGarnish;
import burger.patty.BeefPatty;
import burger.patty.ChickenPatty;
import burger.patty.ImpossiblePatty;
import burger.patty.VeggiePatty;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pizza.Pizza;
import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.AlfredoSauce;
import pizza.sauce.TomatoSauce;
import pizza.topping.*;

/**
 * GUI Class Runner used to execute and run our application.
 */

public class GuiRunner extends Application {

    private Scene sceneRoot;
    private Pizza pizza = new Pizza();
    private Burger burger = new Burger();

    public static void main(String[] args) {
        launch(args);
    }

    /**
     *
     * @param stage the primary stage for this application, onto which
     * the application scene can be set. The primary stage will be embedded in
     * the browser if the application was launched as an applet.
     * Applications may create other stages, if needed, but they will not be
     * primary stages and will not be embedded in the browser.
     */
    @Override
    public void start(Stage stage)  {

        /**
         * Note, there are A LOT of conditional statements to verify and validate input within our button action event.
         * The sole purpose of doing so is to avoid a Null Pointer Exception and maintain the uptime of our application.
         */
        VBox root = new VBox();

        String[] crustChoice = new String[]{"Thin Crust", "Thick Crust"};
        String[] sauceChoice = new String[]{"Alfredo Sauce", "Tomato Sauce"};
        String[] toppingChoice = new String[]{"Asiago", "Mozzarella", "Mushroom", "Pepperoni", "Pepper", "Sausage"};

        String[] bunChoice = new String[]{"Potato Bun", "Sesame Bun"};
        String[] burgerCheeseChoice = new String[]{"American Cheese", "Blue Cheese", "Cheddar Cheese", "Pepperjack Cheese"};
        String[] burgerGarnishChoice = new String[]{"Bacon", "Fried Egg", "Onion Ring", "Tomato"};
        String[] burgerPattyChoice = new String[]{"Beef Patty", "Chicken Patty", "Impossible Patty", "Veggie Patty"};

        Label pizzaCrustLabel = new Label("Pizza Crust (Need to select one)");

        ChoiceBox pizzaCrust = new ChoiceBox(FXCollections.observableArrayList(
                "Thin Crust", "Thick Crust")
        );
        Label pizzaSauceLabel = new Label("Pizza Sauce (Need to select one)");
        ChoiceBox pizzaSauce = new ChoiceBox(FXCollections.observableArrayList(
                "Alfredo Sauce", "Tomato Sauce")
        );

        Label pizzaToppingLabel = new Label("Add Toppings (up to 4)");

        ChoiceBox pizzaTopping1 = new ChoiceBox(FXCollections.observableArrayList(
                "Asiago", "Mozzarella", "Mushroom", "Pepperoni", "Pepper", "Sausage")
        );
        ChoiceBox pizzaTopping2 = new ChoiceBox(FXCollections.observableArrayList(
                "Asiago", "Mozzarella", "Mushroom", "Pepperoni", "Pepper", "Sausage")
        );
        ChoiceBox pizzaTopping3 = new ChoiceBox(FXCollections.observableArrayList(
                "Asiago", "Mozzarella", "Mushroom", "Pepperoni", "Pepper", "Sausage")
        );
        ChoiceBox pizzaTopping4 = new ChoiceBox(FXCollections.observableArrayList(
                "Asiago", "Mozzarella", "Mushroom", "Pepperoni", "Pepper", "Sausage")
        );


        Label burgerBunLabel = new Label("Burger Bun (Need to select one)");

        ChoiceBox burgerBun = new ChoiceBox(FXCollections.observableArrayList(
                "Potato Bun", "Sesame Bun")
        );

        Label burgerCheeseLabel = new Label("Cheese on Burger (up to 4)");
        ChoiceBox burgerCheese1 = new ChoiceBox(FXCollections.observableArrayList(
                "American Cheese", "Blue Cheese", "Cheddar Cheese", "Pepperjack Cheese")
        );

        ChoiceBox burgerCheese2 = new ChoiceBox(FXCollections.observableArrayList(
                "American Cheese", "Blue Cheese", "Cheddar Cheese", "Pepperjack Cheese")
        );

        ChoiceBox burgerCheese3 = new ChoiceBox(FXCollections.observableArrayList(
                "American Cheese", "Blue Cheese", "Cheddar Cheese", "Pepperjack Cheese")
        );

        ChoiceBox burgerCheese4 = new ChoiceBox(FXCollections.observableArrayList(
                "American Cheese", "Blue Cheese", "Cheddar Cheese", "Pepperjack Cheese")
        );

        Label burgerGarnishLabel = new Label("Burger Garnishes (up to 4)");
        ChoiceBox burgerGarnish1 = new ChoiceBox(FXCollections.observableArrayList(
                "Bacon", "Fried Egg", "Onion Ring", "Tomato")
        );

        ChoiceBox burgerGarnish2 = new ChoiceBox(FXCollections.observableArrayList(
                "Bacon", "Fried Egg", "Onion Ring", "Tomato")
        );

        ChoiceBox burgerGarnish3 = new ChoiceBox(FXCollections.observableArrayList(
                "Bacon", "Fried Egg", "Onion Ring", "Tomato")
        );

        ChoiceBox burgerGarnish4 = new ChoiceBox(FXCollections.observableArrayList(
                "Bacon", "Fried Egg", "Onion Ring", "Tomato")
        );

        Label burgerPattyLabel = new Label("Burger Patty (up to 4)");
        ChoiceBox burgerPatty1 = new ChoiceBox(FXCollections.observableArrayList(
                "Beef Patty", "Chicken Patty", "Impossible Patty", "Veggie Patty")
        );

        ChoiceBox burgerPatty2 = new ChoiceBox(FXCollections.observableArrayList(
                "Beef Patty", "Chicken Patty", "Impossible Patty", "Veggie Patty")
        );

        ChoiceBox burgerPatty3 = new ChoiceBox(FXCollections.observableArrayList(
                "Beef Patty", "Chicken Patty", "Impossible Patty", "Veggie Patty")
        );

        ChoiceBox burgerPatty4 = new ChoiceBox(FXCollections.observableArrayList(
                "Beef Patty", "Chicken Patty", "Impossible Patty", "Veggie Patty")
        );

        Button submitButton = new Button("Submit");



        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Button homeButton = new Button("Back to Home!");

                homeButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        stage.setScene(sceneRoot);
                        stage.show();

                    }
                });

                String pizzaTopping1Text;
                String pizzaTopping2Text;
                String pizzaTopping3Text;
                String pizzaTopping4Text;
                String pizzaCrustText;
                String pizzaSauceText;

                String burgerBunText;
                String burgerCheese1Text;
                String burgerCheese2Text;
                String burgerCheese3Text;
                String burgerCheese4Text;
                String burgerGarnish1Text;
                String burgerGarnish2Text;
                String burgerGarnish3Text;
                String burgerGarnish4Text;
                String burgerPatty1Text;
                String burgerPatty2Text;
                String burgerPatty3Text;
                String burgerPatty4Text;

                pizzaCrustText = crustChoice[pizzaCrust.getSelectionModel()
                        .selectedIndexProperty().intValue()];

                pizzaSauceText = sauceChoice[pizzaSauce.getSelectionModel()
                        .selectedIndexProperty().intValue()];

                if(pizzaTopping1.getSelectionModel()
                        .selectedIndexProperty().intValue() == -1){
                    pizzaTopping1Text = "Empty";
                }else {
                    pizzaTopping1Text = toppingChoice[pizzaTopping1.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(pizzaTopping2.getSelectionModel()
                        .selectedIndexProperty().intValue() == -1){
                    pizzaTopping2Text = "Empty";
                }else {
                    pizzaTopping2Text = toppingChoice[pizzaTopping2.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(pizzaTopping3.getSelectionModel()
                        .selectedIndexProperty().intValue() == -1){
                    pizzaTopping3Text = "Empty";
                }else{
                    pizzaTopping3Text = toppingChoice[pizzaTopping3.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }


                if(pizzaTopping4.getSelectionModel()
                        .selectedIndexProperty().intValue() == -1){
                    pizzaTopping4Text = "Empty";
                }else {
                    pizzaTopping4Text = toppingChoice[pizzaTopping4.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }


                //Burger selection input
                burgerBunText = bunChoice[burgerBun.getSelectionModel()
                        .selectedIndexProperty().intValue()];

                if(burgerCheese1.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerCheese1Text = "Empty";
                }else{
                    burgerCheese1Text = burgerCheeseChoice[burgerCheese1.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerCheese2.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerCheese2Text = "Empty";
                }else{
                    burgerCheese2Text = burgerCheeseChoice[burgerCheese2.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerCheese3.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerCheese3Text = "Empty";
                }else{
                    burgerCheese3Text = burgerCheeseChoice[burgerCheese3.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerCheese4.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerCheese4Text = "Empty";
                }else{
                    burgerCheese4Text = burgerCheeseChoice[burgerCheese4.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerGarnish1.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerGarnish1Text = "Empty";
                }else{
                    burgerGarnish1Text = burgerGarnishChoice[burgerGarnish1.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerGarnish2.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerGarnish2Text = "Empty";
                }else{
                    burgerGarnish2Text = burgerGarnishChoice[burgerGarnish2.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerGarnish3.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerGarnish3Text = "Empty";
                }else{
                    burgerGarnish3Text = burgerGarnishChoice[burgerGarnish3.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerGarnish4.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerGarnish4Text = "Empty";
                }else{
                    burgerGarnish4Text = burgerGarnishChoice[burgerGarnish4.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerPatty1.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerPatty1Text = "Empty";
                }else{
                    burgerPatty1Text = burgerPattyChoice[burgerPatty1.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerPatty2.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerPatty2Text = "Empty";
                }else{
                    burgerPatty2Text = burgerPattyChoice[burgerPatty2.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerPatty3.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerPatty3Text = "Empty";
                }else{
                    burgerPatty3Text = burgerPattyChoice[burgerPatty3.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }

                if(burgerPatty4.getSelectionModel().selectedIndexProperty().intValue() == -1){
                    burgerPatty4Text = "Empty";
                }else{
                    burgerPatty4Text = burgerPattyChoice[burgerPatty4.getSelectionModel()
                            .selectedIndexProperty().intValue()];
                }


                pizzaCrustConv(pizzaCrustText);
                pizzaSauceConv(pizzaSauceText);
                pizzaToppingConv(pizzaTopping1Text);
                pizzaToppingConv(pizzaTopping2Text);
                pizzaToppingConv(pizzaTopping3Text);
                pizzaToppingConv(pizzaTopping4Text);

                burgerBunConv(burgerBunText);
                burgerCheeseConv(burgerCheese1Text);
                burgerCheeseConv(burgerCheese2Text);
                burgerCheeseConv(burgerCheese3Text);
                burgerCheeseConv(burgerCheese4Text);
                burgerGarnishConv(burgerGarnish1Text);
                burgerGarnishConv(burgerGarnish2Text);
                burgerGarnishConv(burgerGarnish3Text);
                burgerGarnishConv(burgerGarnish4Text);
                burgerPattyConv(burgerPatty1Text);
                burgerPattyConv(burgerPatty2Text);
                burgerPattyConv(burgerPatty3Text);
                burgerPattyConv(burgerPatty4Text);


                VBox inpBox = new VBox();

                Label pizzaLabel = new Label("Itemized Total!\n");
                Label pizzaPerItem = new Label(pizza.display());
                Label totalLabel = new Label("Total Price!");
                Label totalVal = new Label(String.format("%.2f", pizza.getPrice()));

                Label burgerLabel = new Label("\nItemized Total!\n");
                Label burgerPerItem = new Label(burger.display());
                Label burgerTotalLabel = new Label("Total Price!");
                Label burgerTotalVal = new Label(String.format("%.2f", burger.getPrice()));


                inpBox.getChildren().addAll(pizzaLabel, pizzaPerItem, totalLabel, totalVal,
                        burgerLabel, burgerPerItem, burgerTotalLabel, burgerTotalVal, homeButton);
                inpBox.setSpacing(5);
                Scene scene = new Scene(inpBox, 600, 500);
                stage.setScene(scene);
                stage.show();
            }
        });

        root.getChildren().addAll( pizzaCrustLabel,pizzaCrust, pizzaSauceLabel, pizzaSauce, pizzaToppingLabel,
                pizzaTopping1, pizzaTopping2, pizzaTopping3, pizzaTopping4, burgerBunLabel, burgerBun, burgerCheeseLabel, burgerCheese1, burgerCheese2,
                burgerCheese3, burgerCheese4, burgerGarnishLabel, burgerGarnish1, burgerGarnish2, burgerGarnish3, burgerGarnish4 ,burgerPattyLabel, burgerPatty1,
                burgerPatty2,  burgerPatty3,  burgerPatty4 ,submitButton);


        ScrollPane sp = new ScrollPane();
        sp.setPannable(true);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        sceneRoot = new Scene(root, 600, 500);
        stage.setScene(sceneRoot);
        stage.show();
    }


    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void pizzaCrustConv(String input){
        if(input.equalsIgnoreCase("Thick Crust")){
            pizza.setCrust(new ThickCrust());
        } else if (input.equalsIgnoreCase("Thin Crust")){
            pizza.setCrust(new ThinCrust());
        }
    }

    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void pizzaSauceConv(String input){
        if(input.equalsIgnoreCase("Alfredo Sauce")){
            pizza.setSauce(new AlfredoSauce());
        } else if(input.equalsIgnoreCase("Tomato Sauce")){
            pizza.setSauce(new TomatoSauce());
        }
    }

    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void pizzaToppingConv(String input){
        if(input.equalsIgnoreCase("Asiago")){
            pizza.addTopping(new AsiagoTopping());
        } else if (input.equalsIgnoreCase("Mozzarella")) {
            pizza.addTopping(new MozzarellaTopping());
        }else if (input.equalsIgnoreCase("Mushroom")) {
            pizza.addTopping(new MushroomTopping());
        }else if (input.equalsIgnoreCase("Pepperoni")) {
            pizza.addTopping(new PepperoniTopping());
        }else if (input.equalsIgnoreCase("Pepper")) {
            pizza.addTopping(new PepperTopping());
        }else if (input.equalsIgnoreCase("Sausage")) {
            pizza.addTopping(new SausageTopping());
        }
    }

    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void burgerBunConv(String input){
        if(input.equalsIgnoreCase("Potato Bun")){
            burger.setBun(new PotatoBun());
        } else if (input.equalsIgnoreCase("Sesame Bun")){
            burger.setBun(new SesameBun());
        }
    }


    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void burgerCheeseConv(String input){
        if(input.equalsIgnoreCase("American Cheese")){
            burger.setCheese(new AmericanCheese());
        } else if (input.equalsIgnoreCase("Blue Cheese")){
            burger.setCheese(new BlueCheese());
        } else if (input.equalsIgnoreCase("Cheddar Cheese")){
            burger.setCheese(new CheddarCheese());
        }else if (input.equalsIgnoreCase("Pepperjack Cheese")){
            burger.setCheese(new PepperjackCheese());
        }
    }

    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void burgerGarnishConv(String input){
        if(input.equalsIgnoreCase("Bacon")){
            burger.setGarnish(new Bacon());
        } else if (input.equalsIgnoreCase("Fried Egg")){
            burger.setGarnish(new FriedEgg());
        } else if (input.equalsIgnoreCase("Onion Ring")){
            burger.setGarnish(new OnionRings());
        }else if (input.equalsIgnoreCase("Tomato")){
            burger.setGarnish(new TomatoGarnish());
        }
    }

    /**
     *
     * @param input to convert our string values to usable objects
     */
    private void burgerPattyConv(String input){
        if(input.equalsIgnoreCase("Beef Patty")){
            burger.setPatty(new BeefPatty());
        } else if (input.equalsIgnoreCase("Chicken Patty")){
            burger.setPatty(new ChickenPatty());
        } else if (input.equalsIgnoreCase("Impossible Patty")){
            burger.setPatty(new ImpossiblePatty());
        }else if (input.equalsIgnoreCase("Veggie Patty")){
            burger.setPatty(new VeggiePatty());
        }
    }


}
