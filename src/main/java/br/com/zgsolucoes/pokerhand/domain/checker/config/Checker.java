package br.com.zgsolucoes.pokerhand.domain.checker.config;

import java.util.List;

import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.Result;
import br.com.zgsolucoes.pokerhand.domain.rule.config.Rule;

public interface Checker {
  
  Rule getRule();

  void setNext(Checker checker);

  Result check(List<Card> cardsHand, List<Card> cardsAnotherHand);

}
