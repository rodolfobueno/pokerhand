package br.com.zgsolucoes.pokerhand.domain;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PokerHandTest extends TestCase {
	
	public PokerHandTest(String testName) {
		super(testName);
	}

    public static TestSuite suite()
    {
		return new TestSuite(PokerHandTest.class);
    }

	public void testHandWinRoyalFlush() {
		PokerHand pokerHand = new PokerHand("10C JC QC KC AC");
		Result result = pokerHand.compareWith(new PokerHand("10D JC QC KC AC"));
		
		assertSame(Result.WIN, result);
	}
	
	public void testHandLossRoyalFlush() {
		PokerHand pokerHand = new PokerHand("7C 2C QC KC AC");
		Result result = pokerHand.compareWith(new PokerHand("10C JC QC KC AC"));
		
		assertSame(Result.LOSS, result);
	}

}
