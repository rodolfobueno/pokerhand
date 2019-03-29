package br.com.zgsolucoes.pokerhand.domain.checker;

import br.com.zgsolucoes.pokerhand.domain.checker.config.BaseChecker;
import br.com.zgsolucoes.pokerhand.domain.rule.StraightFlushRule;
import br.com.zgsolucoes.pokerhand.domain.rule.config.Rule;

public class StraightFlushChecker extends BaseChecker {

  @Override
  public Rule getRule() {
    return new StraightFlushRule();
  }
  
}
