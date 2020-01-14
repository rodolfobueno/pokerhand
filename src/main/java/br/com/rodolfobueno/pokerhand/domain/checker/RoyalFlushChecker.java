package br.com.rodolfobueno.pokerhand.domain.checker;

import br.com.rodolfobueno.pokerhand.domain.checker.config.BaseChecker;
import br.com.rodolfobueno.pokerhand.domain.rule.RoyalFlushRule;
import br.com.rodolfobueno.pokerhand.domain.rule.config.Rule;

public class RoyalFlushChecker extends BaseChecker {

  @Override
  public Rule getRule() {
    return new RoyalFlushRule();
  }

}
