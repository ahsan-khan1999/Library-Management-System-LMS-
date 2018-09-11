public class Liberary_Items {

    private String name;
    private String type;
    private int quantity;
    private String id;

    public Liberary_Items(String name, String type, int quantity, String id) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Liberary_Items(){}
}
