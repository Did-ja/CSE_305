

public class Longterm implements ContractBuilder {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmout;

    @Override
    public void setBuildContractID(String contractID) {
        this.contractID = contractID;
    }
    @Override
    public void setBuildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }
    @Override   
    public void setBuildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }
    @Override
    public void setBuildRentAmout(double rentAmout) {
        this.rentAmout = rentAmout;
    }
    @Override
    public RentalContract signContract() {
        return new RentalContract(this.contractID, this.propertyID, this.tenantID, this.rentAmout, "Longterm");
    }
    @Override
    public String toString() {
        return "Longterm Contract Details:\n"
                + "Contract ID: " + this.contractID + "\n"
                + "Property ID: " + this.propertyID + "\n"
                + "Tenant ID: " + this.tenantID + "\n"
                + "Rent Amount: $" + this.rentAmout ;
    }

}
