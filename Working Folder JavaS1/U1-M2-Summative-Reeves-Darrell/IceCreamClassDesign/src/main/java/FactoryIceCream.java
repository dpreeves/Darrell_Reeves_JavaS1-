import java.util.List;

public class FactoryIceCream {
    private List<String> ingredients;
    private List<String> mfgSteps;
    private String storageLocation;
    private String shippingMethod;


    public FactoryIceCream(){}


    public FactoryIceCream(List<String> ingredients, List<String> mfgSteps, String storageLocation, String shippingMethod) {
        this.ingredients = ingredients;
        this.mfgSteps = mfgSteps;
        this.storageLocation = storageLocation;
        this.shippingMethod = shippingMethod;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getMfgSteps() {
        return mfgSteps;
    }

    public void setMfgSteps(List<String> mfgSteps) {
        this.mfgSteps = mfgSteps;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void transport(){}

    public void recall(){}

    public void make(){}

}
