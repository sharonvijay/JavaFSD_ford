import java.util.Scanner;

abstract class Card {
    String holderName;
    String cardNumber;
    String expiryDate;

    public Card(String holderName, String cardNumber, String expiryDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getHolderName() {
        return holderName;
    }


    public abstract String getCardDetails();
}

class MembershipCard extends Card {
    int rating;

    public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
        super(holderName, cardNumber, expiryDate);
        this.rating = rating;
    }

    @Override
    public String getCardDetails() {
        return String.format("Card Number %s\nRating %d", cardNumber, rating);
    }
}

class PaybackCard extends Card {
    int pointsEarned;
    double totalAmount;

    public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
        super(holderName, cardNumber, expiryDate);
        this.pointsEarned = pointsEarned;
        this.totalAmount = totalAmount;
    }

    @Override
    public String getCardDetails() {
        return String.format("Card Number %s\nPoints Earned %d\nTotal Amount %.2f", cardNumber, pointsEarned, totalAmount);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Card\n1.Payback Card\n2.Membership Card");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the Card Details:");
        String input = sc.nextLine();
        String[] cardDetails = input.split("\\|");

        if (n == 1) {
            System.out.println("Enter points in card:");
            int pointsEarned = sc.nextInt();
            System.out.println("Enter Amount:");
            double totalAmount = sc.nextDouble();

            PaybackCard paybackCard = new PaybackCard(cardDetails[0], cardDetails[1], cardDetails[2], pointsEarned, totalAmount);
            System.out.println(paybackCard.getHolderName() + "'s Payback Card Details:");
            System.out.println(paybackCard.getCardDetails());
        } else if (n == 2) {
            System.out.println("Enter rating in card:");
            int rating = sc.nextInt();
            
            MembershipCard membershipCard = new MembershipCard(cardDetails[0], cardDetails[1], cardDetails[2], rating);
            System.out.println(membershipCard.getHolderName() + "'s Membership Card Details:");
            System.out.println(membershipCard.getCardDetails());
        }
        sc.close();
    }
}