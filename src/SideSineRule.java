public class SideSineRule {

    // Finds a missing side in a triangle given the missing side's respective angle, and another side-angle pair
    public static double sideSineRule(double sideA, double angleA, double angleB) {

        // Convert input angles from degrees to radians for calculations
        double angleARad = Math.toRadians(angleA);
        double angleBRad = Math.toRadians(angleB);

        // Find the missing side
        double calculatedSide = Math.round(((sideA / Math.sin(angleARad) * Math.sin(angleBRad))*1000) / 1000);

        // Output the calculated side
        return calculatedSide;
    }
}