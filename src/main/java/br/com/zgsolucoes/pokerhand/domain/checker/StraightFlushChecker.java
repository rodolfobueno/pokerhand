package br.com.zgsolucoes.pokerhand.domain.checker;

import java.util.List;

import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.Result;

public class StraightFlushChecker extends AbstractChecker {

	@Override
	public Result check(List<Card> cardsHand, List<Card> cardsAnotherHand) {
		return Result.DRAW;
	}

}
