public class AngleSineRule {
    
    // Finds a missing angle in a triangle given the missing angle's respective side, and another side-angle pair
    public static double angleSineRule(double sideA, double angleA, double sideB) {

        // Convert input angle from degrees to radians for calculations
        double angleARad = Math.toRadians(angleA);

        // Find the missing angle and convert it back into degrees
        double calculatedAngleRad = Math.asin((sideB) / (sideA / Math.sin(angleARad)));
        double calculatedAngleDegrees = Math.round(((Math.toDegrees(calculatedAngleRad))*1000) / 1000);

        // Output the calculated angle in degrees
        return calculatedAngleDegrees;
    }
}