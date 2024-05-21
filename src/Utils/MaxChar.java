package Utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MaxChar extends PlainDocument {

    private int maxChar;

    public MaxChar(int maxChar) {
        super();
        this.maxChar = maxChar;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if ((getLength() + str.length()) <= maxChar) {
            super.insertString(offs, str, a);
        }
    }
}
