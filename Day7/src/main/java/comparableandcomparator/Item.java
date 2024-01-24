package comparableandcomparator;

public class Item implements Comparable{

    private Integer qty;
    private String name;
    Item(Integer qty, String name){
        this.qty = qty;
        this.name = name;

    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "qty=" + qty +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
	public int compareTo(Object o) {
		Item a=(Item)o;
		   return this.getQty().compareTo(a.getQty());
	}
//    @Override
//    public int compareTo(Object o) {
//        Item i = (Item) o;
//        return this.getName().compareTo(i.getName()) ; // comparing using the name
//    }
}
