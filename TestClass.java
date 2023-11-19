
interface GPI {
 
    // Default method
    default void show()
    {
 
        // Print statement
        System.out.println("Default GPI");
    }
}
 
// Interface 2
// Extending the above interface
interface PI1 extends GPI {
}
 
// Interface 3
// Extending the above interface
interface PI2 extends GPI {
}
 
// Main class
// Implementation class code
class TestClass implements PI1, PI2 {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Creating object of this class
        // in main() method
 
}