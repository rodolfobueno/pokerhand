package br.com.rodolfobueno.pokerhand.domain.checker.config;

import java.util.List;

import br.com.rodolfobueno.pokerhand.domain.Card;
import br.com.rodolfobueno.pokerhand.domain.Result;
import br.com.rodolfobueno.pokerhand.domain.rule.config.Rule;

public abstract class BaseChecker implements Checker {

  private Checker next;

  @Override
  public Result check(List<Card> cardsHand, List<Card> cardsAnotherHand) {
    Rule rule = getRule();
    boolean isWinForMandatoryHand = rule.match(cardsHand);
    boolean isWinForAnotherHand = rule.match(cardsAnotherHand);
    if (isWinForMandatoryHand && isWinForAnotherHand) {
      return Result.DRAW;
    } else if (isWinForMandatoryHand) {
      return Result.WIN;
    } else if (isWinForAnotherHand) {
      return Result.LOSS;
    }
    if (next == null) {
      throw new IllegalAccessError("Regra não implementada.");
    }
    return next.check(cardsHand, cardsAnotherHand);
  }

  @Override
  public void setNext(Checker checker) {
    next = checker;
  }

}
