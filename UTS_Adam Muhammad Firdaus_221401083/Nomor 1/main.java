// Class utama yang berisi method main program
public class main{
    public static void main(String[] args) {
        // Membuat objek Drink menggunakan constructor
        drink jus = new drink("jus jeruk", 2.5);
        drink kopiko = new kopi("kopi susu", 2.5, false);
        // Memanggil method serve tanpa parameter(overloading)
        jus.serve();

        // Memanggil method serve dengan parameter(overloading)
        jus.serve(2);

        // Memanggil method getter untuk mendapatkan nama dan harga minuman
        System.out.println("Name: " + jus.getName());
        System.out.println("Price: $" + jus.getPrice());
        
        // Memanggil method setter untuk mengubah nama dan harga minuman
        jus.setName("jus melon");
        jus.setPrice(3.0);
        System.out.println("nama dan harga jus setelah diubah menggunakan setter");
        System.out.println("nama:"+jus.name);
        System.out.println("harga:"+jus.price);
        System.out.println(jus.getDescription());

        System.out.println("----------------------");

        System.out.println("Name: " + kopiko.getName());
        System.out.println("Price: $" + kopiko.getPrice());
        // Memanggil method override dari getdescription
        System.out.println(kopiko.getDescription());
        
    }
}
