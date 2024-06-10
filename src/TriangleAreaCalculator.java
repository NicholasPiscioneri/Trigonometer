public class TriangleAreaCalculator {
    public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        // Calculate the area of the triangle using Heron's formula
        double s = (sideA + sideB + sideC) / 2; // Calculate the semi-perimeter
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Calculate the area

        return area;
}}
