package Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class User {
    public User() {
    }

    public String firstname;
    public String lastname;
    public Passport passport;

    public User(String firstname, String lastname, Passport passport) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.passport = passport;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public Passport getPassport() {
        return passport;
    }
}
