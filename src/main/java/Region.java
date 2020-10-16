public class Region {
    private String regionID;
    private double legth;
    private double width;
    private double cost;
    private double area;

    public Region(double legth, double width, double cost, String regionID) {
        this.legth = legth;
        this.width = width;
        this.cost = cost;
        this.area = legth * width;
        this.regionID = regionID;
    }

    public double getCost() {
        return cost;
    }

    public double getArea() {
        return area;
    }

    public String getRegionID() {
        return regionID;
    }
}
