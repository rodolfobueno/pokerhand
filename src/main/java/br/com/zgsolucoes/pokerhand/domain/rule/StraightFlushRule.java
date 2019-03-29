package br.com.zgsolucoes.pokerhand.domain.rule;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.CardType;
import br.com.zgsolucoes.pokerhand.domain.rule.config.Rule;

public class StraightFlushRule implements Rule {

  @Override
  public boolean match(List<Card> cards) {
    cards.sort((Card o1, Card o2) -> o1.getNumber().getStrength() - o2.getNumber().getStrength());
    AtomicInteger firstStrengthValue = new AtomicInteger(cards.get(0).getNumber().getStrength());
    CardType typeOffAll = cards.get(0).getType();
    try {
      cards.forEach(c -> {
        if (c.getNumber().getStrength() != firstStrengthValue.getAndIncrement() || !c.getType().equals(typeOffAll)) {
          throw new IllegalArgumentException();
        }
      });
      return true;
    } catch (Exception e) {
      return false;
    }

  }
}
