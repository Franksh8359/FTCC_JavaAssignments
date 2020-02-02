/**
* Here is the controller class for the RetailPriceCalculator assignment.
* 11-27-2017
* CSC 251 Lab 11 - Retail Price Calculator
* @author Holly Franks
*/

package retailpricecalculator_franksholly;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.text.DecimalFormat;

public class RetaiPriceCalculatorController {

    @FXML
    private Button exitButton;

    @FXML
    private Pane mainForm;

    @FXML
    private TextField costTextBox;

    @FXML
    private Label outputLabel;

    @FXML
    private TextField markupTextBox;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField outputTextBox;
    
    public void initialize(){}
    
    public void calculateButtonListener() {
        
        //try-catch for bad input; let user know in output field
        try{
            double cost = Double.parseDouble(costTextBox.getText());
            double markup = Double.parseDouble(markupTextBox.getText());
            double retail = cost + (cost * markup);
            DecimalFormat dollar = new DecimalFormat("#,##0.00");
            outputTextBox.setText("$" + dollar.format(retail));
        }
        catch (Exception ex) {costTextBox.clear(); markupTextBox.clear(); 
                              outputTextBox.setText("Error! Numbers only.");}
    }
    
    public void exitButtonListener() {
        System.exit(0);
    }

}
