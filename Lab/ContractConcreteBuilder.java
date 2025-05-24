package models;

public class ContractConcreteBuilder implements ContractBuilder {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmout;
    // private String typeContract;
    
    public ContractConcreteBuilder(String contractID, String propertyID, String tenantID, double rentAmout) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmout = rentAmout;
        
    }

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
        return new RentalContract(this.contractID, this.propertyID, this.tenantID, this.rentAmout);
    }

}
