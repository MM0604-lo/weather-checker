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
        Scanner scan = new Scanner(System.in);

        // Initialize min and max as null to handle empty input
        Double min = null;
        Double max = null;

        while (scan.hasNextDouble()) {
            double temp = scan.nextDouble();

            if (min == null || temp < min) {
                min = temp;
            }
            if (max == null || temp > max) {
                max = temp;
            }
        }



        if (min != null && max != null) {
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } else {
            System.out.println("No temperature data provided.");
        }
    }

    
    }

