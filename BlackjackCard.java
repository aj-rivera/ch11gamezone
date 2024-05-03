public class BlackjackCard extends Card {
    protected int value;

    public BlackjackCard(String cardSuit, int cardNumber) {
        super(cardSuit, cardNumber);
        if (cardNumber >= 2 && cardNumber <= 10) {
            this.value = cardNumber;
        } else if (cardNumber >= 11 && cardNumber <= 13) {
            this.value = 10;
        } else if (cardNumber == 1) {
            this.value = 11;
        }

    }

    public int getValue() {
        return this.value;
    }
}