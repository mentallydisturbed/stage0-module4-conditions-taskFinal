package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double maxSide = firstSide;
        if(maxSide < secondSide) maxSide = secondSide;
        if(maxSide < thirdSide) maxSide = thirdSide;
        if(maxSide >= (firstSide + secondSide + thirdSide - maxSide)) System.out.println("it's not a triangle");
        else System.out.println("this is a valid triangle");
    }
}
