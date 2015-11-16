package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import enums.eRank;
import enums.eSuit;
import pokerBase.Card;
import pokerBase.Hand;


public class Holdem_Test {
	
	//first: need to initialize hands of 2 cards and hands of 4 cards
	Hand th_hand = new Hand();
	ArrayList<Card> com_cards = new ArrayList<Card>();
	Hand winning_hand = new Hand();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
		th_hand = null;
		com_cards = null;
		winning_hand = null;
		
	}
	
	@Test
	public void TestRoyalFLush1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.SPADES, eRank.ACE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.QUEEN, 1 );
		Card card4 = new Card(eSuit.SPADES, eRank.KING, 1 );
		Card card5 = new Card(eSuit.SPADES, eRank.TEN, 1 );
		Card card6 = new Card(eSuit.HEARTS, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.NINE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 100);
		
	}
	
	@Test
	public void TestRoyalFLush2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.SPADES, eRank.THREE, 1 );
		Card card2 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.QUEEN, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.KING, 1 );
		Card card5 = new Card(eSuit.HEARTS, eRank.TEN, 1 );
		Card card6 = new Card(eSuit.HEARTS, eRank.ACE, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.NINE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 100);
		
	}
	
	@Test
	public void TestRoyalFLush3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.SIX, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.FOUR, 1 );
		Card card3 = new Card(eSuit.DIAMONDS, eRank.QUEEN, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.TEN, 1 );
		Card card6 = new Card(eSuit.DIAMONDS, eRank.JACK, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.ACE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 100);
		
	}

	@Test
	public void TestStraightFlush1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.DIAMONDS, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.NINE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 90);
		
	}
	
	@Test
	public void TestStraightFlush2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.NINE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.DIAMONDS, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.HEARTS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 90);
		
	}
	
	@Test
	public void TestStraightFlush3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.QUEEN, 1 );
		Card card2 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.TEN, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.NINE, 1 );
		Card card5 = new Card(eSuit.HEARTS, eRank.EIGHT, 1 );
		Card card6 = new Card(eSuit.DIAMONDS, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.FOUR, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 90);
		
	}
	
	@Test
	public void TestFourOfAKind1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.ACE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.ACE, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.CLUBS, eRank.ACE, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.ACE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 80);
		
	}
	
	@Test
	public void TestFourOfAKind2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.THREE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.ACE, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.THREE, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.THREE, 1 );
		Card card6 = new Card(eSuit.CLUBS, eRank.THREE, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.QUEEN, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 80);
		
	}
	
	@Test
	public void TestFourOfAKind3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.CLUBS, eRank.FIVE, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.TEN, 1 );
		Card card6 = new Card(eSuit.CLUBS, eRank.ACE, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.ACE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 80);
		
	}
	
	@Test
	public void TestFullHouse1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.NINE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.TWO, 1 );
		Card card6 = new Card(eSuit.HEARTS, eRank.NINE, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.NINE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 70);
		
	}
	
	@Test
	public void TestFullHouse2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.SPADES, eRank.EIGHT, 1 );
		Card card6 = new Card(eSuit.HEARTS, eRank.THREE, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.EIGHT, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 70);
		
	}
	
	@Test
	public void TestFullHouse3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card5 = new Card(eSuit.SPADES, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.FOUR, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 70);
		
	}
	
	@Test
	public void TestFlush1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.DIAMONDS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.THREE, 1 );
		Card card6 = new Card(eSuit.DIAMONDS, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.NINE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 60);
		
	}
	
	@Test
	public void TestFlush2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.HEARTS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 60);
		
	}
	
	@Test
	public void TestFLush3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.SPADES, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.SPADES, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 60);
		
	}
	
	@Test
	public void TestStraight1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.CLUBS, eRank.SIX, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.SEVEN, 1 );
		Card card4 = new Card(eSuit.SPADES, eRank.EIGHT, 1 );
		Card card5 = new Card(eSuit.HEARTS, eRank.NINE, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 50);
		
	}
	
	@Test
	public void TestStraight2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card3 = new Card(eSuit.HEARTS, eRank.NINE, 1 );
		Card card4 = new Card(eSuit.CLUBS, eRank.TEN, 1 );
		Card card5 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.QUEEN, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 50);
		
	}
	
	@Test
	public void TestStraight3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.CLUBS, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.FOUR, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.SIX, 1 );
		Card card5 = new Card(eSuit.HEARTS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.EIGHT, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 50);
		
	}
	
	@Test
	public void TestThreeOfAKind1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 40);
		
	}
	
	@Test
	public void TestThreeOfAKind2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.HEARTS, eRank.KING, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.SPADES, eRank.KING, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 40);
		
	}
	
	@Test
	public void TestThreeOfAKind3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.QUEEN, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.FOUR, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.TWO, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 40);
		
	}
	
	@Test
	public void TestTwoPair1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.ACE, 1 );
		Card card4 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card5 = new Card(eSuit.CLUBS, eRank.FIVE, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.THREE, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 30);
		
	}
	
	@Test
	public void TestTwoPair2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.KING, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.KING, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.CLUBS, eRank.KING, 1 );
		Card card6 = new Card(eSuit.CLUBS, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.SPADES, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 30);
		
	}
	
	@Test
	public void TestTwoPair3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.CLUBS, eRank.TWO, 1 );
		Card card2 = new Card(eSuit.HEARTS, eRank.TWO, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.FIVE, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card7 = new Card(eSuit.DIAMONDS, eRank.TWO, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 30);
		
	}
	
	@Test
	public void TestOnePair1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.FIVE, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.THREE, 1 );
		Card card7 = new Card(eSuit.CLUBS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 20);
		
	}
	
	@Test
	public void TestOnePair2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.THREE, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.THREE, 1 );
		Card card7 = new Card(eSuit.CLUBS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 20);
		
	}
	
	@Test
	public void TestOnePair3() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.EIGHT, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.KING, 1 );
		Card card7 = new Card(eSuit.CLUBS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 20);
		
	}
	
	@Test
	public void TestHightCard1() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.CLUBS, eRank.JACK, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.EIGHT, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.SPADES, eRank.THREE, 1 );
		Card card7 = new Card(eSuit.CLUBS, eRank.KING, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertTrue(winning_hand.getHandStrength() == 10);
		
	}
	
	@Test
	public void TestHighCard2() {
		
		//need to add cards to hands and com_cards
		//all cards are labeled with 1.png
		Card card1 = new Card(eSuit.HEARTS, eRank.FIVE, 1 );
		Card card2 = new Card(eSuit.DIAMONDS, eRank.QUEEN, 1 );
		Card card3 = new Card(eSuit.SPADES, eRank.TWO, 1 );
		Card card4 = new Card(eSuit.HEARTS, eRank.JACK, 1 );
		Card card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, 1 );
		Card card6 = new Card(eSuit.CLUBS, eRank.THREE, 1 );
		Card card7 = new Card(eSuit.CLUBS, eRank.TEN, 1 );
		
		
		com_cards.add(card1);
		com_cards.add(card2);
		com_cards.add(card3);
		com_cards.add(card4);
		com_cards.add(card5);
		th_hand.AddCardToHand(card6);
		th_hand.AddCardToHand(card7);
		
		
		
		winning_hand = Hand.holdemPicker(th_hand, com_cards);
		assertFalse(winning_hand.getHandStrength() == 20);
		
	}
	
	
}