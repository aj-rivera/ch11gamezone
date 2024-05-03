public class BlackjackGame {
    private static int randomNumber;
    private static int randomSuit;
    private static String[] suits = { "spades", "clubs", "diamonds", "hearts" };

    public static void main(String[] args) {
        randomSuit = (int) (Math.random() * 4);
        randomNumber = (int) (Math.random() * 13 + 1);

        BlackjackCard user1 = new BlackjackCard(suits[randomSuit], randomNumber);

        System.out.println(user1.getCardNumber());
        System.out.println(user1.getCardSuit());
        System.out.println(user1.getValue());

    }
}