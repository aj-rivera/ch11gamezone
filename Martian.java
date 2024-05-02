public class Martian extends Alien {
    public Martian(String color, int numEyes, boolean isFriendly) {

        super(color, numEyes, isFriendly);

        if (this.numEyes != 2) {
            System.err.println("Martians only have 2 eyes! Number of eyes have been overridden to 2.");
        }
        this.numEyes = 2;

    }

}