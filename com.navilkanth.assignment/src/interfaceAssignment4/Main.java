package interfaceAssignment4;

public class Main {
    public static void main(String[] args) {
        Airfare airIndia = new Airindia(5, 1200.50);
        Airfare kingFisher = new KingFisher(3, 1500.75);
        Airfare indigo = new Indigo(2, 2000.20);

        airIndia.display();
        kingFisher.display();
        indigo.display();
    }
}