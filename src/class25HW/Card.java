package class25HW;

public class Card {
   private double interestRate;
    private String cardType;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    Card(double interestRate, String cardType){
        //setCardType(cardType);
        this.interestRate=interestRate;
        this.cardType=cardType;
    }
}
