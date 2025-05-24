package models;

public interface ContractBuilder {
    
    void setBuildContractID(String contractID);
    
    void setBuildPropertyID(String propertyID);
    
    void setBuildTenantID(String tenantID);
    void setBuildRentAmout(double rentAmout);
    RentalContract signContract();
    
}
