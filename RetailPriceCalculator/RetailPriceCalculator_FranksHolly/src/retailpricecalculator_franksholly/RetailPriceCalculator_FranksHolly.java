/**
* Here is the main class for the RetailPriceCalculator assignment.
* 11-27-2017
* CSC 251 Lab 11 - Retail Price Calculator
* @author Holly Franks
*/
package retailpricecalculator_franksholly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mio
 */
public class RetailPriceCalculator_FranksHolly extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("RetailPriceCalculator_FranksHolly.fxml"));
        
        Scene scene = new Scene(parent);
        
        stage.setTitle("Retail Price Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
