package example;

public class Customer  {
    private static final long serialVersionUID = 1L;

     private Long id;
     private String emailAddress;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDetailStringMemberLeak(String pii) {
        return "Customer [id=" + id + ", emailAddress=" + emailAddress + "]";
    }

    public String getDetailStringParamLeak(String pii) {
        return "Customer [data=" + pii + "]";
    }

    public String getDetailStringSafe(String pii) {
        return "Customer [id=" + id + "]";
    }

}
