package class25HW;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        Card card1=new Card(3.75,"Visa");
        Card card2=new Card(4.25,"AMEX");
        Card card3=new Card(2.69, "Discover");

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for(Card c:cards){
            System.out.println(c.getInterestRate());
            System.out.println(c.getCardType());
        }
    }
}
