public class POSIceCream {
    private String flavor;
    private String brand;
    private int size;
    private int sku;


    public POSIceCream(){}


    public POSIceCream(String flavor, String brand, int size, int sku) {
        this.flavor = flavor;
        this.brand = brand;
        this.size = size;
        this.sku = sku;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    private void sell(){}

    public void serve(){}
}
