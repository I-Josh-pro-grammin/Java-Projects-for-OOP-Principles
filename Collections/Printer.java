public class Printer<T extends  Number>{
    T valueToPrint;

    public Printer(T  valueToPrint) {
        super();
        this.valueToPrint = valueToPrint;
    }

    public void print() {
        System.out.println("value: " + valueToPrint);
    }

}
