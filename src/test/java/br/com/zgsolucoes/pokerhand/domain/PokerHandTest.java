package br.com.zgsolucoes.pokerhand.domain;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PokerHandTest extends TestCase {

  public PokerHandTest(String testName) {
    super(testName);
  }

  public static TestSuite suite() {
    return new TestSuite(PokerHandTest.class);
  }
  
  public void testPokerHand_FirstPdf() {
    Result result = new PokerHand("9C TC JC QC KC").compareWith(new PokerHand("9C 9H 5C 5H AC"));
    assertSame(Result.WIN, result);
  }
  
  public void testPokerHand_SecondPdf() {
    Result result = new PokerHand("TC TH 5C 5H KH").compareWith(new PokerHand("9C 9H 5C 5H AC"));
    assertSame(Result.WIN, result);
  }
  
  public void testPokerHand_ThreePdf() {
    Result result = new PokerHand("TS TD KC JC 7C").compareWith(new PokerHand("JS JC AS KC TD"));
    assertSame(Result.LOSS, result);
  }
  
  public void testPokerHand_FourPdf() {
    Result result = new PokerHand("7H 7C QC JS TS").compareWith(new PokerHand("7D 7C JS TS 6D"));
    assertSame(Result.WIN, result);
  }
  
  public void testPokerHand_FivePdf() {
    Result result = new PokerHand("5S 5D 8C 7S 6H").compareWith(new PokerHand("7D 7S 5S 5D JS"));
    assertSame(Result.LOSS, result);
  }
  
  public void testPokerHand_SixPdf() {
    Result result = new PokerHand("AS AD KD 7C 3D").compareWith(new PokerHand("AD AH KD 7C 4S"));
    assertSame(Result.LOSS, result);
  }
  
  public void testRoyalFlushWin_SevenPdf() {
    Result result = new PokerHand("TS JS QS KS AS").compareWith(new PokerHand("AC AH AS AS KS"));
    assertSame(Result.WIN, result);
  }
  
  public void testRoyalFlushWin_EightPdf() {
    Result result = new PokerHand("TS JS QS KS AS").compareWith(new PokerHand("TC JS QC KS AC"));
    assertSame(Result.WIN, result);
  }

  public void testRoyalFlushWin_NinePdf() {
    Result result = new PokerHand("TS JS QS KS AS").compareWith(new PokerHand("QH QS QC AS 8H"));
    assertSame(Result.WIN, result);
  }
  
  public void testPokerHand_TenPdf() {
    Result result = new PokerHand("AC AH AS AS KS").compareWith(new PokerHand("TC JS QC KS AC"));
    assertSame(Result.WIN, result);
  }

  public void testRoyalFlushDraw_ThirtyThree() {
    Result result = new PokerHand("TH JH QH KH AH").compareWith(new PokerHand("TC JC QC KC AC"));
    assertSame(Result.DRAW, result);
  }


}
