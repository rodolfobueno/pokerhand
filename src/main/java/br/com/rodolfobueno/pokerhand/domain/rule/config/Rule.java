package br.com.rodolfobueno.pokerhand.domain.rule.config;

import java.util.List;

import br.com.rodolfobueno.pokerhand.domain.Card;

public interface Rule {

  boolean match(List<Card> cards);

}
