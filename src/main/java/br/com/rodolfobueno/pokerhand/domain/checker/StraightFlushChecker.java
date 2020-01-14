package br.com.rodolfobueno.pokerhand.domain.checker;

import br.com.rodolfobueno.pokerhand.domain.checker.config.BaseChecker;
import br.com.rodolfobueno.pokerhand.domain.rule.StraightFlushRule;
import br.com.rodolfobueno.pokerhand.domain.rule.config.Rule;

public class StraightFlushChecker extends BaseChecker {

  @Override
  public Rule getRule() {
    return new StraightFlushRule();
  }
  
}
