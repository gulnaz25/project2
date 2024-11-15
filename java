public class Greeting {

    public static void main(String[] args) {
        // Array of names to loop through
        String[] names = {"John", "Jane", "Mark", "Jill", "James", "Sarah", "Paul"};
        
        // Loop through the names array
        for (int i = 0; i < names.length; i++) {
            String name = names[i];  // Get the current name
            
            // Check if the name starts with 'J' or 'j'
            if (name.charAt(0) == 'J' || name.charAt(0) == 'j') {
                System.out.println("Goodbye " + name); // Print Goodbye for names starting with 'J'
            } else {
                System.out.println("Hello " + name); // Print Hello for all other names
            }
        }
    }
}
