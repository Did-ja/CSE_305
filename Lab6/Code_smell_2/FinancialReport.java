package Code_smell_2;
import java.util.List;

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");

        for (Property property : properties) {
            System.out.println(property.toString());

            if (property.isPremium()) {
                System.out.println("This is a premium property.");
            } else {
                System.out.println("This is a standard property.");
            }

            System.out.println("Yearly Rent: $" + property.getYearlyRent());
            System.out.println("--------------------");

            totalRent += property.getRentAmount();
        }

        System.out.println("Total Rent Amount: $" + totalRent);
    }
}
