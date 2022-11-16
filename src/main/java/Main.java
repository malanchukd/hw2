public class Main {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator(2.3);

        //int steps = calculator.calculateSteps();
        //double[][] array = calculator.calculateArray();

        int idxOfHighestY = calculator.getIdOfHighestY();
        int idxOfLowestY  = calculator.getIdOfLowestY();

        System.out.println("Highest Y: " + calculator.getInfoOf(idxOfHighestY));
        System.out.println("Lowest Y: " + calculator.getInfoOf(idxOfLowestY));

        System.out.println("TEST #50: " + calculator.getInfoOf(49));
        System.out.println("TEST #1050: " + calculator.getInfoOf(1049));
        System.out.println("TEST #1300: " + calculator.getInfoOf(1299));

        System.out.println();
    }
}
