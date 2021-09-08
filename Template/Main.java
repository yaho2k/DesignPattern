package Template;


public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello world");
        AbstractDisplay d3 = new StringDisplay("Hi");

        d1.display();
        d2.display();
        d3.display();
    }
}
