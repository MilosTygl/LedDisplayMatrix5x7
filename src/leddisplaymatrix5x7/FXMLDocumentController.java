package leddisplaymatrix5x7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

/**
 *
 * @author milos.tygl
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane displayPane;

    @FXML
    private void handleButtonDisplayNumberAction(ActionEvent event) {
        displayString = "-1.234567890-12";
        displayNumber();
    }

    @FXML
    private void handleButtonDisplayNoneAction(ActionEvent event) {
        displayAllSegments(false);
    }

    @FXML
    private void handleButtonDisplayAllAction(ActionEvent event) {
        displayAllSegments(true);
    }

    private String displayString;

    /**
     *
     * @param pos
     * @return
     */
    private char digitFromDisplayString(int pos) {
        if (pos < 0) {
            return ' ';
        }
        if (displayString == null) {
            return ' ';
        }
        if (displayString.length() == 0) {
            return ' ';
        }
        if (displayString.length() < pos + 1) {
            return ' ';
        }
        char displayDigit = displayString.charAt(pos);
        return displayDigit;
    }

    /**
     *
     */
    private void displayNumber() {
        ObservableList observableListDisplayPane = displayPane.getChildren();
        Object[] objectDisplayPane = observableListDisplayPane.toArray();
        int displayStringIndex = -1;

        for (Object objectDigitPane : objectDisplayPane) {
            Pane digitPane = (Pane) objectDigitPane;
            ObservableList observableListDigitPane = digitPane.getChildren();
            Object[] objectDigitSegment = observableListDigitPane.toArray();

            Shape shapeDigitSegmentR1C1 = (Shape) objectDigitSegment[0];
            Shape shapeDigitSegmentR1C2 = (Shape) objectDigitSegment[1];
            Shape shapeDigitSegmentR1C3 = (Shape) objectDigitSegment[2];
            Shape shapeDigitSegmentR1C4 = (Shape) objectDigitSegment[3];
            Shape shapeDigitSegmentR1C5 = (Shape) objectDigitSegment[4];

            Shape shapeDigitSegmentR2C1 = (Shape) objectDigitSegment[5];
            Shape shapeDigitSegmentR2C2 = (Shape) objectDigitSegment[6];
            Shape shapeDigitSegmentR2C3 = (Shape) objectDigitSegment[7];
            Shape shapeDigitSegmentR2C4 = (Shape) objectDigitSegment[8];
            Shape shapeDigitSegmentR2C5 = (Shape) objectDigitSegment[9];

            Shape shapeDigitSegmentR3C1 = (Shape) objectDigitSegment[10];
            Shape shapeDigitSegmentR3C2 = (Shape) objectDigitSegment[11];
            Shape shapeDigitSegmentR3C3 = (Shape) objectDigitSegment[12];
            Shape shapeDigitSegmentR3C4 = (Shape) objectDigitSegment[13];
            Shape shapeDigitSegmentR3C5 = (Shape) objectDigitSegment[14];

            Shape shapeDigitSegmentR4C1 = (Shape) objectDigitSegment[15];
            Shape shapeDigitSegmentR4C2 = (Shape) objectDigitSegment[16];
            Shape shapeDigitSegmentR4C3 = (Shape) objectDigitSegment[17];
            Shape shapeDigitSegmentR4C4 = (Shape) objectDigitSegment[18];
            Shape shapeDigitSegmentR4C5 = (Shape) objectDigitSegment[19];

            Shape shapeDigitSegmentR5C1 = (Shape) objectDigitSegment[20];
            Shape shapeDigitSegmentR5C2 = (Shape) objectDigitSegment[21];
            Shape shapeDigitSegmentR5C3 = (Shape) objectDigitSegment[22];
            Shape shapeDigitSegmentR5C4 = (Shape) objectDigitSegment[23];
            Shape shapeDigitSegmentR5C5 = (Shape) objectDigitSegment[24];

            Shape shapeDigitSegmentR6C1 = (Shape) objectDigitSegment[25];
            Shape shapeDigitSegmentR6C2 = (Shape) objectDigitSegment[26];
            Shape shapeDigitSegmentR6C3 = (Shape) objectDigitSegment[27];
            Shape shapeDigitSegmentR6C4 = (Shape) objectDigitSegment[28];
            Shape shapeDigitSegmentR6C5 = (Shape) objectDigitSegment[29];

            Shape shapeDigitSegmentR7C1 = (Shape) objectDigitSegment[30];
            Shape shapeDigitSegmentR7C2 = (Shape) objectDigitSegment[31];
            Shape shapeDigitSegmentR7C3 = (Shape) objectDigitSegment[32];
            Shape shapeDigitSegmentR7C4 = (Shape) objectDigitSegment[33];
            Shape shapeDigitSegmentR7C5 = (Shape) objectDigitSegment[34];

            displayStringIndex++;
            char cx = digitFromDisplayString(displayStringIndex);
            LedDigit ledDigit = new LedDigit(cx);

            shapeDigitSegmentR1C1.setVisible(ledDigit.isSegmentR1C1());
            shapeDigitSegmentR1C2.setVisible(ledDigit.isSegmentR1C2());
            shapeDigitSegmentR1C3.setVisible(ledDigit.isSegmentR1C3());
            shapeDigitSegmentR1C4.setVisible(ledDigit.isSegmentR1C4());
            shapeDigitSegmentR1C5.setVisible(ledDigit.isSegmentR1C5());

            shapeDigitSegmentR2C1.setVisible(ledDigit.isSegmentR2C1());
            shapeDigitSegmentR2C2.setVisible(ledDigit.isSegmentR2C2());
            shapeDigitSegmentR2C3.setVisible(ledDigit.isSegmentR2C3());
            shapeDigitSegmentR2C4.setVisible(ledDigit.isSegmentR2C4());
            shapeDigitSegmentR2C5.setVisible(ledDigit.isSegmentR2C5());

            shapeDigitSegmentR3C1.setVisible(ledDigit.isSegmentR3C1());
            shapeDigitSegmentR3C2.setVisible(ledDigit.isSegmentR3C2());
            shapeDigitSegmentR3C3.setVisible(ledDigit.isSegmentR3C3());
            shapeDigitSegmentR3C4.setVisible(ledDigit.isSegmentR3C4());
            shapeDigitSegmentR3C5.setVisible(ledDigit.isSegmentR3C5());

            shapeDigitSegmentR4C1.setVisible(ledDigit.isSegmentR4C1());
            shapeDigitSegmentR4C2.setVisible(ledDigit.isSegmentR4C2());
            shapeDigitSegmentR4C3.setVisible(ledDigit.isSegmentR4C3());
            shapeDigitSegmentR4C4.setVisible(ledDigit.isSegmentR4C4());
            shapeDigitSegmentR4C5.setVisible(ledDigit.isSegmentR4C5());

            shapeDigitSegmentR5C1.setVisible(ledDigit.isSegmentR5C1());
            shapeDigitSegmentR5C2.setVisible(ledDigit.isSegmentR5C2());
            shapeDigitSegmentR5C3.setVisible(ledDigit.isSegmentR5C3());
            shapeDigitSegmentR5C4.setVisible(ledDigit.isSegmentR5C4());
            shapeDigitSegmentR5C5.setVisible(ledDigit.isSegmentR5C5());

            shapeDigitSegmentR6C1.setVisible(ledDigit.isSegmentR6C1());
            shapeDigitSegmentR6C2.setVisible(ledDigit.isSegmentR6C2());
            shapeDigitSegmentR6C3.setVisible(ledDigit.isSegmentR6C3());
            shapeDigitSegmentR6C4.setVisible(ledDigit.isSegmentR6C4());
            shapeDigitSegmentR6C5.setVisible(ledDigit.isSegmentR6C5());

            shapeDigitSegmentR7C1.setVisible(ledDigit.isSegmentR7C1());
            shapeDigitSegmentR7C2.setVisible(ledDigit.isSegmentR7C2());
            shapeDigitSegmentR7C3.setVisible(ledDigit.isSegmentR7C3());
            shapeDigitSegmentR7C4.setVisible(ledDigit.isSegmentR7C4());
            shapeDigitSegmentR7C5.setVisible(ledDigit.isSegmentR7C5());
        }
    }

    /**
     *
     */
    private void displayAllSegments(boolean isSegmentVisible) {
        ObservableList observableListDisplayPane = displayPane.getChildren();
        Object[] objectDisplayPane = observableListDisplayPane.toArray();
        int displayStringIndex = -1;

        for (Object objectDigitPane : objectDisplayPane) {
            Pane digitPane = (Pane) objectDigitPane;
            ObservableList observableListDigitPane = digitPane.getChildren();
            Object[] objectDigitSegment = observableListDigitPane.toArray();

            Shape shapeDigitSegmentR1C1 = (Shape) objectDigitSegment[0];
            Shape shapeDigitSegmentR1C2 = (Shape) objectDigitSegment[1];
            Shape shapeDigitSegmentR1C3 = (Shape) objectDigitSegment[2];
            Shape shapeDigitSegmentR1C4 = (Shape) objectDigitSegment[3];
            Shape shapeDigitSegmentR1C5 = (Shape) objectDigitSegment[4];

            Shape shapeDigitSegmentR2C1 = (Shape) objectDigitSegment[5];
            Shape shapeDigitSegmentR2C2 = (Shape) objectDigitSegment[6];
            Shape shapeDigitSegmentR2C3 = (Shape) objectDigitSegment[7];
            Shape shapeDigitSegmentR2C4 = (Shape) objectDigitSegment[8];
            Shape shapeDigitSegmentR2C5 = (Shape) objectDigitSegment[9];

            Shape shapeDigitSegmentR3C1 = (Shape) objectDigitSegment[10];
            Shape shapeDigitSegmentR3C2 = (Shape) objectDigitSegment[11];
            Shape shapeDigitSegmentR3C3 = (Shape) objectDigitSegment[12];
            Shape shapeDigitSegmentR3C4 = (Shape) objectDigitSegment[13];
            Shape shapeDigitSegmentR3C5 = (Shape) objectDigitSegment[14];

            Shape shapeDigitSegmentR4C1 = (Shape) objectDigitSegment[15];
            Shape shapeDigitSegmentR4C2 = (Shape) objectDigitSegment[16];
            Shape shapeDigitSegmentR4C3 = (Shape) objectDigitSegment[17];
            Shape shapeDigitSegmentR4C4 = (Shape) objectDigitSegment[18];
            Shape shapeDigitSegmentR4C5 = (Shape) objectDigitSegment[19];

            Shape shapeDigitSegmentR5C1 = (Shape) objectDigitSegment[20];
            Shape shapeDigitSegmentR5C2 = (Shape) objectDigitSegment[21];
            Shape shapeDigitSegmentR5C3 = (Shape) objectDigitSegment[22];
            Shape shapeDigitSegmentR5C4 = (Shape) objectDigitSegment[23];
            Shape shapeDigitSegmentR5C5 = (Shape) objectDigitSegment[24];

            Shape shapeDigitSegmentR6C1 = (Shape) objectDigitSegment[25];
            Shape shapeDigitSegmentR6C2 = (Shape) objectDigitSegment[26];
            Shape shapeDigitSegmentR6C3 = (Shape) objectDigitSegment[27];
            Shape shapeDigitSegmentR6C4 = (Shape) objectDigitSegment[28];
            Shape shapeDigitSegmentR6C5 = (Shape) objectDigitSegment[29];

            Shape shapeDigitSegmentR7C1 = (Shape) objectDigitSegment[30];
            Shape shapeDigitSegmentR7C2 = (Shape) objectDigitSegment[31];
            Shape shapeDigitSegmentR7C3 = (Shape) objectDigitSegment[32];
            Shape shapeDigitSegmentR7C4 = (Shape) objectDigitSegment[33];
            Shape shapeDigitSegmentR7C5 = (Shape) objectDigitSegment[34];

            displayStringIndex++;
            char cx = digitFromDisplayString(displayStringIndex);
            LedDigit ledDigit = new LedDigit(cx);

            shapeDigitSegmentR1C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR1C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR1C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR1C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR1C5.setVisible(isSegmentVisible);

            shapeDigitSegmentR2C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR2C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR2C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR2C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR2C5.setVisible(isSegmentVisible);

            shapeDigitSegmentR3C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR3C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR3C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR3C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR3C5.setVisible(isSegmentVisible);

            shapeDigitSegmentR4C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR4C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR4C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR4C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR4C5.setVisible(isSegmentVisible);

            shapeDigitSegmentR5C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR5C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR5C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR5C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR5C5.setVisible(isSegmentVisible);

            shapeDigitSegmentR6C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR6C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR6C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR6C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR6C5.setVisible(isSegmentVisible);

            shapeDigitSegmentR7C1.setVisible(isSegmentVisible);
            shapeDigitSegmentR7C2.setVisible(isSegmentVisible);
            shapeDigitSegmentR7C3.setVisible(isSegmentVisible);
            shapeDigitSegmentR7C4.setVisible(isSegmentVisible);
            shapeDigitSegmentR7C5.setVisible(isSegmentVisible);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        displayAllSegments(false);
    }

}
