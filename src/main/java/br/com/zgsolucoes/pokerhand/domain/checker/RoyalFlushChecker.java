package br.com.zgsolucoes.pokerhand.domain.checker;

import java.util.List;

import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.Result;
import br.com.zgsolucoes.pokerhand.domain.rule.RoyalFlushRule;
import br.com.zgsolucoes.pokerhand.domain.rule.Rule;

public class RoyalFlushChecker extends AbstractChecker {

	@Override
	public Result check(List<Card> cardsHand, List<Card> cardsAnotherHand) {
		Rule royal = new RoyalFlushRule();
		boolean royalForThis = royal.match(cardsHand);
		boolean royalForAnother = royal.match(cardsAnotherHand);
		if (royalForThis && royalForAnother) {
			return Result.DRAW;
		} else if (royalForThis) {
			return Result.WIN;
		} else if (royalForAnother) {
			return Result.LOSS;
		}
		return getNextChecker().check(cardsHand, cardsAnotherHand);
	}

}
