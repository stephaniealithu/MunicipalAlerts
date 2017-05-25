package tecsup.com.municipalalerts.models;

/**
 * Created by Steph on 22/05/2017.
 */

public class User {

    private String email;
    private String userId;
    private String fullname;
    private String phone;
    private String language;

    public User(String email, String userId, String fullname, String phone, String language) {
        this.email = email;
        this.userId = userId;
        this.fullname = fullname;
        this.phone = phone;
        this.language = language;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public User() {
    }



    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", language='" + language + '\'' +
                '}';
    }


}

