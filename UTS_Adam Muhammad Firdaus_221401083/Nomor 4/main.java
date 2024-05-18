public class main{
public static void main(String[] args) {
        // Menggunakan constructor dengan dua parameter
        kalkulatortekanan benda1 = new kalkulatortekanan(90, 2);
        double hasil1 = benda1.hitungtekanan(); // Gaya = 100N, Area = 2m^2
        System.out.println(String.format("Tekanan benda 1: %.2f Pascal", hasil1));

        // Menggunakan constructor dengan satu parameter
        kalkulatortekanan benda2 = new kalkulatortekanan(40); // Gaya = 50N, Area default = 1m^2
        System.out.println(String.format("Tekanan benda 2: %.2f Pascal", benda2.hitungtekanan()));

        // Menggunakan method overloading
        double force = 100;
        double area = 3;
        System.out.println(String.format("Tekanan benda 2(menggunakan method overloading): %.2f Pascal", benda2.hitungtekanan(force, area)));
    }
}