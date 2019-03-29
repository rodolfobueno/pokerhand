package br.com.zgsolucoes.pokerhand.domain.checker;

import br.com.zgsolucoes.pokerhand.domain.checker.config.BaseChecker;
import br.com.zgsolucoes.pokerhand.domain.rule.RoyalFlushRule;
import br.com.zgsolucoes.pokerhand.domain.rule.config.Rule;

public class RoyalFlushChecker extends BaseChecker {

  @Override
  public Rule getRule() {
    return new RoyalFlushRule();
  }

}
