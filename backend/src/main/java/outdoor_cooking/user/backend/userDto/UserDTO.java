package outdoor_cooking.user.backend.userDto;

public class UserDTO {

    private int userid;
    private String username;
    private String password;
    private String email;
    private int mobile;

    public UserDTO(int userid, String username, String password, String email, int mobile) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }

    public UserDTO() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
