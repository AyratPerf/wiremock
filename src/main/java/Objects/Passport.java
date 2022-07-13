package Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Passport {
    public Passport() {
    }

    public int series;
    public int number;

    public Passport(int series, int number) {
        this.number = number;
        this.series = series;
    }

    public int getSeries() {
        return series;
    }
    public int getNumber() {
        return number;
    }
}
