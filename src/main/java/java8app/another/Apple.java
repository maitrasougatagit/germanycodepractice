package java8app.another;

public class Apple {

    private int weight;
    private String colour;
    private String country;

    public Apple(int weight, String colour, String country) {
        this.weight = weight;
        this.colour = colour;
        this.country = country;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
