

public class RentalContract {
   private String contractID;
   private String propertyID;   
    private String tenantID;
    private double rentAmount;
    private boolean isActive;
    private String contractType;
    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmout, String contractType
            ) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmout;
        this.isActive = true;
        this.contractType = contractType;
    }
    public String getContractID() {
        return contractID;
    }
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }
    public String getPropertyID() {
        return propertyID;
    }
    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }
    public String getTenantID() {
        return tenantID;
    }
    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }
    public double getRentAmount() {
        return rentAmount;
    }
    public void setRentAmount(double rentAmout) {
        this.rentAmount = rentAmout;
    }
    

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public String getContractType() {
        return contractType;
    }
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
    @Override
    public String toString() {
        return "Contract Details:\n"
                + "Contract ID: " + this.contractID + "\n"
                + "Property ID: " + this.propertyID + "\n"
                + "Tenant ID: " + this.tenantID + "\n"
                + "Rent Amount: $" + this.rentAmount + "\n"
                + "Contract Type: " + this.contractType + "\n";
    }
   
}
