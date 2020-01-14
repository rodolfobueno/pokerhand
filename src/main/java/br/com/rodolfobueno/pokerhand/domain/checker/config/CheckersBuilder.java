package br.com.rodolfobueno.pokerhand.domain.checker.config;

import br.com.rodolfobueno.pokerhand.domain.checker.RoyalFlushChecker;
import br.com.rodolfobueno.pokerhand.domain.checker.StraightFlushChecker;

public class CheckersBuilder {

  public Checker build() {
    StraightFlushChecker straightFlushChecker = new StraightFlushChecker();

    RoyalFlushChecker royalFlushChecker = new RoyalFlushChecker();
    royalFlushChecker.setNext(straightFlushChecker);

    return royalFlushChecker;
  }

}
