import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
                // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        //Wave 2
        //     Scanner scan = new Scanner(System.in) {
        //     while (scan.hasNextDouble()) {
        //         double temp = scan.nextDouble();
        //         System.out.println(temp);
        //     }
        // }
        // Wave 3 and 4 
        Scanner scan = new Scanner(System.in);

        Double min = null;
        Double max = null;
        double sum = 0;
        int count = 0;

        while (scan.hasNextDouble()) {
            double temp = scan.nextDouble();

            if (min == null || temp < min) min = temp;
            if (max == null || temp > max) max = temp;

            sum += temp;
            count++;
        }

        scan.close();

        if (count > 0) {
            double average = sum / count;
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No temperature data provided.");
        }
    }
}

