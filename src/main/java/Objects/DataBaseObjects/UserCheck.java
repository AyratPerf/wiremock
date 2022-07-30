package Objects.DataBaseObjects;

public class UserCheck {

    public String firstname;
    public String lastname;
    public int series;
    public int number;

    public String toString() {
        return firstname + " " +
                lastname + " " +
                series + " " +
                number;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
