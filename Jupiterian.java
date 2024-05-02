public class Jupiterian extends Alien {
    public Jupiterian(String color, int numEyes, boolean isFriendly) {

        super(color,numEyes, isFriendly);

        if (this.numEyes != 4) {
            System.err.println("Martians have 4 eyes! Number of eyes have been overridden to 4.");
        }
        this.numEyes = 4;
    }
}