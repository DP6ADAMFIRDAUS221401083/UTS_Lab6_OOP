// Class utama yang berisi method main program
public class main{
    public static void main(String[] args) {
        // Membuat objek Drink menggunakan constructor
        drink coffee = new drink("Coffee", 2.5);

        // Memanggil method serve tanpa parameter(overloading)
        coffee.serve();

        // Memanggil method serve dengan parameter(overloading)
        coffee.serve(2);

        // Memanggil method getter untuk mendapatkan nama dan harga minuman
        System.out.println("Name: " + coffee.getName());
        System.out.println("Price: $" + coffee.getPrice());

        // Memanggil method setter untuk mengubah nama dan harga minuman
        coffee.setName("Espresso");
        coffee.setPrice(3.0);

        // Memanggil method toString untuk menampilkan informasi minuman yang telah di override dari coffee menjadi espresso
        System.out.println(coffee);
    }
}
