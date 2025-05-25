import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Testing {
    public static void main(String[] args) {
        // ContractBuilder longTermContractBuilder = new Longterm();
        // longTermContractBuilder.setBuildContractID("LTC001");
        // longTermContractBuilder.setBuildPropertyID("P001");
        // longTermContractBuilder.setBuildTenantID("T001");
        // longTermContractBuilder.setBuildRentAmout(1500.0);
        // RentalContract longterm = longTermContractBuilder.signContract();
        // System.out.println(longterm.toString());

        ContractBuilder shortTermContractBuilder = new Shortterm();
        Client client = new Client();
        RentalContract shortterm = client.requestCreateContract(shortTermContractBuilder, "STC001", "P002", "T002", 200.0);
        // System.out.println(shortterm.toString());

        
        String encryptedData = AES_Encryption.encrypt( shortterm.toString());
        String decryptedData = AES_Encryption.decrypt(encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
        System.out.println("Encrypted Data: " + encryptedData);
        
        String filePath= "Lab\\Contract_Information.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(encryptedData);
            writer.write(decryptedData);
            writer.newLine();
            writer.flush();
            System.out.println("Completed writing to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
