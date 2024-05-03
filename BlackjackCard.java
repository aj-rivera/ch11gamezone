public class BlackjackCard extends Card {
    protected int value;
    protected String valueString;

    public BlackjackCard(String cardSuit, int cardNumber) {
        super(cardSuit, cardNumber);
        if (cardNumber >= 2 && cardNumber <= 10) {
            this.value = cardNumber;
        } else if (cardNumber >= 11 && cardNumber <= 13) {
            this.value = 10;
        } else if (cardNumber == 1) {
            this.value = 11;
        }

        if (cardNumber >= 2 && cardNumber <= 10) {
            this.valueString = String.valueOf(cardNumber);
        } else if (cardNumber == 11) {
            this.valueString = "jack";
        } else if (cardNumber == 12) {
            this.valueString = "queen";
        } else if (cardNumber == 13) {
            this.valueString = "king";
        } else if (cardNumber == 1) {
            this.valueString = "ace";
        }

    }

    public int getValue() {
        return this.value;
    }

    public String getValueString() {
        return this.valueString;
    }
}