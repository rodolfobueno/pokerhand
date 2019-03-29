package br.com.zgsolucoes.pokerhand.domain.rule.config;

import java.util.List;

import br.com.zgsolucoes.pokerhand.domain.Card;

public interface Rule {

  boolean match(List<Card> cards);

}
