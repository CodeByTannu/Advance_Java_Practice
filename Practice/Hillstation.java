package Practice;

//Superclass Hillstations
class Hillstations 
{  
	// Method to return the location of the hill station
    void location() 
    {
        System.out.println("Location is:");
    }
    
    // Method to return what the hill station is famous for
    void famousfor()
    {
        System.out.println("Famous for:");
    }  
}

//Subclass Manali
class Manali extends Hillstations 
{  
    @Override
    void location() 
    {
        System.out.println("Manali is in Himachal Pradesh");
    }  
    
    @Override
    void famousfor()
    {
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }  
}  

//Subclass Mussoorie
class Mussoorie extends Hillstations
{  
    @Override
    void location()
    {
        System.out.println("Mussoorie is in Uttarakhand");
    }  
    
    @Override
    void famousfor()
    {
        System.out.println("It is famous for education institutions");
    }  
}  

//Subclass Gulmarg
class Gulmarg extends Hillstations 
{  
    @Override
    void location()
    {
        System.out.println("Gulmarg is in J&K");
    }  
    
    @Override
    void famousfor()
    {
        System.out.println("It is famous for skiing");
    }  
}  

public class Hillstation
{  
    public static void main(String[] args) 
    { 
    	
    // Create instances of the Hillstations class and its subclasses
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations G = new Gulmarg();
        
     // Call methods on Hillstations reference
        A.location();
        A.famousfor();
        
     // Call methods on Manali reference
        M.location();
        M.famousfor();
        
     // Call methods on Mussoorie reference
        Mu.location();
        Mu.famousfor();
        
     // Call methods on Gulmarg reference
        G.location();
        G.famousfor();
    }  
}