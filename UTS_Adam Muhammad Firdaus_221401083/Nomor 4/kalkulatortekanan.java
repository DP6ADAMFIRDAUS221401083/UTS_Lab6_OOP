public class kalkulatortekanan {
    public double force; // Gaya dalam Newton
    public double area;  // Luas area dalam meter persegi

    // Constructor 1: Menginisialisasi dengan gaya dan luas area
    public kalkulatortekanan(double force, double area) {
        this.force = force;
        this.area = area;
    }

    // Constructor 2: Menginisialisasi dengan gaya saja, asumsi area 1 m^2
    public kalkulatortekanan(double force) {
        this.force = force;
        this.area = 1.0; // Default area
    }

    // Method untuk menghitung tekanan
    public double hitungtekanan() {
        return force / area;
    }

    // Overloaded method untuk menghitung tekanan dengan input baru
    public double hitungtekanan(double force, double area) {
        return force / area;
    }
}
