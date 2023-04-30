package class14HW;

public class Email {
    String eAdd="";
    String createEmail(String firstName, String lastName, String emailType){


        return (firstName+lastName+"@"+emailType);
    }

    public static void main(String[] args) {
        Email e1=new Email();
        System.out.println(e1.createEmail("Jon","Snow","gmail"));
    }
}
