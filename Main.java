public class Main {

    public static void main(String[] args) {
        Martian marty = new Martian("blue", 2, true);
        System.err.println(marty.toString());

        Jupiterian terry = new Jupiterian("purple", 6, false);
        System.err.println(terry.toString());
    }
}