import javax.swing.*;
import java.awt.*;

public class RoundedTextArea extends JTextArea {
    private final int cornerRadius;

    public RoundedTextArea(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        setOpaque(false);
        setLineWrap(true);
        setWrapStyleWord(true);
        setMargin(new Insets(2, 10, 10, 10)); // Optional: Add some padding to the text area
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();

        g2.setColor(getBackground());
        g2.fillRoundRect(x, y, width, height, cornerRadius, cornerRadius);

        super.paintComponent(g2);

        g2.dispose();
    }
}