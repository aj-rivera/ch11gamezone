import java.util.ArrayList;

public class BlackjackGame {
    private static int randomCardNumber;
    private static String[] suits = { "spades", "clubs", "diamonds", "hearts" };
    
    private static BlackjackCard[] userCards = new BlackjackCard[5];
    private static int[] userValues = new int[5];
    private static int userSumValues = 0;

    private static BlackjackCard[] compCards = new BlackjackCard[5];
    private static int[] compValues = new int[5];
    private static int compSumValues = 0;

    private static String userWinsString = "The player wins!";
    private static String computerWinsString = "The computer wins.";

    private static ArrayList<BlackjackCard> cardsAvailable = new ArrayList<BlackjackCard>();

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cardsAvailable.add(new BlackjackCard(suits[i], j));
            }
        }

        for (int k = 0; k < 5; k++) {
            randomCardNumber = (int) (Math.random() * cardsAvailable.size());
            userCards[k] = cardsAvailable.get(randomCardNumber);
            userValues[k] = userCards[k].getValue();
            cardsAvailable.remove(randomCardNumber);
        }

        for (int m = 0; m < 5; m++) {
            randomCardNumber = (int) (Math.random() * cardsAvailable.size());
            compCards[m] = cardsAvailable.get(randomCardNumber);
            compValues[m] = compCards[m].getValue();
            cardsAvailable.remove(randomCardNumber);
        }

        for (int n = 0; n < 5; n++) {
            if (userSumValues < 21) {
                userSumValues += userValues[n];
            } else if (userSumValues == 21) {
                break;
            } else if (userSumValues > 21) {
                userSumValues -= userValues[n - 1];
                break;
            }
        }
        for (int n = 0; n < 5; n++) {
            if (compSumValues < 21) {
                compSumValues += compValues[n];
            } else if (compSumValues == 21) {
                break;
            } else if (compSumValues > 21) {
                compSumValues -= compValues[n - 1];
                break;
            }
        }
        // prints
        for (int z = 0; z < 5; z++) {
            System.out.println("User card: " + userCards[z].getCardSuit() + " " + userCards[z].getValueString()
                    + "\tComputerCard: " + compCards[z].getCardSuit() + " " + compCards[z].getValueString());
        }
        System.out.println("\nPlayer Score: " + userSumValues + "\tComputer Score: " + compSumValues);

        if (userSumValues >= compSumValues) {
            System.out.println(userWinsString);
        } else {
            System.out.println(computerWinsString);
        }
    }
}