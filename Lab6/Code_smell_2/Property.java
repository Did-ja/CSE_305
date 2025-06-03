package Code_smell_2;

public class Property {
  private String name; 
    private double rentAmount; 
    private String ownerName;  
    private String location; 
 
    public Property(String name, double rentAmount, String ownerName, String location) { 
        // Constructor with a data clump 
        this.name = name; 
        this.rentAmount = rentAmount; 
        this.ownerName = ownerName; 
        this.location = location; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public double getRentAmount() { 
        return rentAmount; 
    } 
 
    public String getOwnerName() { 
        return ownerName; 
    } 
 
    public String getLocation() { 
        return location; 
    } 
    public boolean isPremium() {
        return rentAmount > 2000;
    }

    public double getYearlyRent() {
        return rentAmount * 12;
    }
 
    @Override
    public String toString() { 
        return "Property information: \n" +
                "Name: " + name + "\n" +
                "Rent Amount: $" + rentAmount + "\n" +
                "Owner Name: " + ownerName + "\n" +
                "Location: " + location;
    }
}
