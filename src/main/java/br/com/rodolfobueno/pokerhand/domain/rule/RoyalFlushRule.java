package br.com.rodolfobueno.pokerhand.domain.rule;

import java.util.ArrayList;
import java.util.List;

import br.com.rodolfobueno.pokerhand.domain.Card;
import br.com.rodolfobueno.pokerhand.domain.CardNumber;
import br.com.rodolfobueno.pokerhand.domain.CardType;
import br.com.rodolfobueno.pokerhand.domain.rule.config.Rule;

public class RoyalFlushRule implements Rule {

  @Override
  public boolean match(List<Card> cards) {
    CardType typeForAll = cards.get(0).getType();
    if (cards.stream().allMatch(c -> c.getType() == typeForAll)) {
      List<CardNumber> numbers = getCorrectSequence();
      cards.stream().forEach(c -> numbers.removeIf(n -> n == c.getNumber()));
      return numbers.isEmpty();
    }
    return false;
  }

  private List<CardNumber> getCorrectSequence() {
    List<CardNumber> numbers = new ArrayList<CardNumber>();
    numbers.add(CardNumber.T);
    numbers.add(CardNumber.J);
    numbers.add(CardNumber.Q);
    numbers.add(CardNumber.K);
    numbers.add(CardNumber.A);
    return numbers;
  }

}
