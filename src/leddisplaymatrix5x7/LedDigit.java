package leddisplaymatrix5x7;

/**
 *
 * @author milos.tygl
 */
public class LedDigit {

    private boolean segmentR1C1;
    private boolean segmentR1C2;
    private boolean segmentR1C3;
    private boolean segmentR1C4;
    private boolean segmentR1C5;

    private boolean segmentR2C1;
    private boolean segmentR2C2;
    private boolean segmentR2C3;
    private boolean segmentR2C4;
    private boolean segmentR2C5;

    private boolean segmentR3C1;
    private boolean segmentR3C2;
    private boolean segmentR3C3;
    private boolean segmentR3C4;
    private boolean segmentR3C5;

    private boolean segmentR4C1;
    private boolean segmentR4C2;
    private boolean segmentR4C3;
    private boolean segmentR4C4;
    private boolean segmentR4C5;

    private boolean segmentR5C1;
    private boolean segmentR5C2;
    private boolean segmentR5C3;
    private boolean segmentR5C4;
    private boolean segmentR5C5;

    private boolean segmentR6C1;
    private boolean segmentR6C2;
    private boolean segmentR6C3;
    private boolean segmentR6C4;
    private boolean segmentR6C5;

    private boolean segmentR7C1;
    private boolean segmentR7C2;
    private boolean segmentR7C3;
    private boolean segmentR7C4;
    private boolean segmentR7C5;

    /**
     *
     * @param c
     */
    LedDigit(char c) {
        displayDigitNone();
        switch (c) {
            case ' ':
                displaySpace();
                break;
            case '-':
                displayMinus();
                break;
            case '.':
                displayDecimalPoint();
                break;
            case '0':
                displayDigit0();
                break;
            case '1':
                displayDigit1();
                break;
            case '2':
                displayDigit2();
                break;
            case '3':
                displayDigit3();
                break;
            case '4':
                displayDigit4();
                break;
            case '5':
                displayDigit5();
                break;
            case '6':
                displayDigit6();
                break;
            case '7':
                displayDigit7();
                break;
            case '8':
                displayDigit8();
                break;
            case '9':
                displayDigit9();
                break;
            default:
                break;
        }
    }

    /**
     *
     */
    private void displayDigitNone() {

        segmentR1C1 = false;
        segmentR1C2 = false;
        segmentR1C3 = false;
        segmentR1C4 = false;
        segmentR1C5 = false;

        segmentR2C1 = false;
        segmentR2C2 = false;
        segmentR2C3 = false;
        segmentR2C4 = false;
        segmentR2C5 = false;

        segmentR3C1 = false;
        segmentR3C2 = false;
        segmentR3C3 = false;
        segmentR3C4 = false;
        segmentR3C5 = false;

        segmentR4C1 = false;
        segmentR4C2 = false;
        segmentR4C3 = false;
        segmentR4C4 = false;
        segmentR4C5 = false;

        segmentR5C1 = false;
        segmentR5C2 = false;
        segmentR5C3 = false;
        segmentR5C4 = false;
        segmentR5C5 = false;

        segmentR6C1 = false;
        segmentR6C2 = false;
        segmentR6C3 = false;
        segmentR6C4 = false;
        segmentR6C5 = false;

        segmentR7C1 = false;
        segmentR7C2 = false;
        segmentR7C3 = false;
        segmentR7C4 = false;
        segmentR7C5 = false;
    }

    /**
     *
     */
    private void displaySpace() {
    }

    /**
     *
     */
    private void displayMinus() {
        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;
    }

    /**
     *
     */
    private void displayDecimalPoint() {
        segmentR6C3 = true;
        segmentR6C4 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit0() {
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;

        segmentR2C1 = true;
        segmentR2C5 = true;

        segmentR3C1 = true;
        segmentR3C4 = true;
        segmentR3C5 = true;

        segmentR4C1 = true;
        segmentR4C3 = true;
        segmentR4C5 = true;

        segmentR5C1 = true;
        segmentR5C2 = true;
        segmentR5C5 = true;

        segmentR6C1 = true;
        segmentR6C5 = true;

        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit1() {
        segmentR1C3 = true;

        segmentR2C2 = true;
        segmentR2C3 = true;

        segmentR3C3 = true;

        segmentR4C3 = true;

        segmentR5C3 = true;

        segmentR6C3 = true;

        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit2() {
        segmentR1C1 = true;
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;

        segmentR2C5 = true;

        segmentR3C5 = true;

        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;

        segmentR5C1 = true;

        segmentR6C1 = true;

        segmentR7C1 = true;
        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
        segmentR7C5 = true;
    }

    /**
     *
     */
    private void displayDigit3() {
        segmentR1C1 = true;
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;

        segmentR2C5 = true;

        segmentR3C5 = true;

        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;

        segmentR5C5 = true;

        segmentR6C5 = true;

        segmentR7C1 = true;
        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit4() {
        segmentR1C1 = true;
        segmentR1C5 = true;

        segmentR2C1 = true;
        segmentR2C5 = true;

        segmentR3C1 = true;
        segmentR3C5 = true;

        segmentR4C1 = true;
        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;
        segmentR4C5 = true;

        segmentR5C5 = true;

        segmentR6C5 = true;

        segmentR7C5 = true;
    }

    /**
     *
     */
    private void displayDigit5() {
        segmentR1C1 = true;
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;
        segmentR1C5 = true;

        segmentR2C1 = true;

        segmentR3C1 = true;

        segmentR4C1 = true;
        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;

        segmentR5C5 = true;

        segmentR6C5 = true;

        segmentR7C1 = true;
        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit6() {
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;

        segmentR2C1 = true;

        segmentR3C1 = true;

        segmentR4C1 = true;
        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;

        segmentR5C1 = true;
        segmentR5C5 = true;

        segmentR6C1 = true;
        segmentR6C5 = true;

        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit7() {
        segmentR1C1 = true;
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;
        segmentR1C5 = true;

        segmentR2C5 = true;

        segmentR3C4 = true;

        segmentR4C3 = true;

        segmentR5C3 = true;

        segmentR6C3 = true;

        segmentR7C3 = true;
    }

    /**
     *
     */
    private void displayDigit8() {
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;

        segmentR2C1 = true;
        segmentR2C5 = true;

        segmentR3C1 = true;
        segmentR3C5 = true;

        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;

        segmentR5C1 = true;
        segmentR5C5 = true;

        segmentR6C1 = true;
        segmentR6C5 = true;

        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    /**
     *
     */
    private void displayDigit9() {
        segmentR1C2 = true;
        segmentR1C3 = true;
        segmentR1C4 = true;

        segmentR2C1 = true;
        segmentR2C5 = true;

        segmentR3C1 = true;
        segmentR3C5 = true;

        segmentR4C2 = true;
        segmentR4C3 = true;
        segmentR4C4 = true;
        segmentR4C5 = true;

        segmentR5C5 = true;

        segmentR6C5 = true;

        segmentR7C2 = true;
        segmentR7C3 = true;
        segmentR7C4 = true;
    }

    public boolean isSegmentR1C1() {
        return segmentR1C1;
    }

    public boolean isSegmentR1C2() {
        return segmentR1C2;
    }

    public boolean isSegmentR1C3() {
        return segmentR1C3;
    }

    public boolean isSegmentR1C4() {
        return segmentR1C4;
    }

    public boolean isSegmentR1C5() {
        return segmentR1C5;
    }

    public boolean isSegmentR2C1() {
        return segmentR2C1;
    }

    public boolean isSegmentR2C2() {
        return segmentR2C2;
    }

    public boolean isSegmentR2C3() {
        return segmentR2C3;
    }

    public boolean isSegmentR2C4() {
        return segmentR2C4;
    }

    public boolean isSegmentR2C5() {
        return segmentR2C5;
    }

    public boolean isSegmentR3C1() {
        return segmentR3C1;
    }

    public boolean isSegmentR3C2() {
        return segmentR3C2;
    }

    public boolean isSegmentR3C3() {
        return segmentR3C3;
    }

    public boolean isSegmentR3C4() {
        return segmentR3C4;
    }

    public boolean isSegmentR3C5() {
        return segmentR3C5;
    }

    public boolean isSegmentR4C1() {
        return segmentR4C1;
    }

    public boolean isSegmentR4C2() {
        return segmentR4C2;
    }

    public boolean isSegmentR4C3() {
        return segmentR4C3;
    }

    public boolean isSegmentR4C4() {
        return segmentR4C4;
    }

    public boolean isSegmentR4C5() {
        return segmentR4C5;
    }

    public boolean isSegmentR5C1() {
        return segmentR5C1;
    }

    public boolean isSegmentR5C2() {
        return segmentR5C2;
    }

    public boolean isSegmentR5C3() {
        return segmentR5C3;
    }

    public boolean isSegmentR5C4() {
        return segmentR5C4;
    }

    public boolean isSegmentR5C5() {
        return segmentR5C5;
    }

    public boolean isSegmentR6C1() {
        return segmentR6C1;
    }

    public boolean isSegmentR6C2() {
        return segmentR6C2;
    }

    public boolean isSegmentR6C3() {
        return segmentR6C3;
    }

    public boolean isSegmentR6C4() {
        return segmentR6C4;
    }

    public boolean isSegmentR6C5() {
        return segmentR6C5;
    }

    public boolean isSegmentR7C1() {
        return segmentR7C1;
    }

    public boolean isSegmentR7C2() {
        return segmentR7C2;
    }

    public boolean isSegmentR7C3() {
        return segmentR7C3;
    }

    public boolean isSegmentR7C4() {
        return segmentR7C4;
    }

    public boolean isSegmentR7C5() {
        return segmentR7C5;
    }

}
