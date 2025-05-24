package models;

public class RentalContract {
   private String contractID;
   private String propertyID;   
    private String tenantID;
    private double rentAmout;
    private String typeContract;
    private boolean isActive;
    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmout
            ) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmout = rentAmout;
        this.isActive = true;
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
    public double getRentAmout() {
        return rentAmout;
    }
    public void setRentAmout(double rentAmout) {
        this.rentAmout = rentAmout;
    }
    

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
