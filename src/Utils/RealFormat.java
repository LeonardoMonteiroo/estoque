package Utils;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class RealFormat extends PlainDocument {

    private static final NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) {
            return;
        }

        String currentText = getText(0, getLength());
        String newText = currentText.substring(0, offs) + str + currentText.substring(offs);
        String digitsOnly = newText.replaceAll("[^0-9]", "");

        if (digitsOnly.length() > 15) {
            return;
        }

        super.remove(0, getLength());
        if (digitsOnly.isEmpty()) {
            super.insertString(0, realFormat.format(0), a);
        } else {
            StringBuilder builder = new StringBuilder(digitsOnly);
            while (builder.length() < 3) {
                builder.insert(0, '0');
            }
            builder.insert(builder.length() - 2, ',');
            String formattedText = realFormat.format(Double.parseDouble(builder.toString().replace(',', '.')));
            super.insertString(0, formattedText, a);
        }
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        String currentText = getText(0, getLength());
        String newText = currentText.substring(0, offs) + currentText.substring(offs + len);
        String digitsOnly = newText.replaceAll("[^0-9]", "");

        super.remove(0, getLength());
        if (digitsOnly.isEmpty()) {
            super.insertString(0, realFormat.format(0), null);
        } else {
            StringBuilder builder = new StringBuilder(digitsOnly);
            while (builder.length() < 3) {
                builder.insert(0, '0');
            }
            builder.insert(builder.length() - 2, ',');
            String formattedText = realFormat.format(Double.parseDouble(builder.toString().replace(',', '.')));
            super.insertString(0, formattedText, null);
        }
    }
}
