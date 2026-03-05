package Actividad3;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    // Constructor
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);   // validación
        setStock(stock);   // validación
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name +
               ", Precio: " + price + ", Stock: " + stock + "]";
    }
}
