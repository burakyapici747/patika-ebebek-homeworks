package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Burak",10,100,100, 50);
        Fighter f2 = new Fighter("Zekeriya",10,100,100, 50);
        Match match = new Match(f1,f2,85,100);
        match.start();
    }
}
