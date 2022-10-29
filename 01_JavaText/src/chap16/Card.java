package chap16;

import java.util.ArrayList;
import java.util.List;
 
/**
 * トランプクラス
 */
public class Card {
  /** トランプの数字 */
  public enum Rank {
    DEUCE("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"),
    NINE("9"),TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");
 
    private String rankNumber;
 
    private Rank(String rankNumber) {
      this.rankNumber = rankNumber;
    }
 
    public String getRankNumber() {
      return this.rankNumber;
    }
 
  }
 
  /** トランプの絵柄 */
  public enum Suit {
    CLUBS("♣"), DIAMONDS("♦"), HEARTS("♥"), SPADES("♠");
 
    private String suitMark;
 
    private Suit(String suitMark) {
      this.suitMark = suitMark;
    }
 
    public String getSuitMark() {
      return this.suitMark;
    }
 
  }
 
  private final Rank rank;
  private final Suit suit;
 
  private Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
 
  public Rank rank() {
    return rank;
  }
 
  public Suit suit() {
    return suit;
  }
 
  private static final List<Card> protoDeck = new ArrayList<Card>();
 
  // Initialize prototype deck
  static {
    for (Suit suit : Suit.values())
      for (Rank rank : Rank.values())
        protoDeck.add(new Card(rank, suit));
  }
 
  public static ArrayList<Card> newDeck() {
    return new ArrayList<Card>(protoDeck); // Return copy of prototype deck
  }

    @Override
    public String toString() {
        return "rank=" + rank + ", suit=" + suit;
    }
  
  
  
    public static void main(String[] args) {
        System.out.println(Card.newDeck());
        
    }
}
