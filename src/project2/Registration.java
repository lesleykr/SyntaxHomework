package project2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if(email.contains("yahoo.com")) {
            this.email = email;
        }else{
            System.out.println("Invalid email address");
        }
    }
    public void setUserName(String userName) {
        if(!userName.isEmpty()&&userName.length()>6) {
            this.userName = userName;
        }else{
            System.out.println("Invalid username");
        }
    }

    public void setPassword(String password) {
        if(!password.isEmpty()&&password.length()>6&&!password.contains(userName)) {
            this.password = password;
        }else{
            System.out.println("Invalid password");
        }
    }
}
