package pl.nadoba.cl;

public class StandardPen implements Penable {

    private String make;
    private String color;

    public StandardPen() {
        this.make = "Standard pen";
        this.color = "Standard color";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
