public class Computer {
    static public class Comp {
    static String brandName = "Computer";

    public Comp(String brandName) {
        this.brandName = brandName;
    }

    public static void display() {
        System.out.println("Playing with " + brandName);
    }
    }

    static public class Laptop extends Comp {

        public Laptop(String brandName) {
            super(brandName);
        }

        public static void display() {
            System.out.println("Playing with " + brandName);
        }
    }

    public static void main(String[] args) {

        Laptop laptop = new Laptop("HP Laptop");
        laptop.display();
    }}

