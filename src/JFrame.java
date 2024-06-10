import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame {
    public static void jFrame(String[] args) {
        SwingUtilities.invokeLater(JFrame::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        javax.swing.JFrame frame = new javax.swing.JFrame("Trigonometer");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        // Define a container (for ease of coding)
        Container container = frame.getContentPane();

        // Set the background color of the window
        container.setBackground(Color.decode("#131516"));

        // Set the size and position of the window
        int width = 1000;
        int height = 650; // Calculate the height based on a 9:16 aspect ratio
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setResizable(false);


        // Text Area for Watermark
        JTextArea watermark = new JTextArea();
        watermark.setBounds(10,590,200,20);
        watermark.setBackground(Color.decode("#131516")); // Set background color
        watermark.setForeground(Color.decode("#373D3F")); // Set text color
        watermark.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        watermark.setFocusable(false);
        watermark.setEditable(false);
        watermark.setText("V1.0 - By Nicholas Piscioneri");
        container.add(watermark);


        /* Simultaneous input and output */

        // Text Area for Side A (left side) on Triangle 1
        JTextArea textAreaTriangle1SideA = new RoundedTextArea(10);
        textAreaTriangle1SideA.setBounds(120,240,70,20);
        textAreaTriangle1SideA.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle1SideA.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1SideA.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1SideA.setText("");
        container.add(textAreaTriangle1SideA);

        // Text Area for Side B (right side) on Triangle 1
        JTextArea textAreaTriangle1SideB = new RoundedTextArea(10);
        textAreaTriangle1SideB.setBounds(380,240,70,20);
        textAreaTriangle1SideB.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle1SideB.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1SideB.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1SideB.setText("");
        container.add(textAreaTriangle1SideB);

        // Text Area for Side C (bottom side) on Triangle 1
        JTextArea textAreaTriangle1SideC = new RoundedTextArea(10);
        textAreaTriangle1SideC.setBounds(250,415,70,20);
        textAreaTriangle1SideC.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle1SideC.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1SideC.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1SideC.setText("");
        container.add(textAreaTriangle1SideC);

        // Text Area for Angle A (bottom right angle) on Triangle 1
        JTextArea textAreaTriangle1AngleA = new RoundedTextArea(10);
        textAreaTriangle1AngleA.setBounds(337,365,70,20);
        textAreaTriangle1AngleA.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle1AngleA.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1AngleA.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1AngleA.setText("");
        container.add(textAreaTriangle1AngleA);

        // Text Area for Angle B (bottom left angle) on Triangle 1
        JTextArea textAreaTriangle1AngleB = new RoundedTextArea(10);
        textAreaTriangle1AngleB.setBounds(165,365,70,20);
        textAreaTriangle1AngleB.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle1AngleB.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1AngleB.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1AngleB.setText("");
        container.add(textAreaTriangle1AngleB);

        // Text Area for Angle C (top angle) on Triangle 1
        JTextArea textAreaTriangle1AngleC = new RoundedTextArea(10);
        textAreaTriangle1AngleC.setBounds(250,185,70,20);
        textAreaTriangle1AngleC.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle1AngleC.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1AngleC.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1AngleC.setText("");
        container.add(textAreaTriangle1AngleC);

        // Text Area for Triangle Area on Triangle 1
        JTextArea textAreaTriangle1Area = new JTextArea();
        textAreaTriangle1Area.setBounds(250,285,70,20);
        textAreaTriangle1Area.setBackground(Color.decode("#131516")); // Set background color
        textAreaTriangle1Area.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle1Area.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle1Area.setEditable(false);
        textAreaTriangle1Area.setFocusable(false);
        textAreaTriangle1Area.setText("");
        container.add(textAreaTriangle1Area);

        // Reset Button for Triangle 1 (left triangle)
        JButton resetTriangle1Button = new JButton("Reset");
        resetTriangle1Button.setBounds(234, 505, 100, 30);
        resetTriangle1Button.setBackground(Color.decode("#373D3F")); // Set button color
        resetTriangle1Button.setForeground(Color.decode("#F2F3F4")); // Set text color
        resetTriangle1Button.setFocusPainted(false); // Make it look cleaner
        resetTriangle1Button.setBorderPainted(false); // Make it look cleaner
        container.add(resetTriangle1Button);
        resetTriangle1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaTriangle1SideA.setText("");
                textAreaTriangle1SideB.setText("");
                textAreaTriangle1SideC.setText("");
                textAreaTriangle1AngleA.setText("");
                textAreaTriangle1AngleB.setText("");
                textAreaTriangle1AngleC.setText("");
                textAreaTriangle1Area.setText("");
            }
        });

        // Calculate Button for Triangle 1 (left triangle)
        JButton calculateTriangle1Button = new JButton("Calculate");
        calculateTriangle1Button.setBounds(234, 470, 100, 30);
        calculateTriangle1Button.setBackground(Color.decode("#373D3F")); // Set button color
        calculateTriangle1Button.setForeground(Color.decode("#F2F3F4")); // Set text color
        calculateTriangle1Button.setFocusPainted(false); // Make it look cleaner
        calculateTriangle1Button.setBorderPainted(false); // Make it look cleaner
        container.add(calculateTriangle1Button);
        calculateTriangle1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tasks to perform when the update button is clicked

                // Declare variables before the if statements
                double sideA;
                double sideB;
                double sideC;
                double angleA;
                double angleB;
                double angleC;

                // Get all values and convert them from strings to doubles, if empty, convert to zero
                if ((textAreaTriangle1SideA.getText().trim()).isEmpty()) {
                    sideA = 0;
                } else {
                    sideA = Double.parseDouble(textAreaTriangle1SideA.getText().trim());
                }
                if ((textAreaTriangle1SideB.getText().trim()).isEmpty()) {
                    sideB = 0;
                } else {
                    sideB = Double.parseDouble(textAreaTriangle1SideB.getText().trim());
                }
                if ((textAreaTriangle1SideC.getText().trim()).isEmpty()) {
                    sideC = 0;
                } else {
                    sideC = Double.parseDouble(textAreaTriangle1SideC.getText().trim());
                }
                if ((textAreaTriangle1AngleA.getText().trim()).isEmpty()) {
                    angleA = 0;
                } else {
                    angleA = Double.parseDouble(textAreaTriangle1AngleA.getText().trim());
                }
                if ((textAreaTriangle1AngleB.getText().trim()).isEmpty()) {
                    angleB = 0;
                } else {
                    angleB = Double.parseDouble(textAreaTriangle1AngleB.getText().trim());
                }
                if ((textAreaTriangle1AngleC.getText().trim()).isEmpty()) {
                    angleC = 0;
                } else {
                    angleC = Double.parseDouble(textAreaTriangle1AngleC.getText().trim());
                }

                /* Use known values to compute unknown values */

                // Angle checker, i.e. sides all empty, 2 known angles 1 unknown angle
                if ((sideA == 0) && (sideB == 0) && (sideC == 0) && (angleA != 0) && (angleC != 0) && (angleB == 0)) {
                    angleB = 180 - angleC - angleA;
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB));
                }
                // Missing angle c
                else if ((sideA == 0) && (sideB == 0) && (sideC == 0) && (angleA != 0) && (angleC == 0) && (angleB != 0)) {
                    angleC = 180 - angleB - angleA;
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC));
                }
                // Missing angle a
                else if ((sideA == 0) && (sideB == 0) && (sideC == 0) && (angleA == 0) && (angleC != 0) && (angleB != 0)) {
                    angleA = 180 - angleB - angleC;
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA));
                }
                // If there is only one unknown
                // Missing angle b
                else if ((sideA != 0) && (sideB != 0) && (sideC != 0) && (angleA != 0) && (angleC != 0) && (angleB == 0)) {
                    angleB = 180 - angleC - angleA;
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB));
                }
                // Missing angle c
                else if ((sideA != 0) && (sideB != 0) && (sideC != 0) && (angleA != 0) && (angleC == 0) && (angleB != 0)) {
                    angleC = 180 - angleB - angleA;
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC));
                }
                // Missing angle a
                else if ((sideA != 0) && (sideB != 0) && (sideC != 0) && (angleA == 0) && (angleC != 0) && (angleB != 0)) {
                    angleA = 180 - angleB - angleC;
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA));
                }

                // Check for cosine rule, then compute rest of triangle
                // Rare case, all sides known, find the angles
                else if ((sideA != 0) && (sideB != 0) && (sideC != 0)) {
                    angleA = AngleCosineRule.angleCosineRule(sideB, sideC, sideA); // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    angleB = AngleCosineRule.angleCosineRule(sideA, sideC, sideB); // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    angleC = AngleCosineRule.angleCosineRule(sideB, sideA, sideC); // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                }
                // Bottom left angle and sides known, find other angles and sides
                else if ((sideA != 0) && (sideC != 0) && (angleB != 0)) {
                    sideB = SideCosineRule.sideCosineRule(sideA, sideC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                    angleC = AngleCosineRule.angleCosineRule(sideA, sideB, sideC); // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    angleA = AngleCosineRule.angleCosineRule(sideC, sideB, sideA); // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                }
                // Top middle angle and sides known, find other angles and sides
                else if ((sideA != 0) && (angleC != 0) && (sideB != 0)) {
                    sideC = SideCosineRule.sideCosineRule(sideA, sideB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                    angleB = AngleCosineRule.angleCosineRule(sideA, sideC, sideB); // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    angleA = AngleCosineRule.angleCosineRule(sideC, sideB, sideA); // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                }
                // Bottom right angle and sides known, find other angles and sides
                else if ((angleA != 0) && (sideC != 0) && (sideB != 0)) {
                    sideA = SideCosineRule.sideCosineRule(sideC, sideB, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                    angleB = AngleCosineRule.angleCosineRule(sideA, sideC, sideB); // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    angleC = AngleCosineRule.angleCosineRule(sideA, sideB, sideC); // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                }

                // Check for sine rule, then compute rest of triangle
                // Left side and left angles known, find final angle and missing sides
                else if ((angleB != 0) && (angleC != 0) && (sideA != 0)) {
                    angleA = 180 - angleB - angleC; // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    sideC = SideSineRule.sideSineRule(sideA, angleA, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                    sideB = SideCosineRule.sideCosineRule(sideA, sideC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                }
                // Right side and right angles known, find final angle and missing sides
                else if ((angleC != 0) && (angleA != 0) && (sideB != 0)) {
                    angleB = 180 - angleC - angleA; // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    sideC = SideSineRule.sideSineRule(sideB, angleB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                    sideA = SideCosineRule.sideCosineRule(sideB, sideC, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }
                // Bottom side and bottom angles known, find final angle and missing sides
                else if ((angleB != 0) && (angleA != 0) && (sideC != 0)) {
                    angleC = 180 - angleA - angleB; // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    sideA = SideSineRule.sideSineRule(sideC, angleC, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                    sideB = SideCosineRule.sideCosineRule(sideA, sideC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                }


                // 2 Sides and 1 Angle known and none of the above cases, i.e. must use sine rule first
                // Right sides known, bottom left angle known
                else if ((angleB != 0) && (sideB != 0) && (sideC != 0)) {
                    angleC = AngleSineRule.angleSineRule(sideB, angleB, sideC); // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    angleA = 180 - angleB - angleC; // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    sideA = SideCosineRule.sideCosineRule(sideC, sideB, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }
                // Top sides known, bottom left angle known
                else if ((angleB != 0) && (sideB != 0) && (sideA != 0)) {
                    angleA = AngleSineRule.angleSineRule(sideB, angleB, sideA); // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    angleC = 180 - angleB - angleA; // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    sideC = SideCosineRule.sideCosineRule(sideA, sideB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                }
                // Right sides known, top angle known
                else if ((angleC != 0) && (sideC != 0) && (sideB != 0)) {
                    angleB = AngleSineRule.angleSineRule(sideC, angleC, sideB); // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    angleA = 180 - angleB - angleC; // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    sideA = SideCosineRule.sideCosineRule(sideC, sideB, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }
                // Left sides known, top angle known
                else if ((angleC != 0) && (sideC != 0) && (sideA != 0)) {
                    angleA = AngleSineRule.angleSineRule(sideC, angleC, sideA); // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    angleB = 180 - angleA - angleC; // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    sideB = SideCosineRule.sideCosineRule(sideA, sideC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                }
                // Top sides known, bottom right angle known
                else if ((angleA != 0) && (sideA != 0) && (sideB != 0)) {
                    angleB = AngleSineRule.angleSineRule(sideA, angleA, sideB); // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    angleC = 180 - angleA - angleB; // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    sideC = SideCosineRule.sideCosineRule(sideA, sideB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                }
                // Left sides known, bottom right angle known
                else if ((angleA != 0) && (sideA != 0) && (sideC != 0)) {
                    angleC = AngleSineRule.angleSineRule(sideA, angleA, sideC); // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    angleB = 180 - angleA - angleC; // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    sideB = SideCosineRule.sideCosineRule(sideA, sideC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                }

                // 1 Side and 2 Angles known and none of the above cases, i.e. must use sine rule first
                // Bottom side known, top left angles known
                else if ((sideC != 0) && (angleC != 0) && (angleB != 0)) {
                    angleA = 180 - angleB - angleC; // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    sideB = SideSineRule.sideSineRule(sideC, angleC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                    sideA = SideCosineRule.sideCosineRule(sideC, sideB, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }
                // Bottom side known, top right angles known
                else if ((sideC != 0) && (angleC != 0) && (angleA != 0)) {
                    angleB = 180 - angleA - angleC; // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    sideB = SideSineRule.sideSineRule(sideC, angleC, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                    sideA = SideCosineRule.sideCosineRule(sideC, sideB, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }
                // Left side known, top right angles known
                else if ((sideA != 0) && (angleC != 0) && (angleA != 0)) {
                    angleB = 180 - angleA - angleC; // Find Angle B
                    textAreaTriangle1AngleB.setText(String.valueOf(angleB)); // Update Angle B
                    sideB = SideSineRule.sideSineRule(sideA, angleA, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                    sideC = SideCosineRule.sideCosineRule(sideA, sideB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                }
                // Left side known, bottom angles known
                else if ((sideA != 0) && (angleB != 0) && (angleA != 0)) {
                    angleC = 180 - angleA - angleB; // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    sideB = SideSineRule.sideSineRule(sideA, angleA, angleB); // Find Side B
                    textAreaTriangle1SideB.setText(String.valueOf(sideB)); // Update Side B
                    sideC = SideCosineRule.sideCosineRule(sideA, sideB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                }
                // Right side known, top left angles known
                else if ((sideB != 0) && (angleB != 0) && (angleC != 0)) {
                    angleA = 180 - angleC - angleB; // Find Angle A
                    textAreaTriangle1AngleA.setText(String.valueOf(angleA)); // Update Angle A
                    sideC = SideSineRule.sideSineRule(sideB, angleB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                    sideA = SideCosineRule.sideCosineRule(sideB, sideC, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }
                // Right side known, bottom angles known
                else if ((sideB != 0) && (angleB != 0) && (angleA != 0)) {
                    angleC = 180 - angleA - angleB; // Find Angle C
                    textAreaTriangle1AngleC.setText(String.valueOf(angleC)); // Update Angle C
                    sideC = SideSineRule.sideSineRule(sideB, angleB, angleC); // Find Side C
                    textAreaTriangle1SideC.setText(String.valueOf(sideC)); // Update Side C
                    sideA = SideCosineRule.sideCosineRule(sideB, sideC, angleA); // Find Side A
                    textAreaTriangle1SideA.setText(String.valueOf(sideA)); // Update Side A
                }


                // Find and display area of the triangle given all side lengths
                if ((sideA != 0) && (sideB != 0) && (sideC != 0)) {
                    double triangleArea = TriangleAreaCalculator.calculateTriangleArea(sideA, sideB, sideC);
                    textAreaTriangle1Area.setText("Area: " + String.valueOf(triangleArea));
                }
                else {
                    textAreaTriangle1Area.setText(""); // Remove Area
                }
            }
        });



        // Text Area for Side F (bottom side) on Triangle 2
        JTextArea textAreaTriangle2SideF = new RoundedTextArea(10);
        textAreaTriangle2SideF.setBounds(710,415,70,20);
        textAreaTriangle2SideF.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle2SideF.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle2SideF.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle2SideF.setText("");
        container.add(textAreaTriangle2SideF);

        // Text Area for Side E (right side) on Triangle 2
        JTextArea textAreaTriangle2SideE = new RoundedTextArea(10);
        textAreaTriangle2SideE.setBounds(772,240,70,20);
        textAreaTriangle2SideE.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle2SideE.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle2SideE.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle2SideE.setText("");
        container.add(textAreaTriangle2SideE);

        // Text Area for Side D (left side) on Triangle 2
        JTextArea textAreaTriangle2SideD = new RoundedTextArea(10);
        textAreaTriangle2SideD.setBounds(567,240,70,20);
        textAreaTriangle2SideD.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle2SideD.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle2SideD.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle2SideD.setText("");
        container.add(textAreaTriangle2SideD);

        // Text Area for Angle D (bottom right angle) on Triangle 2
        JTextArea textAreaTriangle2AngleD = new RoundedTextArea(10);
        textAreaTriangle2AngleD.setBounds(746,365,70,20);
        textAreaTriangle2AngleD.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle2AngleD.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle2AngleD.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle2AngleD.setText("");
        container.add(textAreaTriangle2AngleD);

        // Text Area for Angle F (top angle) on Triangle 2
        JTextArea textAreaTriangle2AngleF = new RoundedTextArea(10);
        textAreaTriangle2AngleF.setBounds(660,135,70,20);
        textAreaTriangle2AngleF.setBackground(Color.decode("#373D3F")); // Set background color
        textAreaTriangle2AngleF.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle2AngleF.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle2AngleF.setText("");
        container.add(textAreaTriangle2AngleF);

        // Text Area for Triangle Area on Triangle 2
        JTextArea textAreaTriangle2Area = new JTextArea();
        textAreaTriangle2Area.setBounds(685,285,70,20);
        textAreaTriangle2Area.setBackground(Color.decode("#131516")); // Set background color
        textAreaTriangle2Area.setForeground(Color.decode("#F2F3F4")); // Set text color
        textAreaTriangle2Area.setCaretColor(Color.decode("#F2F3F4")); // Set caret color
        textAreaTriangle2Area.setEditable(false);
        textAreaTriangle2Area.setFocusable(false);
        textAreaTriangle2Area.setText("");
        container.add(textAreaTriangle2Area);

        // Reset Button for Triangle 2 (right triangle)
        JButton resetTriangle2Button = new JButton("Reset");
        resetTriangle2Button.setBounds(695, 505, 100, 30);
        resetTriangle2Button.setBackground(Color.decode("#373D3F")); // Set button color
        resetTriangle2Button.setForeground(Color.decode("#F2F3F4")); // Set text color
        resetTriangle2Button.setFocusPainted(false); // Make it look cleaner
        resetTriangle2Button.setBorderPainted(false); // Make it look cleaner
        container.add(resetTriangle2Button);
        resetTriangle2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaTriangle2SideD.setText("");
                textAreaTriangle2SideE.setText("");
                textAreaTriangle2SideF.setText("");
                textAreaTriangle2AngleD.setText("");
                textAreaTriangle2AngleF.setText("");
                textAreaTriangle2Area.setText("");
            }
        });
        // Calculate Button for Triangle 2 (right triangle)
        JButton calculateTriangle2Button = new JButton("Calculate");
        calculateTriangle2Button.setBounds(695, 470, 100, 30);
        calculateTriangle2Button.setBackground(Color.decode("#373D3F")); // Set button color
        calculateTriangle2Button.setForeground(Color.decode("#F2F3F4")); // Set text color
        calculateTriangle2Button.setFocusPainted(false); // Make it look cleaner
        calculateTriangle2Button.setBorderPainted(false); // Make it look cleaner
        container.add(calculateTriangle2Button);
        calculateTriangle2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tasks to perform when the update button is clicked

                // Declare variables before the if statements
                double sideD;
                double sideE;
                double sideF;
                double angleD;
                double angleF;

                // Get all values and convert them from strings to doubles, if empty, convert to zero
                if ((textAreaTriangle2SideD.getText().trim()).isEmpty()) {
                    sideD = 0;
                } else {
                    sideD = Double.parseDouble(textAreaTriangle2SideD.getText().trim());
                }
                if ((textAreaTriangle2SideE.getText().trim()).isEmpty()) {
                    sideE = 0;
                } else {
                    sideE = Double.parseDouble(textAreaTriangle2SideE.getText().trim());
                }
                if ((textAreaTriangle2SideF.getText().trim()).isEmpty()) {
                    sideF = 0;
                } else {
                    sideF = Double.parseDouble(textAreaTriangle2SideF.getText().trim());
                }
                if ((textAreaTriangle2AngleD.getText().trim()).isEmpty()) {
                    angleD = 0;
                } else {
                    angleD = Double.parseDouble(textAreaTriangle2AngleD.getText().trim());
                }
                if ((textAreaTriangle2AngleF.getText().trim()).isEmpty()) {
                    angleF = 0;
                } else {
                    angleF = Double.parseDouble(textAreaTriangle2AngleF.getText().trim());
                }


                /* Use known values to compute unknown values */

                // If an angle is known, find the other angle
                // Angle F is known, Angle D is unknown
                if ((sideD == 0) && (sideE == 0) && (sideF == 0) && (angleD == 0) && (angleF != 0)) {
                    angleD = 90-angleF; // Find Angle D
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                }
                // Angle D is known, Angle F is unknown
                else if ((sideD == 0) && (sideE == 0) && (sideF == 0) && (angleD != 0) && (angleF == 0)) {
                    angleF = 90-angleD; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                }
                // 3 sides are known, find the angles
                // Given Side D, Side E, and Side F, find the angles
                else if ((sideD != 0) && (sideE != 0) && (sideF != 0)) {
                    angleD = (double) Math.round(Math.toDegrees(Math.asin(sideD / sideE)) * 1000) / 1000; // Find Angle D
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                    angleF = 90 - angleD; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                }
                // 2 Sides are known
                // Side D and E known, find the rest
                else if ((sideD != 0) && (sideE != 0) && (sideF == 0)) {
                    sideF = (double) Math.round(Math.sqrt(sideE * sideE - sideD * sideD) * 1000) / 1000; // Find Side F
                    textAreaTriangle2SideF.setText(String.valueOf(sideF)); // Update Side F
                    angleF = (double) Math.round(Math.toDegrees(Math.acos(sideD / sideE)) * 1000) / 1000; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                    angleD = 90-angleF;
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                }
                // Side F and E known, find the rest
                else if ((sideD == 0) && (sideE != 0) && (sideF != 0)) {
                    sideD = (double) Math.round(Math.sqrt(sideE * sideE - sideF * sideF) * 1000) / 1000; // Find Side D
                    textAreaTriangle2SideD.setText(String.valueOf(sideD)); // Update Side D
                    angleF = (double) Math.round(Math.toDegrees(Math.acos(sideD / sideE)) * 1000) / 1000; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                    angleD = 90 - angleF;
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                }
                // Side F and D known, find the rest
                else if ((sideD != 0) && (sideE == 0) && (sideF != 0)) {
                    sideE = (double) Math.round(Math.sqrt(sideD * sideD + sideF * sideF) * 1000) / 1000; // Find Side E
                    textAreaTriangle2SideE.setText(String.valueOf(sideE)); // Update Side E
                    angleF = (double) Math.round(Math.toDegrees(Math.acos(sideD / sideE)) * 1000) / 1000; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                    angleD = 90-angleF;
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                }

                // 1 Side and 1 angle is known
                // Side D and Angle F known, find the rest
                else if ((sideD != 0) && (angleF != 0)) {
                    angleD = 90-angleF; // Find Angle D
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                    sideE = (double) Math.round(sideD / Math.cos(Math.toRadians(angleF)) * 1000) / 1000; // Find Side E
                    textAreaTriangle2SideE.setText(String.valueOf(sideE)); // Update Side E
                    sideF = (double) Math.round(Math.tan(Math.toRadians(angleF)) * sideD * 1000) / 1000; // Find Side F
                    textAreaTriangle2SideF.setText(String.valueOf(sideF)); // Update Side F
                }
                // Given Side D and Angle D, find the rest
                else if ((sideD != 0) && (angleD != 0)) {
                    angleF = 90 - angleD; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                    sideE = Math.round((sideD / Math.sin(Math.toRadians(angleD))) * 1000.0) / 1000.0; // Find Side E
                    textAreaTriangle2SideE.setText(String.valueOf(sideE)); // Update Side E
                    sideF = Math.round((sideD / Math.tan(Math.toRadians(angleD))) * 1000.0) / 1000.0; // Find Side F
                    textAreaTriangle2SideF.setText(String.valueOf(sideF)); // Update Side F
                }
                // Given Side F and Angle F, find the rest
                else if ((sideF != 0) && (angleF != 0)) {
                    angleD = 90 - angleF; // Find Angle D
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                    sideE = Math.round((sideF / Math.sin(Math.toRadians(angleF))) * 1000.0) / 1000.0; // Find Side E
                    textAreaTriangle2SideE.setText(String.valueOf(sideE)); // Update Side E
                    sideD = Math.round((sideF / Math.tan(Math.toRadians(angleF))) * 1000.0) / 1000.0; // Find Side D
                    textAreaTriangle2SideD.setText(String.valueOf(sideD)); // Update Side D
                }
                // Given Side F and Angle D, find the rest
                else if ((sideF != 0) && (angleD != 0)) {
                    angleF = 90 - angleD; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                    sideE = Math.round((sideF / Math.cos(Math.toRadians(angleD))) * 1000.0) / 1000.0; // Find Side E
                    textAreaTriangle2SideE.setText(String.valueOf(sideE)); // Update Side E
                    sideD = Math.round((sideE * Math.sin(Math.toRadians(angleD))) * 1000.0) / 1000.0; // Find Side D
                    textAreaTriangle2SideD.setText(String.valueOf(sideD)); // Update Side D
                }
                // Given Side E and Angle F, find the rest
                else if ((sideE != 0) && (angleF != 0)) {
                    angleD = 90 - angleF; // Find Angle D
                    textAreaTriangle2AngleD.setText(String.valueOf(angleD)); // Update Angle D
                    sideD = Math.round((sideE * Math.cos(Math.toRadians(angleF))) * 1000.0) / 1000.0; // Find Side D
                    textAreaTriangle2SideD.setText(String.valueOf(sideD)); // Update Side D
                    sideF = Math.round((sideE * Math.sin(Math.toRadians(angleF))) * 1000.0) / 1000.0; // Find Side F
                    textAreaTriangle2SideF.setText(String.valueOf(sideF)); // Update Side F
                }
                // Given Side E and Angle D, find the rest
                else if ((sideE != 0) && (angleD != 0)) {
                    angleF = 90 - angleD; // Find Angle F
                    textAreaTriangle2AngleF.setText(String.valueOf(angleF)); // Update Angle F
                    sideD = Math.round((sideE * Math.sin(Math.toRadians(angleD))) * 1000.0) / 1000.0; // Find Side D
                    textAreaTriangle2SideD.setText(String.valueOf(sideD)); // Update Side D
                    sideF = Math.round((sideE * Math.cos(Math.toRadians(angleD))) * 1000.0) / 1000.0; // Find Side F
                    textAreaTriangle2SideF.setText(String.valueOf(sideF)); // Update Side F
                }
                // Find Area if all sides are known
                if ((sideD != 0) && (sideF != 0)) {
                    double area = 0.5 * sideF * sideD; // Find Area
                    textAreaTriangle2Area.setText("Area: " + String.valueOf(area)); // Update Area
                }
                else {
                    textAreaTriangle2Area.setText(""); // Remove Area
                }


            }});

        // Add a custom JPanel with transparent background to the frame
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setOpaque(false); // Make the panel transparent
                drawTriangle1(g);
                drawTriangle2(g);
            }
        };

        frame.getContentPane().add(panel); // Add the panel to the window
        frame.setVisible(true); // Display the window
    }

    // Draw the left triangle (Triangle1)
    private static void drawTriangle1(Graphics g) {
        int[] xPoints = {285, 135, 435}; // X coordinates of the triangle's vertices
        int[] yPoints = {100, 400, 400}; // Y coordinates of the triangle's vertices
        int nPoints = 3; // Number of points/vertices

        g.setColor(Color.WHITE);
        g.drawPolygon(xPoints, yPoints, nPoints);

        // Calculate and draw the arcs for the angles inside the triangle
        int radius = 25;
        int startAngle = -45;
        int arcAngle = 90;

        // Draw arc for angle at vertex 1
        g.drawArc(xPoints[0] - radius, yPoints[0] - radius, radius * 2, radius * 2, startAngle - 70, arcAngle - 40);

        // Draw arc for angle at vertex 2
        g.drawArc(xPoints[1] - radius, yPoints[1] - radius, radius * 2, radius * 2, startAngle + 45, arcAngle - 25);

        // Draw arc for angle at vertex 2
        g.drawArc(xPoints[2] - radius, yPoints[2] - radius, radius * 2, radius * 2, startAngle - 198, arcAngle - 28);

    }

    // Draw the right triangle (Triangle2)
    private static void drawTriangle2(Graphics g) {
        int[] xPoints = {650, 650, 850}; // X coordinates of the triangle's vertices
        int[] yPoints = {100, 400, 400}; // Y coordinates of the triangle's vertices
        int nPoints = 3; // Number of points/vertices

        g.setColor(Color.WHITE);
        g.drawPolygon(xPoints, yPoints, nPoints);

        // Calculate and draw the arcs for the angles inside the triangle
        int radius = 25;
        int startAngle = -90;
        int arcAngle = 34;

        // Draw arc for angle at vertex 1 (top vertex)
        g.drawArc(xPoints[0] - radius, yPoints[0] - radius, radius * 2, radius * 2, startAngle, arcAngle);

        // Draw arc for angle at vertex 3 (bottom right vertex)
        g.drawArc(xPoints[2] - radius, yPoints[2] - radius, radius * 2, radius * 2, startAngle - 145, arcAngle + 20);

        // Draw right angle symbol at vertex 2 (bottom left vertex)
        int symbolSize = 15;
        g.drawLine(xPoints[1], yPoints[1] - symbolSize, xPoints[1] + symbolSize, yPoints[1] - symbolSize);
        g.drawLine(xPoints[1] + symbolSize, yPoints[1], xPoints[1] + symbolSize, yPoints[1] - symbolSize);
    }
}
