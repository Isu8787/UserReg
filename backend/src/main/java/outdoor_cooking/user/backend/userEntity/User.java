package outdoor_cooking.user.backend.userEntity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

     @Id
     @Column(name = "userid" , length = 45)
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int userid;

     @Column(name = "username" , length = 255)
     private String username;

     @Column(name = "password" , length = 255)
     private String password;

     @Column(name = "email" , length = 255)
     private String email;

     @Column(name = "mobile" , length = 20)
     private int mobile;

    public User(int userid, String username, String password, String email, int mobile) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }

    public User() {
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
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
