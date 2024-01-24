package comparableandcomparator;

public class Cart {
    private Integer itemQty;
    private String itemName;

    public Cart(Integer itemQty, String itemName){
        this.itemQty = itemQty;
        this.itemName = itemName;
    }

    public Integer getItemQty() {
        return itemQty;
    }

    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "itemQty=" + itemQty +
                ", itemName='" + itemName + '\'' +
                '}';
    }

}
