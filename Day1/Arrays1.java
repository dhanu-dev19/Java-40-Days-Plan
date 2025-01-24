package Day1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A program to manage and display the number of days in each month.
 * This class demonstrates proper array handling, input validation,
 * and enum usage in Java.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Arrays1 {
    
    /**
     * Enum representing months of the year with their names
     */
    private enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
        
        /**
         * Get a formatted string of the month name
         * @return Properly capitalized month name
         */
        public String getFormattedName() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }
    
    // Constants
    private static final int MONTHS_IN_YEAR = 12;
    private static final int MIN_DAYS = 28;
    private static final int MAX_DAYS = 31;
    
    /**
     * Main method to execute the program
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Arrays1 program = new Arrays1();
        program.run();
    }
    
    /**
     * Runs the main program logic
     */
    private void run() {
        int[] monthDays = new int[MONTHS_IN_YEAR];
        
        if (inputMonthDays(monthDays)) {
            displayMonthDays(monthDays);
        }
    }
    
    /**
     * Inputs the number of days for each month with validation
     * @param monthDays Array to store the days of each month
     * @return true if input was successful, false if there was an error
     */
    private boolean inputMonthDays(int[] monthDays) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the number of days for each month:");
            System.out.println("(Valid range: " + MIN_DAYS + "-" + MAX_DAYS + " days)\n");
            
            for (Month month : Month.values()) {
                boolean validInput = false;
                
                while (!validInput) {
                    System.out.printf("Enter days for %s: "+ month.getFormattedName());
                    
                    try {
                        int days = scanner.nextInt();
                        
                        if (isValidDayCount(days)) {
                            monthDays[month.ordinal()] = days;
                            validInput = true;
                        } else {
                            System.out.printf("Error: Days must be between %d and %d\n", 
                                           MIN_DAYS, MAX_DAYS);
                        }
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("Error: Please enter a valid number");
                        scanner.nextLine(); // Clear invalid input
                    }
                }
            }
            return true;
            
        } catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return false;
            
        } 
        finally 
        {
            scanner.close();
        }
    }
    
    /**
     * Validates if the number of days is within acceptable range
     * @param days Number of days to validate
     * @return true if days is valid, false otherwise
     */
    private boolean isValidDayCount(int days) {
        return days >= MIN_DAYS && days <= MAX_DAYS;
    }
    
    /**
     * Displays the number of days for each month in a formatted table
     * @param monthDays Array containing the days of each month
     */
    private void displayMonthDays(int[] monthDays) {
        System.out.println("\nMonth Days Summary:");
        System.out.println("==================");
        
        String format = "%-10s : %d days%n";
        for (Month month : Month.values()) {
            System.out.printf(format, 
                            month.getFormattedName(), 
                            monthDays[month.ordinal()]);
        }
    }
}
