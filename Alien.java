public abstract class Alien {
    protected String color;
    protected int numEyes;
    protected boolean isFriendly;

    public Alien(String color, int numEyes, boolean isFriendly) {
        this.color = color;
        this.numEyes = numEyes;
        this.isFriendly = isFriendly;
    }

    public String toString() {
        String friendlyAdjective;
        if (isFriendly) {
            friendlyAdjective = "friendly";
        } else {
            friendlyAdjective = "unfriendly";
        }
        return "The " + friendlyAdjective + " alien has " + color + " skin and " + numEyes + " eyes.";
    }
}