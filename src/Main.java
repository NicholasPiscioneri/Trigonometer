import javax.swing.SwingUtilities;
// This project took roughly 2 days to complete, im sure there are more efficient ways of calculating everything,
// but it feels more fool-proof if every possible user input case is accounted for rather than a blanket rule that would
// have taken a longer time to complete (I made this program for myself to use in engineering homework/tests, a little
// internal tool, so as long as im confident in how it works it will be fine) - Nick
public class Main {
    public static void main(String[] args) {
        // Instruct Swing to execute the createAndShowGUI method
        SwingUtilities.invokeLater(JFrame::createAndShowGUI);
    }
}
