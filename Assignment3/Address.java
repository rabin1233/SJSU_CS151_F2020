

public class Address {
    private int streetNum;
    private String streetName;
    private  String city;
    private  String Zip;
    private String State;

    public Address(int streetNum, String streetName, String city, String zip, String state) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.Zip = zip;
        this.State = state;
    }

    @Override
    public String toString() {
        return " Address is:  " + streetNum + " " +  streetName +" " +  city + " " + Zip+ " "  + State;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

}
