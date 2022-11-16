import java.util.Arrays;
import java.util.Comparator;

public class Calculator {

    private final double minX = 0.2;

    private final double _a;

    private double[][] resArray = new double[0][3];

    public Calculator(double a) {
        _a = a;
    }

    public int calculateSteps() {
        double maxX = 2.8;
        double step = 0.002;
        return (int) ((maxX - minX)/ step);
    }

    public double calculationFunction (double x) {
        double y;
        if (x <= 0.3) y = 1.5*_a*Math.pow(Math.cos(x), 2);
        else if(x > 2.3) y = 3 * _a * Math.tan(x);
        else y = Math.pow(x - 2, 2) + 6 * _a;
        return y;
    }

    public double[][] calculateArray() {
        int maxSteps = calculateSteps();
        resArray = new double[maxSteps][3];
        double x = minX;
        for (int step = 0; step < maxSteps; step++)
        {
            double y = calculationFunction(x);
            resArray[step][0] = step;
            resArray[step][1] = y;
            resArray[step][2] = x;
            x += step;
        }
        return resArray;
    }

    public double[][] sortedArray() {
        double[][] sortedArray = Arrays.copyOf(resArray, resArray.length);
        Arrays.sort(sortedArray, Comparator.comparing(y -> y[1]));
        return sortedArray;
    }

    public int getIdOfHighestY()
    {
        double[][] sortedArray = sortedArray();
        return (int) sortedArray[sortedArray.length-1][0];
    }

    public int getIdOfLowestY()
    {
        double[][] sortedArray = sortedArray();
        return (int) sortedArray[0][0];
    }

    public String getInfoOf(int id)
    {
        if (id >= resArray.length)
            return "Idx not found!";

        return getInfoOf(resArray[id]);
    }

    public String getInfoOf(double[] element)
    {
        return "in array: " + (int)(element[0]+1) + ", Y="+ element[1]+" X="+element[2];
    }

}
