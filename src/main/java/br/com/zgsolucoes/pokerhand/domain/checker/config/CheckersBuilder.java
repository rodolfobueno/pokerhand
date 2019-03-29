package br.com.zgsolucoes.pokerhand.domain.checker.config;

import br.com.zgsolucoes.pokerhand.domain.checker.RoyalFlushChecker;
import br.com.zgsolucoes.pokerhand.domain.checker.StraightFlushChecker;

public class CheckersBuilder {

  public Checker build() {
    StraightFlushChecker straightFlushChecker = new StraightFlushChecker();

    RoyalFlushChecker royalFlushChecker = new RoyalFlushChecker();
    royalFlushChecker.setNext(straightFlushChecker);

    return royalFlushChecker;
  }

}
