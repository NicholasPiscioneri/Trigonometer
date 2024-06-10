public class AngleCosineRule {

    // Find an angle given only 3 side lengths of the triangle
    public static double angleCosineRule(double sideA, double sideB, double sideC) {

        //Substitute side lengths into the cosine rule to find the angle between side A and side B
        double calculatedAngleRad = Math.acos(((sideA * sideA)+(sideB * sideB)-(sideC * sideC)) / (2 * sideA * sideB));
        double calculatedAngleDegrees = Math.toDegrees(calculatedAngleRad);
        double calculatedAngle = (double) Math.round(calculatedAngleDegrees * 1000) / 1000;
        return calculatedAngle;
    }
}
