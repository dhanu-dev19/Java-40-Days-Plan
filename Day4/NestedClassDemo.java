package Day4;

class OuterClass 
{
    private int outerData = 10;
    
    // 1. Static Nested Class
    static class StaticNestedClass 
    {
        void display() 
        {
            System.out.println("Static Nested Class");
            // Can't access outerData directly as it's static
            // System.out.println("Can access outer data: " + outerData);
        }

    }
    
    // 2. Inner Class (Non-static Nested Class)
    class InnerClass 
    {
        void display() 
        {
            System.out.println("Inner Class");
            System.out.println("Can access outer data: " + outerData);
        }
    }
    
    // Method with Local Inner Class
    void method() 
    {
        // 3. Local Inner Class
        class LocalInnerClass 
        {
            void display() 
            {
                System.out.println("Local Inner Class");
                System.out.println("Can access outer data: " + outerData);
            }
        }
        
        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }
    
    // Method with Anonymous Inner Class
    public void showAnonymous() 
    {
        // 4. Anonymous Inner Class
        Runnable runnable = new Runnable() 
        {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class");
                System.out.println("Can access outer data: " + outerData);
            }
        };
        runnable.run();
    }
}

// Main class to test all nested classes
class NestedClassDemo 
{
    public static void main(String[] args) 
    {
        // Using Static Nested Class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();
        
        // Using Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
        
        // Using Local Inner Class through method
        outer.method();
        
        // Using Anonymous Inner Class
        outer.showAnonymous();
    }
}
