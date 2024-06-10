public class SideCosineRule {

    // Find the side opposite the known angle given sides adjacent to the known angle
    public static double sideCosineRule(double sideA, double sideB, double angle) {

        // Convert angle to radians for calculations
        double angleRadians = Math.toRadians(angle);
        //Substitute input values into the cosine rule to find the missing side
        double sideC = Math.sqrt((sideA * sideA) + (sideB * sideB) - 2 * sideA * sideB * Math.cos(angleRadians));
        double calculatedSideC = (double) Math.round(sideC * 1000) / 1000;
        return calculatedSideC;
    }
}
