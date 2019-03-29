package br.com.zgsolucoes.pokerhand.domain.rule;

import java.util.Arrays;
import java.util.List;

import br.com.zgsolucoes.pokerhand.builder.CardBuilder;
import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.CardNumber;
import br.com.zgsolucoes.pokerhand.domain.CardType;
import br.com.zgsolucoes.pokerhand.domain.rule.RoyalFlushRule;
import br.com.zgsolucoes.pokerhand.domain.rule.config.Rule;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RoyalFlushTest extends TestCase {

  public RoyalFlushTest(String testName) {
    super(testName);
  }

  public static TestSuite suite() {
    return new TestSuite(RoyalFlushTest.class);
  }

  public void testValid() {
    Rule c = new RoyalFlushRule();
    List<Card> cards = CardBuilder.create(Arrays.asList(CardNumber.T, CardNumber.J, CardNumber.Q,
      CardNumber.K, CardNumber.A), CardType.C);

    assertTrue(c.match(cards));
  }

  public void testInvalidNumber() {
    Rule c = new RoyalFlushRule();
    List<Card> cards = CardBuilder.create(Arrays.asList(CardNumber.A, CardNumber.J, CardNumber.Q,
      CardNumber.K, CardNumber.A), CardType.C);

    assertFalse(c.match(cards));
  }

  public void testCorrectSequenceButInvalidType() {
    Rule c = new RoyalFlushRule();
    List<Card> cards = CardBuilder.create(Arrays.asList(CardNumber.T, CardNumber.J, CardNumber.Q,
      CardNumber.K), CardType.C);
    cards.add(CardBuilder.create(CardNumber.A, CardType.D));

    assertFalse(c.match(cards));
  }

}
