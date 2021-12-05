package  com.gui.lab9;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ErrCheck {

    public static void check(Label result, TextField nr1Input, TextField nr2Input ) {

        try {

            float inputDividend = Float.parseFloat(nr1Input.getText());
            float inputDivisor = Float.parseFloat(nr2Input.getText());

            result.setText("Result:");

            if (inputDivisor == 13)
                throw new UnluckyException();

            float res = inputDividend / inputDivisor;
            result.setText("Result: " + res);
        } catch (NullPointerException  | NumberFormatException e1 ) {
            AlertBox.display( "Either complete the empty fields or use just numbers! ");
        }
        catch (ArithmeticException e2) {
            AlertBox.display ( " Can't evaluate expression!");
        } catch (UnluckyException e3) {
            AlertBox.display ("Unlucky Exception. The 13 Haunts you! ");
        }


    }

}
