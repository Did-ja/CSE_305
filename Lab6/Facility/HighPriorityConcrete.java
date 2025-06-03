import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority(String priority) {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDay = LocalDate.now().toString();
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        setPriority(null);
        setExpire(null);
        setStatus(null);
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
