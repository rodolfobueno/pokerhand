package br.com.zgsolucoes.pokerhand.domain.rule;

import java.util.List;

import br.com.zgsolucoes.pokerhand.domain.Card;

public class StraightFlushRule implements Rule {

	@Override
	public boolean match(List<Card> cards) {
		return false;
	}

}
