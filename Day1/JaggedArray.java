package Day1;

public class JaggedArray {
    /**
     * The main method demonstrates the creation and manipulation of a jagged array
     * to represent students in different classes, each having a different number 
     * of students. It initializes the array with student names, displays the structure 
     * of the school classes, and prints the number of students in each class.
     */
    public static void main(String[] args) {
        // Example 1: School Classes
        demonstrateSchoolClasses();
        
        System.out.println("\n=================================\n");
        
        // Example 2: Tournament Brackets
        demonstrateTournamentBrackets();
    }
    
    private static void demonstrateSchoolClasses() {
        // Creating a jagged array to represent students in different classes
        // Each class has a different number of students
        String[][] schoolClasses = new String[3][];  // 3 classes with varying students
        
        // Initialize each class with different number of students
        schoolClasses[0] = new String[4];  // Class A has 4 students
        schoolClasses[1] = new String[3];  // Class B has 3 students
        schoolClasses[2] = new String[5];  // Class C has 5 students
        
        // Adding student names to Class A
        schoolClasses[0][0] = "John";
        schoolClasses[0][1] = "Emma";
        schoolClasses[0][2] = "Michael";
        schoolClasses[0][3] = "Sarah";
        
        // Adding student names to Class B
        schoolClasses[1][0] = "David";
        schoolClasses[1][1] = "Lisa";
        schoolClasses[1][2] = "Tom";
        
        // Adding student names to Class C
        schoolClasses[2][0] = "Alex";
        schoolClasses[2][1] = "Sophie";
        schoolClasses[2][2] = "James";
        schoolClasses[2][3] = "Emily";
        schoolClasses[2][4] = "Oliver";
        
        // Displaying the school structure
        System.out.println("School Class Structure:");
        System.out.println("----------------------");
        
        for (int index = 0; index < schoolClasses.length; index++) 
        {
            System.out.println("Class " + (char)('A' + index) + " has " + schoolClasses[index].length + " students:");
            
            for (int secondIndex = 0; secondIndex < schoolClasses[index].length; secondIndex++) 
            {
                System.out.println("\t" + schoolClasses[index][secondIndex]);
            }
            System.out.println();
        }
        
        // Demonstrating array lengths
        System.out.println("Number of classes: " + schoolClasses.length);
        System.out.println("Students in Class A: " + schoolClasses[0].length);
        System.out.println("Students in Class B: " + schoolClasses[1].length);
        System.out.println("Students in Class C: " + schoolClasses[2].length);
    }
    
    private static void demonstrateTournamentBrackets() {
        // Creating a jagged array for a tournament where each round has different numbers of matches
        String[][] tournament = new String[3][];  // 3 rounds: Quarter-finals, Semi-finals, Finals
        
        // Initialize rounds with different numbers of matches
        tournament[0] = new String[4];    // Quarter-finals: 4 matches
        tournament[1] = new String[2];    // Semi-finals: 2 matches
        tournament[2] = new String[1];    // Finals: 1 match
        
        // Filling in match results
        tournament[0][0] = "Team A vs Team B";
        tournament[0][1] = "Team C vs Team D";
        tournament[0][2] = "Team E vs Team F";
        tournament[0][3] = "Team G vs Team H";
        
        tournament[1][0] = "Winner(A/B) vs Winner(C/D)";
        tournament[1][1] = "Winner(E/F) vs Winner(G/H)";
        
        tournament[2][0] = "Final Match";
        
        // Displaying the tournament structure
        System.out.println("Tournament Structure:");
        System.out.println("--------------------");
        
        String[] roundNames = {"Quarter-finals", "Semi-finals", "Finals"};
        for (int round = 0; round < tournament.length; round++) {
            System.out.println("\n" + roundNames[round] + " (" + tournament[round].length + " matches):");
            for (int match = 0; match < tournament[round].length; match++) {
                System.out.println("\tMatch " + (match + 1) + ": " + tournament[round][match]);
            }
        }
    }
}
