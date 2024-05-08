// Membuat sebuah class Drink yang berisi atribut nama dan harga
public class drink{
    private String name;
    private double price;

    // Constructor untuk membuat objek Drink dengan nama dan harga tertentu
    public drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method Overloading: Memungkinkan penggunaan method dengan nama yang sama
    // tetapi dengan parameter yang berbeda yakni dengan implementasi pada method serve
    public void serve() {
        System.out.println("Serving " + name);
    }

    public void serve(int quantity) {
        System.out.println("Serving " + quantity + " " + name + "(s)");
    }

    // Method Overriding: Menerapkan ulang method dari superclass (Object)
    // untuk mengubah perilaku sesuai kebutuhan subclass (Drink)
    @Override
    public String toString() {
        return "Drink [name=" + name + ", price=" + price + "]";
    }

    // Method setter dan getter untuk mengatur dan mengambil nilai variabel
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
