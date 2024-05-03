public abstract class Card {
    protected String cardSuit;
    protected int cardNumber;

    public Card(String cardSuit, int cardNumber) {
        this.cardSuit = cardSuit;
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }
}