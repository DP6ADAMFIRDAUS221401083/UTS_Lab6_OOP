public class kopi extends drink {
    private boolean isDecaf;

    // Constructor
        public kopi(String name, double price, boolean isDecaf) {
            super(name, price);
            this.isDecaf = isDecaf;
        }

    // Method Overriding: Mengganti implementasi dari method getDescription()
        public String getDescription() {
            String decafInfo = isDecaf ? "decaffeinated " : "";
            return "This is a " + decafInfo + "coffee.";
        }
    }
