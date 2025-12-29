package studentManagementSystem;

public class GradeCalculator {

    int Maths = 90;
    int FOC = 77;
    int OOP = 79;

    int total = Maths + FOC + OOP;
    double percentage = (total / 300.0) * 100;

    public static void main(String[] args) {
        GradeCalculator g = new GradeCalculator();
        System.out.println("Percentage: " + g.percentage);
    }
}
