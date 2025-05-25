public class Client {
    public RentalContract requestCreateContract(ContractBuilder contractBuilder, 
            String contractID, String propertyID, String tenantID, double rentAmout) {  
        contractBuilder.setBuildContractID(contractID); 
        contractBuilder.setBuildPropertyID(propertyID);
        contractBuilder.setBuildTenantID(tenantID);
        contractBuilder.setBuildRentAmout(rentAmout);
        return contractBuilder.signContract();
        
        
    }
}
