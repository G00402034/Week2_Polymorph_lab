package productv5;

public class Tv extends Product {

    private double Screen_size;
    private String Manufacturer;

    public Tv()
    {
        super();
        Screen_size = 0;
        Manufacturer = "";
        count++;
    }

    public double getScreen_size() {
        return Screen_size;
    }

    public void setScreen_size(double screen_size) {
        Screen_size = screen_size;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScreen Size " + Screen_size + " inches" + "\nby " + Manufacturer;}
    }

